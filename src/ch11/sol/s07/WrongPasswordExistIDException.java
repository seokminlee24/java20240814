package ch11.sol.s07;

public class WrongPasswordExistIDException extends Exception{
    public WrongPasswordExistIDException(){}
    public WrongPasswordExistIDException(String message){
        super(message);
    }
}
