package ch18.lecture.p4reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class C01Reader {
    public static void main(String[] args) throws IOException {


        Reader reader = new FileReader("temp/output2.txt");

        int read1 = reader.read();
        int read2=reader.read();
        int read3=reader.read();

        System.out.println("read1 = " + read1);
        System.out.println("read2 = " + read2);
        System.out.println("read3 = " + read3);


    }








}
