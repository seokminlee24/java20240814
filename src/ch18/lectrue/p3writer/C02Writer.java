package ch18.lectrue.p3writer;

import java.io.*;

public class C02Writer {
    public static void main(String[] args) {
        // 바이트 단위 IO Stream
        //InputStream, OutputSteam

        // 문자 전용 IO Stream
        // Reader, Writer

        String name = "C:/Temp/Output32";
        try {
           Writer writer = new FileWriter(name);
            try(writer){
                writer.write('안');
                writer.write('녕');
                writer.write('A');
                writer.write('A');
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
