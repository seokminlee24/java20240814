package ch19.lectrue.p01network.c01computer1;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class C01Computer2 {
    public static void main(String[] args) throws Exception {
        //client : 서버가 먼저 보내지 않으면 값을 가져오지 못한다.
        //Socket
        Socket socket = new Socket("172.30.1.73", 9999); //terminal : ipconfig  IPv4 주소 확인


        InputStream is = socket.getInputStream();
        try (is; socket){
            int data = is.read();
            System.out.println((char) data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
