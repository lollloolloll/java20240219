package ch18.lecture.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class P787 {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("temp/test1.db"); // 올바른 파일 경로로 수정
            int data;
            while ((data = is.read()) != -1) { // 바이트를 읽어들여서 루프 진행
                System.out.print((char)data); // 바이트를 문자로 변환하여 출력
            }
            is.close();
        } catch (FileNotFoundException e) {
            System.err.println("파일을 찾을 수 없습니다: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("파일을 읽는 도중 오류가 발생했습니다: " + e.getMessage());
        }
    }
}
