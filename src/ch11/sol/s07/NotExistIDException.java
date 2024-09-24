package ch11.sol.s07;

public class NotExistIDException extends Exception {
    public NotExistIDException(){}
    public NotExistIDException(String message){
        super(message);
    }
}
