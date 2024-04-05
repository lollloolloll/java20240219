package ch18.lecture.p5filter;

import org.lwjgl.system.windows.INPUT;

import java.io.*;

public class C01Filter {
    public static void main(String[] args) throws IOException {


        String file = "temp/output3.txt";
        InputStream is = new FileInputStream(file);
        Reader reader = new InputStreamReader(is);
        //InputStreamReader:
        //byte stream을 character stream으로 연결
//        int data1 = is.read();
        int data1 = reader.read();
        System.out.println((char)data1);

is.close();

    }









}
