package ch04.sol;

public class S03Of1 {
    public static void main(String[] args) {
        //3의 배수 출력 while 버전 총합
        int i = 0;
        
        int sum = 0;

        while (i<=100){
           sum += i;
            i+=3;
        }
        System.out.println("sum = " + sum);
    }
}
