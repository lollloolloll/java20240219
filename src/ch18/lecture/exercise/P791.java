//package ch18.lecture.exercise;
//
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.InputStream;
//import java.io.OutputStream;
//
//public class P791 {
//    public static void main(String[] args) {
//
//
//        String originalFileName = "/temp/test.jpg";
//        String targetFileName = "temp/test2.jpg";
//
//        InputStream is = new FileInputStream(originalFileName);
//        OutputStream os = new FileOutputStream(targetFileName);
//
//        byte[] data = new byte[1024];
//        while (true) {
//            int num = is.read(data);
//            if(num==-1)break;
//            os.write(data,0,num);
//        }
//        os.flush();
//        os.close();
//        is.close();
//
//        System.out.println("복사가 잘 되어스 스빈다");
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
//}
