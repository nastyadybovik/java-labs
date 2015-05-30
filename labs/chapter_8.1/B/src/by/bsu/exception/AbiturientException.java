package by.bsu.exception;

/**
 * Created by dom on 22.05.2015.
 */
public class AbiturientException extends Exception {
    public AbiturientException(){}
    public AbiturientException(String message, Throwable cause){
        super(message, cause);
    }
    public AbiturientException(String message){
        super(message);
    }
    public AbiturientException(Throwable cause){
        super(cause);
    }
}
