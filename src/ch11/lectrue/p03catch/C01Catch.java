package ch11.lectrue.p03catch;

public class C01Catch {
    public static void main(String[] args) {
        try {
            //exception 발생 가능 코드
            int[] arr = {1,0};
            int a = 3 / arr[0];
            int b = 5 / arr[1];
            int c = 7 / arr[2];

            System.out.println(a + b + c);
        }catch (ArithmeticException e){
        e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
