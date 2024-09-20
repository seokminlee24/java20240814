package ch18.lectrue.p06buffer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C01Buffered {
    public static void main(String[] args) throws IOException {
        String name = "C:/Temp/output61.txt";
        OutputStream os = new FileOutputStream(name);

        byte[] data = new byte[100];
        
        long start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            os.write(data);
        }
        long end = System.nanoTime();
        
        long time = end - start;
        System.out.println("time = " + time);

        os.close();
    }
}
