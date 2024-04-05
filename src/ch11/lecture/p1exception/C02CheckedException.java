package ch11.lecture.p1exception;

import java.util.List;

public class C02CheckedException {
    public static void main(String[] args) {


        List<String> list = List.of("a", "b");


        //list.get:IndexOutOfBoundsException
        //(unchecked exception,컴파일러 검사X)

        //컴파일러가 검사 안함=>예외처리 코드가 없어도됨
        System.out.println("list.get(2) = " + list.get(2));


        //예외처리 코드가 있는지 확인함=>예외처리코드가 있어야함
        try {
            Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
