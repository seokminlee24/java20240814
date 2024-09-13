package ch11.sol.s06;

public class Example {
    public static void main(String[] args) {
        String[] strArray = {"10", "2a"};
        int value= 0;
        for (int i = 0; i <= strArray.length ; i++) {
            try {
                value = Integer.parseInt(strArray[i]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("인덱스 초과 : " + e.getMessage());
            }catch (NumberFormatException e){
                System.out.println("숫자 변환할 수 없음 :" + e.getMessage());
            }finally {
                System.out.println(value);
            }
        }
    }
}
