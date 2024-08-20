package ch03.sec10;

public class AssignmentOpreratorExample {
    public static void main(String[] args) {
        int result = 0;
        result += 10; //10
        System.out.println("result = " + result);
        result -= 5; //10-5
        System.out.println("result = " + result);
        result *= 3; //5*3
        System.out.println("result = " + result);
        result /= 5; //15/5
        System.out.println("result = " + result);
        result %= 3; //0 3%3
        System.out.println("result = " + result);
    }
}
