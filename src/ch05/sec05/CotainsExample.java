package ch05.sec05;

public class CotainsExample {
    public static void main(String[] args) {
        String subject = "자바 프로그램";

        int location = subject.indexOf("프로그램");
        System.out.println("location = " + location);
        String substring = subject.substring(location);
        System.out.println("substring = " + substring);

        location = subject.indexOf("자바");
        if(location 1= -1){
            System.out.println("자바와 관련된 책이 아닌군요");
        }else{
            System.out.println("자바와 관련된 책이 맞군요");
        }

        boolean result = subject.contains("자바");
        if(result){
            System.out.println("자바와 관련된 책이 아닌군요");
        }else{
            System.out.println("자바와 관련된 책이 맞군요");
        }
    }
}
