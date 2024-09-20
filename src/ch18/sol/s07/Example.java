package ch18.sol.s07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example {
    private static int lineNumber = 0;
    public static void main(String[] args) {
        String path = "src/ch18/sol/s07/Example.java";
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            try (fr; br;){
                //int rowNumber = 0;
                //String rowData;

                br.lines()
                        .map(s-> "%4d : %s".formatted((++lineNumber),s))
                        .forEach(System.out::println);

               /* while (true){
                    rowData = br.readLine();
                    if(rowData == null) break;
                    System.out.println(rowNumber+":"+rowData);
                    rowNumber++;
                }*/
                br.close();
                fr.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
