package ch18.lecture.exercise;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class P784 {
    public static void main(String[] args) {


        try {
            OutputStream os = new FileOutputStream("Temp/test2.db");

            byte[] array = {10, 20, 30};

            os.write(array);
            os.close();


        } catch (IOException e) {
            e.printStackTrace();

        }




    }





}
