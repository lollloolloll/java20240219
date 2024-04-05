package ch18.lecture.exercise;

import java.io.*;

public class P822_10 {
    public static void main(String[] args) throws IOException {
        InputStream keyboard = System.in;
        InputStreamReader isr = new InputStreamReader(keyboard);
        BufferedReader br = new BufferedReader(isr);

        while(true) {
            System.out.println("원본 파일 경로:");
            String original = br.readLine();
            File originalFile = new File(original);

            System.out.println("복사 파일 경로:");
            String copy = br.readLine();
            File copyFile = new File(copy);

            if (!originalFile.exists()) {
                System.out.println("원본 파일이 존재하지 않습니다.");
            } else {
                if (!copyFile.exists()) {
                    copyFile.mkdir();
                }


                System.out.println("복사가 성공 되었 습니다.");

            }



        }


    }
}
