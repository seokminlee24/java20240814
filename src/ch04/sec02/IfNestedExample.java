package ch04.sec02;

public class IfNestedExample {
    public static void main(String[] args) {
        //100 >= score >= 81
        int score = (int)(Math.random()*20)+ 81;
        System.out.println("score = " + score);

        String  grade;

        if (score >= 90) {
            if (score >= 90) {
                grade = "A+";
            }else {
                grade = "A";
            }
        }else{
            if (score >= 85) {
                grade = "B++";
            }else {
                grade = "B";
            }
        }
        System.out.println("grade = " + grade);
    }
}
