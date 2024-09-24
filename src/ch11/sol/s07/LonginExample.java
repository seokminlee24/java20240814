package ch11.sol.s07;

public class LonginExample {
    public static void main(String[] args) {
        try {
            login("blue","12345");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
        System.out.println("blue" +", " + "12345");
        }

        try {
            login("blue","54321");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void login(String id, String password)throws NotExistIDException,WrongPasswordExistIDException{
        if (!id.equals("blue")){
            throw new NotExistIDException("아이디가 존재 하지 않습니다.");
        }

        if (!password.equals("12345")){
            throw new WrongPasswordExistIDException("패스워드가 틀립니다.");
        }
    }
}
