package ch11.lecture.p1exception;

import java.util.List;

public class C11Polymorphism {
    public static void main(String[] args) {


        try {
            Class.forName("java.lang.String1");
            List.of().get(0);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }


    }
}
