package ch18.lectrue.p3writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class C03Writer {
    public static void main(String[] args) {
        String name = "C:/Temp/Output33";

        try {
            Scanner sc = new Scanner(System.in);
            Writer writer = new FileWriter(name);

            try (sc; writer){
                while (true){
                    System.out.print("입력>");
                    String line = sc.nextLine();
                    writer.write(line);
                    writer.write("\n");

                    if (line.equals("종료")){
                        break;
                    }
                }
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
