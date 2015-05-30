package by.bsu.exception;

/**
 * Created by dom on 17.04.2015.
 */
public class NameException extends AbiturientException {
    public NameException(){
    }
    public NameException(String message, Throwable cause){
        super(message, cause);
    }
    public NameException(String message){
        super(message);
    }
    public NameException(Throwable cause){
        super(cause);
    }
}
