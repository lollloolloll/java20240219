package ch18.lecture.exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P803 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\admin\\IdeaProjects\\java20240219\\src\\ch18\\lecture\\p5filter\\C07BufferedReader.java")
        );
        int lineNo=1;
        while (true) {
            String str = br.readLine();
            if(str==null)break;
            System.out.println(lineNo + "\t" + str);
            lineNo++;
        }
        br.close();





    }









}
