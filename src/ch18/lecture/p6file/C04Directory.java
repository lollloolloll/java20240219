package ch18.lecture.p6file;

import java.io.File;

public class C04Directory {
    public static void main(String[] args) {


        String path = "temp/folder2/sub1/sub2";
        File file = new File(path);

        System.out.println("file.exist()=" + file.exists());

        if (!file.exists()) {
            file.mkdir();
        }



    }
}
