package ch03.soultion;

public class S02 {
    public static void main(String[] args) {
        int score = 85;
        String result = (!(score>90)) ? "가" : "나";
        System.out.println("result = " + result); //가
    }
}
