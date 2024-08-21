package ch04.sol;

public class S04 {
    public static void main(String[] args) {
        while (true){
            int n1 = (int) (Math.random()*6)+1;
            int n2 = (int) (Math.random()*6)+1;
            int result = n1 + n2;
            System.out.println("result = " + result );
            if (result == 5) {
                break;
            }
        }
        System.out.println("종료");
    }
}
