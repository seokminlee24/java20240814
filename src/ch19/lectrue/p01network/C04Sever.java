package ch19.lectrue.p01network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

public class C04Sever {
    public static void main(String[] args) throws Exception {
        // client 가 보낸 파일 받기
        AtomicInteger number = new AtomicInteger(0);

        ServerSocket serverSocket = new ServerSocket(9999);

        while (true) {
            System.out.println("파일 받기를 기다리는 중..");
            Socket socket = serverSocket.accept();
            Thread t = new Thread(() -> {
                try {
                    InputStream is = socket.getInputStream();
                    BufferedInputStream bis = new BufferedInputStream(is);

                    int n = number.incrementAndGet();
                    String name = "C:/Temp/file" + n + ".jpg";
                    FileOutputStream os = new FileOutputStream(name);
                    BufferedOutputStream bos = new BufferedOutputStream(os);

                    try (bos; os; bis; is; socket;) {
                        byte[] data = new byte[1000];
                        int length = 0;

                        while ((length = bis.read(data)) != -1) {
                            bos.write(data, 0, length);
                        }
                        bos.flush();
                        System.out.println("파일 받기 완료!!");

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });

            t.start();
        }

    }
}
