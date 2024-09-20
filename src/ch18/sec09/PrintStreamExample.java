package ch18.sec09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintStreamExample {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("C:/Temp/printstream.txt");
        PrintStream ps = new PrintStream(fos);

        ps.print("마치 ");
        ps.println("프린터가 출력하는 것처럼");
        ps.println("데이터를 출력합니다..");

        ps.close();


    }
}
