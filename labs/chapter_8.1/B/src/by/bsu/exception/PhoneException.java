package by.bsu.exception;

/**
 * Created by dom on 17.04.2015.
 */
public class PhoneException extends AbiturientException {
    public PhoneException(){
    }
    public PhoneException(String message, Throwable cause){
        super(message, cause);
    }
    public PhoneException(String message){
        super(message);
    }
    public PhoneException(Throwable cause){
        super(cause);
    }
}
