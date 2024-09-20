package ch18.sec07.exam02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineExample {
    public static void main(String[] args) {
        String path  = "src/ch18/sec07/exam02/ReadLineExample.java";
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            try (fr; br){
                int lineNumber = 1;
                while (true){
                    String str = br.readLine();
                    if (str == null)break;
                    System.out.println(lineNumber + " : " + str);
                    lineNumber++;
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
