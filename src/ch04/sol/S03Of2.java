package ch04.sol;

public class S03Of2 {
    public static void main(String[] args) {
        //3의 배수 출력 for 버전 총합
        int sum = 0;
        for (int i = 0; i < 100; i+=3) {
            sum+=i;
        }
        System.out.println("sum = " + sum);
    }
}
