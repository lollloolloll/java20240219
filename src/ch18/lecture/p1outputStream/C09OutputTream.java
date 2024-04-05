package ch18.lecture.p1outputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C09OutputTream {
    public static void main(String[] args) {


        String fileName = "temp/output9.data";
        try (OutputStream os = new FileOutputStream(fileName)) {
            os.write(23432);

            byte[] data = new byte[10];
            os.write(data , 0, 10);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }



}
