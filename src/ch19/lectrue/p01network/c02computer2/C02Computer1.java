package ch19.lectrue.p01network.c02computer2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class C02Computer1 {
    public static void main(String[] args) throws Exception {

        //sever
        ServerSocket serverSocket = new ServerSocket(9999); //포트번호 입력 할것

        //socket
        Socket socket = serverSocket.accept(); // 기다림.....

        OutputStream os= socket.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        try (bw; os; osw; socket; serverSocket){
        bw.write("안녕클라이언트");
        bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
