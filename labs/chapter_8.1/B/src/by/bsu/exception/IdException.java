package by.bsu.exception;

/**
 * Created by dom on 17.04.2015.
 */
public class IdException extends AbiturientException {
    public IdException(){}
    public IdException(String message, Throwable cause){
        super(message, cause);
    }
    public IdException(String message){
        super(message);
    }
    public IdException(Throwable cause){
        super(cause);
    }
}
