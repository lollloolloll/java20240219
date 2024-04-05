package ch11.lecture.p1exception;

import java.util.List;

public class C08Polymorphism {
    public static void main(String[] args) {


        try {
            List.of().get(0);//exception발생
        } catch (Throwable e) {
            System.out.println(e.getMessage());
            System.err.println("catch blcok code");
        }
        System.out.println("프로그램 종료");


    }
}
