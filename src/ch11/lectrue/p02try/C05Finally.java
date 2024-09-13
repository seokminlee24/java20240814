package ch11.lectrue.p02try;

public class C05Finally {
    public static void main(String[] args) {
        try {
            int[] arr = {3,4};
            int a = arr[3];

            System.out.println("a = " + a);
            return;
            //System.out.println("실행안됨");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            // 심지어 리턴 되도록 실행됨
            System.out.println("꼭 실행되어야하는 코드");
        }

        System.out.println("다음 실행 흐름...");
    }
}
