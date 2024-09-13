package ch11.lectrue.p04cheaked;

public class C01UnCheckedException {
    public static void main(String[] args) {
        //Unchecked exception (runtime exception, 실행 예외)
        //: RuntimeException 을 상속받은 클래스드들의 객체
        //컴파일러가 예외 처리 코드를 작성 했는 지 체크하지 않음
        try {
            Integer.parseInt("30");
        }catch (NumberFormatException e){
            e.printStackTrace();
        }

        //checked exception(일반 예외)
        //: RuntimeException 을 상속받은 않은 클래스드들의 객체
        //컴파일러가 예외 처리 코드를 작성 했는 지 체크함

    }
}
