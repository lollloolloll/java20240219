package ch18.lecture.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P821_7 {
    public static void main(String[] args) throws IOException {


        String filePath = "C:\\Users\\admin\\IdeaProjects\\java20240219\\src\\ch18\\lecture\\exercise\\P821_7.java";

        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);

        int rowNumber=0;
        String rowData;
        while (true) {
            rowData = br.readLine();
            if(rowData==null)break;
            System.out.println(rowNumber + ":\t" + rowData);
            rowNumber++;
        }
        br.close();
        fr.close();








    }











}
