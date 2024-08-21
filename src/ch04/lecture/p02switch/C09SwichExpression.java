package ch04.lecture.p02switch;

public class C09SwichExpression {
    public static void main(String[] args) {
        //switch expression


        //switch expression 사용전
        String message;

        String grade = "A";

        switch (grade){
            case "A","a"->{
                System.out.println("우수 등급");
            }
            case "B","b" ->{
                System.out.println("보통등급");
            }
            case "C","c" ->{
                System.out.println("등급 미만");
            }
        }
        //System.out.println("message = " + message);
    }
}
