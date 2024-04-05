package ch18.lecture.p1outputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C04TryWithResources {
    public static void main(String[] args) {


        String filename = "temp/output4.data";

//try()안에서 선언된 객체는 자동으로 close메서드를 호출해줌
        try (OutputStream os = new FileOutputStream(filename);) {
            os.write(293748);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }




}
