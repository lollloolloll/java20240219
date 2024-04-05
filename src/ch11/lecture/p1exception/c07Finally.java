package ch11.lecture.p1exception;

import java.util.List;

public class c07Finally {
    public static void main(String[] args) {

        //finally
        //:exception 발생 여부와 관계없이 항상 실행되는 블럭
        //:return을 해도 실행되는 블럭
        try {
//            List.of("a", "b").get(2);
            List.of("a", "b").get(1);
            return;
        } finally {
            System.out.println("무조건 실행");
        }

//        System.out.println("프로그램 종료");



    }
}
