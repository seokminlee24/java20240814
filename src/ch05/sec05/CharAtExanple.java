package ch05.sec05;

public class CharAtExanple {
    public static void main(String[] args) {
        String ssn = "9506241230123";
        char sex = ssn.charAt(6);
        System.out.println(sex); //1
        switch (sex){
            case '1','3' ->{
                System.out.println("남자 입니다.");
            }
            case '2','4' ->{
                System.out.println("여자입니다.");
            }
        }
    }
}
