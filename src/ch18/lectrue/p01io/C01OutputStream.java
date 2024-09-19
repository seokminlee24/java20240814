package ch18.lectrue.p01io;

import java.io.*;

public class C01OutputStream {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Temp\\output1.txt";


        //출력 스트림
        OutputStream os = new FileOutputStream(fileName);

        os.write(200); //1바이트
        os.write(100); //1바이트

        System.out.println("종료......");
    }
}
