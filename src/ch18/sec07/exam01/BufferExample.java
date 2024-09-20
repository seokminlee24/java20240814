package ch18.sec07.exam01;

import java.io.*;

public class BufferExample {
    public static void main(String[] args) throws Exception {
    //입출력 스트림 생성
    String originalFilePath1 = ("C:/Temp/지구온난화.jpg");
    String targetFilePath1 = "C:/temp/지구온난화.jpg";
    FileInputStream fis = new FileInputStream(originalFilePath1);
    FileOutputStream fos = new FileOutputStream(targetFilePath1);

    try (fis; fos){
        long nonBufferTime = copy(fis,fos);
        System.out.println("버퍼 미사용:\t" + nonBufferTime + " ns");
    }

    String originalFilePath2 = ("C:/Temp/지구온난화2.jpg");
    String targetFilePath2 = "C:/temp/지구온난화2.jpg";
    FileInputStream fis2 = new FileInputStream(originalFilePath2);
    FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
    BufferedInputStream bis = new BufferedInputStream(fis2);
    BufferedOutputStream bos = new BufferedOutputStream(fos2);

    try (bis; bos){
        long BufferTime = copy(bis,bos);
        System.out.println("버퍼 사용:\t" + BufferTime + " ns");
    }

    fis.close();
    fos.close();
    bis.close();
    bos.close();

}

private static long copy(InputStream is, OutputStream os) throws IOException{
    long start = System.nanoTime();
    while (true) {
        int data = is.read();

        if (data == -1) {
            break;
        }
        os.write(data);

    }
    os.flush();
    long end = System.nanoTime();

    return (end - start);

}
}
