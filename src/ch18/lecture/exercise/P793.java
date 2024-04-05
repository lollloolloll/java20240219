package ch18.lecture.exercise;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class P793 {


    public static void main(String[] args) {


        try {
            Writer writer = new FileWriter("temp/test.txt");


            char a = 'A';
            writer.write(a);
            char b = 'B';
            writer.write(b);

            char[] arr = {'C', 'D', 'E'};

            writer.write("FGH");

            writer.flush();

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }







}
