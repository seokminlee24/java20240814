package ch04.lecture.p02switch;

public class C10SwichExpression {
    public static void main(String[] args) {
        //switch expression


        //switch expression 사용전


        String grade = "A";

        String message = switch (grade){
            case "A","a"-> "우수 등급";
            case "B","b" -> "보통등급";

            case "C","c" -> "등급 미만";
            default -> ""; //생략불가
        };
        System.out.println("message = " + message);
    }
}
