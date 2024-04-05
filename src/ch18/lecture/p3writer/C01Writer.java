package ch18.lecture.p3writer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C01Writer {
    public static void main(String[] args) {

        //outputStream:바이트 단위 출력 스트림
    //Writer:문자단위 출력 스트림


        String file1 = "temp/output1.txt";
        try (OutputStream os = new FileOutputStream(file1)) {
            os.write(100);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }







}
