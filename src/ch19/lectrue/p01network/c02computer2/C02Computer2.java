package ch19.lectrue.p01network.c02computer2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class C02Computer2 {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("172.30.1.73", 9999);

        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        try (br; isr; is; socket){
            String line = br.readLine();
        System.out.println("line = " + line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
