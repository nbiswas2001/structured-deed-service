package uk.gov.ros.lr.deed.structured.interpreter.lexers;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import uk.gov.ros.lr.deed.structured.model.parserdata.ParserData;
import uk.gov.ros.lr.deed.structured.interpreter.lexers.seg1.Seg1Lexer;
import uk.gov.ros.lr.deed.structured.interpreter.lexers.seg1.Seg1Parser;
import uk.gov.ros.lr.deed.structured.model.StructuredContent;
import uk.gov.ros.lr.deed.structured.model.parserdata.ParserData.ParseErrorEnum;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

public class Seg1ParseController {

    //-------------------------------------------------------
    public static StructuredContent parse(String txt, ParserData data) {

        CodePointCharStream input = CharStreams.fromString(txt);
        Lexer lexer = new Seg1Lexer(input);
        lexer.removeErrorListener(ConsoleErrorListener.INSTANCE); //to prevent error outputs to console
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Seg1Parser parser = new Seg1Parser(tokens);
        ErrorListener errorListener = new ErrorListener();
        parser.addErrorListener(errorListener);
        parser.removeErrorListener(ConsoleErrorListener.INSTANCE); //to prevent error outputs to console

        Seg1Parser.BlockContext ctx = null;
        try {
            //Invoke parser
            ctx = parser.block();

        } catch (Exception e) {
            throw new RuntimeException("Failed to parse deed text - "+txt, e);
        }
        if (parser.getNumberOfSyntaxErrors() > 0) {
            data.setError(ParseErrorEnum.grammar);
            data.setErrorMessages(errorListener.getErrors().stream().map(syntaxErr -> syntaxErr.toString()).collect(Collectors.toList()));
        }

        StructuredContent structCont = null;
        if (data.getError() == ParseErrorEnum.none) {

            structCont = new StructuredContent(LocalDateTime.now(), false);
            ParseTreeWalker walker = new ParseTreeWalker();
            Seg1ListenerImpl processor = new Seg1ListenerImpl(structCont, data.getPartyNames());
            try {
                walker.walk(processor, ctx);
            } catch (Exception e) {
                data.setError(ParseErrorEnum.parseTree);
                throw new RuntimeException("Failed to load model from parse tree", e);
            }
        }

        return structCont;
    }

}
