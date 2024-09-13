package ch11.lectrue.p02try;

public class C04Finally {
    public static void main(String[] args) {
        try {
            int[] a = {3,4};
            int b = a[3]; //예외 발생 가능

            //try 블럭내의 다음 코드
            System.out.println("b = " + b);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //finally 블럭내의 코드
            // :  예외 발생 없이 실행
            System.out.println("꼭 실행되어야 하는 코드들");
        }

        //try 블럭 밖의 코드
        System.out.println("다음 실행 흐름..");
    }
}
