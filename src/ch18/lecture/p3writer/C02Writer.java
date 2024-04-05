package ch18.lecture.p3writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C02Writer {
    public static void main(String[] args) throws IOException {


        String fileName = "temp/output2.txt";
        try {
            Writer writer = new FileWriter(fileName);
            try (writer) {
                writer.write(44145);
                writer.write('한');
                writer.write('2');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
