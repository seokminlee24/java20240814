package ch18.lectrue.p02input;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class C01InputString {
    public static void main(String[] args) {
        String name = "C:/Temp/output6.txt";
        //InputStream : 입력 스트림

        try (InputStream is = new FileInputStream(name);){
            int r1 = is.read(); //1바이트 씩 읽기
            System.out.println("r1 = " + r1);
            System.out.println(is.read());
            System.out.println(is.read());
            System.out.println(is.read());
            System.out.println(is.read());
            System.out.println(is.read());
            System.out.println(is.read());
            System.out.println(is.read());
            System.out.println(is.read());
            System.out.println(is.read());
            System.out.println(is.read());
            System.out.println(is.read());
            System.out.println(is.read());
            System.out.println(is.read()); // 더 이상 읽을 내용을 없을 떄 -1을 리턴
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
