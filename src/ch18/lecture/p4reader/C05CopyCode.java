package ch18.lecture.p4reader;

import java.io.*;
import java.util.Arrays;

public class C05CopyCode {
    public static void main(String[] args) {
        // 소스 파일 경로
        String src = "src/ch18/lecture/p4reader/C05CopyCode.java";
        // 대상 파일 경로
        String des = "temp/C05CopyCode.txt";

        try (
                // 입력 스트림 생성
                InputStream inputStream = new FileInputStream(src);
                // 출력 스트림 생성
                OutputStream outputStream = new FileOutputStream(des)
        ) {
            // 데이터를 읽어올 버퍼 생성
            byte[] buffer = new byte[1024];
            int length;
            // 입력 스트림에서 데이터를 읽어오고 출력 스트림으로 데이터를 씁니다.
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
            System.out.println("파일 복사가 완료되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
