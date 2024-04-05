package ch18.lecture.exercise;

import java.io.*;

public class P790 {
    public static void main(String[] args) {


        try {
            InputStream is = new FileInputStream("temp/test2.db");

            byte[] data = new byte[100];

            while (true) {
                int num = is.read(data);
                if (num == -1) break;

                for (int i = 0; i < num; i++) {
                    System.out.println(data[i]);

                }
            }
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }










    }






}
