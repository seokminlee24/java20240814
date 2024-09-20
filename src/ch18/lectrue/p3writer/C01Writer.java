package ch18.lectrue.p3writer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C01Writer {
    public static void main(String[] args) {
        String name = "C:/Temp/output31.txt";

        try {
            OutputStream os = new FileOutputStream(name);
            try (os){
                os.write(65); //1바이트 쓰기 A
                os.write(66); //1바이트 쓰기 B
                os.write('C'); //1바이트 쓰기 C

                os.write(236); //1바이트 쓰기 B x
                os.write(149); //1바이트 쓰기 B x
                os.write(236); //1바이트 쓰기 B x

                os.write('안');
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
