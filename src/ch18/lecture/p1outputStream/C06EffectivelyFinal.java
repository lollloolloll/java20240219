//package ch18.lecture.p1outputStream;
//
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.InputStream;
//import java.io.OutputStream;
//
//public class C06EffectivelyFinal {
//    public static void main(String[] args) {
//
//
//        String inputFileName = "temp/input5.data";
//        String outputFileName  = "temp/input5.data";
//
//        InputStream is = new FileInputStream(inputFileName);
//        OutputStream os = new FileOutputStream(outputFileName);
//        try (is; os;) {
//            is.read();
//            os.write(29834);
//        }
//
//
//
//
//
//
//
//
//
//    }
//
//
//
//
//
//
//
//
//}
