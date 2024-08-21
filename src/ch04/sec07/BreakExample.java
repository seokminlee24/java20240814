package ch04.sec07;

public class BreakExample {
    public static void main(String[] args) {
        while (true){
        int n = (int) (Math.random()*6)+1;
        System.out.println("n = " + n);
        if (n == 6) {
            break;
        }
      }
        System.out.println("종료");
    }
}
