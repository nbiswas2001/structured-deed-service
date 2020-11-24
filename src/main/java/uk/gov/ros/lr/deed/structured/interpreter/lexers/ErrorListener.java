package uk.gov.ros.lr.deed.structured.interpreter.lexers;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.ArrayList;
import java.util.List;

public class ErrorListener extends BaseErrorListener {

    public List<SyntaxError> getErrors() {
        return errors;
    }

    private List<SyntaxError> errors = new ArrayList<>();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);

        SyntaxError error = new SyntaxError(offendingSymbol, line, charPositionInLine, msg, e);
        errors.add(error);
    }
}
