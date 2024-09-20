package ch18.lectrue.p04reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class C01Reader {
    public static void main(String[] args) {
        //Reader : 문자전용 InputSteam

        String name = "C:/Temp/Output33";
        try {
            Reader reader = new FileReader(name);
            try (reader){
                int c1 = reader.read();
                char c2 = (char) c1;
                System.out.println("c2 = " + c2);
                reader.close();
             }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
