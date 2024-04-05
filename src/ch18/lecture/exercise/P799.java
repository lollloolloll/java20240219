package ch18.lecture.exercise;

import java.io.*;

public class P799 {
    public static void main(String[] args) throws Exception {
        write("문자 변환 스트림을 사용합니다");
        String data = read();
        System.out.println(data);
    }

    static void write(String str) throws Exception {
        OutputStream os = new FileOutputStream("temp/test.txt");
        Writer writer = new OutputStreamWriter(os, "UTF-8");
        writer.write(str);
        writer.flush();
        writer.close();
        os.close(); // OutputStream도 닫기
    }

    static String read() throws Exception {
        InputStream is = new FileInputStream("temp/test.txt");
        Reader reader = new InputStreamReader(is, "UTF-8");
        StringBuilder sb = new StringBuilder();
        char[] buffer = new char[1024]; // 읽어들일 버퍼 크기 설정
        int numChars;
        while ((numChars = reader.read(buffer)) != -1) {
            sb.append(buffer, 0, numChars);
        }
        reader.close();
        is.close(); // InputStream도 닫기
        return sb.toString();
    }
}
