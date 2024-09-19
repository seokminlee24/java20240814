package ch18.lectrue.p02input;

import java.io.*;

public class C05Copy5 {
    public static void main(String[] args) {
        String original = "C:/Temp/지구온난화.jpg";
        String target = "C:/Temp/지구온난화2.jpg";

        try {
            InputStream is = new FileInputStream(original);
            OutputStream os = new FileOutputStream(target);
            try (is; os;){
                byte[] data = new byte[100];
                int len = 0; // 읽은 바이트 수 저장

                while ((len = is.read(data)) != -1){
                    os.write(data, 0 , len);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
