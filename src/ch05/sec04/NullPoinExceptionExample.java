package ch05.sec04;

public class NullPoinExceptionExample {
    public static void main(String[] args) {
        int[] intArray = null;
        //intArray[0] = 10; //NullPoinException

        String str = null;
//        System.out.print("총 문자 수: " + str.length()); NullPoinException 에러
    }
}
