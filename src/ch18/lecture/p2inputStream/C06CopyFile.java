package ch18.lecture.p2inputStream;

import java.io.*;

public class C06CopyFile {
    public static void main(String[] args) throws IOException {
        String inputFileName = "temp/dog.png";
        String outputFileName = "temp/dog-copy.png";

        InputStream is = new FileInputStream(inputFileName);
        OutputStream os = new FileOutputStream(outputFileName);

        try (is; os;) {
            byte[] data = new byte[1024];
            int len = 0;
            while ((len = is.read(data)) != -1) {
                os.write(data, 0, len);
            }
        }
    }

}
