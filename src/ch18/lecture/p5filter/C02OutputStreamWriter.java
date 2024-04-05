package ch18.lecture.p5filter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class C02OutputStreamWriter {
    public static void main(String[] args) throws IOException {

        String file = "temp/output2.txt";
        OutputStream os = new FileOutputStream(file);

        //OutputStreamWriter:
        //문자 단위 출력 스트림을 바이트단위 출력 스트림으로 연결

        OutputStreamWriter osw = new OutputStreamWriter(os);


        char c1 = 'A';
        os.write(c1);

        char c2 = '가';
        os.write(c2);

        os.close();

    }

}
