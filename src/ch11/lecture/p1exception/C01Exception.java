package ch11.lecture.p1exception;

import java.util.List;

public class C01Exception {

    //Exception:checked Exception 컴파일러 예외
    //Runtime Exception:Unchecked Exception 실행 예외
    public static void main(String[] args) {


        List<String> list = List.of("css", "html");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));





    }

}
