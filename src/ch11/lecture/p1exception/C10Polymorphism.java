package ch11.lecture.p1exception;

import java.util.List;

public class C10Polymorphism {
    public static void main(String[] args) {


        try {
            Class.forName("java.lang.String");//classNotFoundexception
            List.of().get(0);//IndexOutofBoundsException
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }


    }
}
