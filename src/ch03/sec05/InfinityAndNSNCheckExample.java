package ch03.sec05;

public class InfinityAndNSNCheckExample {
    public static void main(String[] args) {
        int x = 5;
        double y = 0.0;
        double z = x % y; //Infinity
        //double z = x % y;//NaN
        System.out.println(z + 2);

        //알 맞는 코도
        if (Double.isInfinite(z)|| Double.isNaN(z)){
            System.out.println("값 산출 불가"); //값 산출 불가
        }else{
            System.out.println(z + 2);
        }
    }
}
