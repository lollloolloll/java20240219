package ch18.lecture.p6file;

import java.io.File;

public class C03Directory {
    public static void main(String[] args) {


        String path = String.valueOf(new File(File.pathSeparator));
        File file = new File(path);

        System.out.println();
        if (!file.exists()) {
            boolean mkdir = file.mkdir();
        }
        System.out.println("file.exists()=" + file.exists());





    }






}

