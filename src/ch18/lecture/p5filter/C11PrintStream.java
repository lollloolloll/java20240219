package ch18.lecture.p5filter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class C11PrintStream {
    public static void main(String[] args) throws FileNotFoundException {


        String file = "temp/output11.txt";
        FileOutputStream fos = new FileOutputStream(file);
        PrintStream ps = new PrintStream(fos);

        ps.print("helloworld");
        ps.print("jack");
        ps.println();
        ps.println("I'm hungry");
        ps.println("it's lunch time");
        ps.printf("%f*%f=%f%n", 3.14, 5.0, (3.14 * 5));
        ps.close();






    }
}
