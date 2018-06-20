package exception;

public class DataFormatException extends Exception {
    
    private FormatExceptionType exceptionType = null;
    
    public enum FormatExceptionType {
        INCORRECT_CHARS_IN_BINARY,INCORRECT_CHARS_IN_DECIMAL,EMPTY_BINARY_VALUE;
    }
    
    
    public DataFormatException(FormatExceptionType exceptionType, String message) {
        super(message);
        this.exceptionType = exceptionType;
    }
}
