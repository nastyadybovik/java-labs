package by.bsu.exception;

/**
 * Created by dom on 18.04.2015.
 */
public class SetAbiturientException extends AbiturientException {
    public SetAbiturientException(){
    }
    public SetAbiturientException(String message, Throwable cause){
        super(message, cause);
    }
    public SetAbiturientException(String message){
        super(message);
    }
    public SetAbiturientException(Throwable cause){
        super(cause);
    }
}
