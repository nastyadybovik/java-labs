package by.bsu.exception;

/**
 * Created by dom on 17.04.2015.
 */
public class MarkException extends AbiturientException {
    public MarkException(){
    }
    public MarkException(String message, Throwable cause){
        super(message, cause);
    }
    public MarkException(String message){
        super(message);
    }
    public MarkException(Throwable cause){
        super(cause);
    }
}
