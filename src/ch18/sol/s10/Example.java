package ch18.sol.s10;

import java.io.*;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("원본파일 경로: ");
        String original = sc.nextLine();

        System.out.print("복사파일 경로: ");
        String target = sc.nextLine();

        try {
            File sourceFile = new File(original);
            File copyFile = new File(target);

            // 원본 파일이 존재하는지 확인
            if (!sourceFile.exists()) {
                System.out.println("원본 파일이 존재하지 않습니다.");
                return;
            }

            // 대상 파일 경로의 상위 디렉토리 확인 및 생성
            File dir = copyFile.getParentFile();
            if (!dir.exists()) {
                dir.mkdirs();
            }

            // 파일 복사 진행
            try (FileInputStream fis = new FileInputStream(sourceFile);
                 FileOutputStream fos = new FileOutputStream(copyFile);
                 BufferedInputStream bis = new BufferedInputStream(fis);
                 BufferedOutputStream bos = new BufferedOutputStream(fos)) {

                bis.transferTo(bos);  // InputStream의 데이터를 OutputStream으로 전송
                bos.flush();
            }

            System.out.println("복사 성공");

        } catch (IOException e) {
            System.out.println("파일 복사 중 오류가 발생했습니다: " + e.getMessage());
        }
    }
}
