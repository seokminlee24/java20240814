package ch04.lecture.p02switch;

public class C11SwitchExpression {
    public static void main(String[] args) {
        // 1 2 3
        int n = (int) (Math.random()*4)+1;

        // 1 -> 일등급
        // 2 -> 2등급
        // 3 -> 3등급
        // 4 -> 그외 등급

        System.out.println(switch (n){
            case 1 -> "일";
            case 2 -> "이";
            case 3 -> "삼";
            default -> "그외";
        }+ "등급");
    }
}
