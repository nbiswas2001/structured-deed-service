package uk.gov.ros.lr.deed.structured.interpreter.lexers;

import org.antlr.v4.runtime.RecognitionException;

public class SyntaxError {
    public Object offendingSymbol;
    public int lineNum;
    public int charPos;
    public String message;
    public RecognitionException exception;

    //----------------------------------------------------------------------------------------------
    public SyntaxError(Object offendingSymbol, int lineNum, int charPos, String message, RecognitionException exception) {
        this.offendingSymbol = offendingSymbol;
        this.lineNum = lineNum;
        this.charPos = charPos;
        this.message = message;
        this.exception = exception;
    }

    //------------------------------------
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\t- ").append(message).append(", offending symbol = ").append(offendingSymbol);
        return sb.toString();
    }
}
