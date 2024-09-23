package ch19.lectrue.p01network;

import java.io.*;
import java.net.Socket;

public class C04Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("172.30.1.84",9999);
        //Socket socket = new Socket("172.30.1.9",9999);

        OutputStream os = socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(os);

        String fileName = "C:/Temp/강아지.jpg";
        FileInputStream fis = new FileInputStream(fileName);
        BufferedInputStream bis = new BufferedInputStream(fis);

        try (os;bos;fis;bis;socket){
            byte[] data = new byte[1000];
            int len = 0;
            while ((len = bis.read(data))!=-1){
                bos.write(data,0,len);
            }
            bos.flush();

            System.out.println("파일 보내기 완료");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
