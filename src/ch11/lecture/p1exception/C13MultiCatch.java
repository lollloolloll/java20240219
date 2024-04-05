package ch11.lecture.p1exception;

import java.util.List;

public class C13MultiCatch {
    public static void main(String[] args) {


        try {
            Class.forName("java.lang.String");//classNotFoundException
            List.of().get(0);//IndexOutofBoundsException
            Integer.parseInt("two");//numberFormatException
        } catch (ClassNotFoundException e) {
            System.err.println("예외처리코드1");

        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            System.err.println("예외처리코드2");
        }


    }
}
