package ch19.lectrue.p01network.c01computer1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class C01Computer1 {
    public static void main(String[] args) throws Exception {
        //sever : 서버가 먼저 보내야 한다.
        ServerSocket serverSocket = new ServerSocket(9999);

        //Socket
        Socket socket = serverSocket.accept(); // client 의 연락을 기다림

        OutputStream os = socket.getOutputStream();

        try (os; serverSocket; socket){
            os.write('Z');
            os.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
