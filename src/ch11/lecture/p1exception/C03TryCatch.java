package ch11.lecture.p1exception;

import java.util.List;

public class C03TryCatch {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b");
        String s1 = list.get(0);

        try {
            //try:exception발생할 수 있는 코드를 감싼 블럭
            //exception 발생함

            String s2 = list.get(2);//exception 발생함

            System.out.println("exception이발생하지 않았으면");
            System.out.println("실행되는 코드들...");


        } catch (IndexOutOfBoundsException e) {
            //catch:발생한 exception 을 잡고 처리하는 코드블럭
            System.out.println("exception발생후 실행되는 코드");

        }




    }
}
