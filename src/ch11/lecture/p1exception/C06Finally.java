package ch11.lecture.p1exception;

import java.util.List;

public class C06Finally {
    public static void main(String[] args) {


        List<String> list = List.of("a", "b");

        try {
            for (int i = 0; i < list.size(); i++) {
                System.out.println("list.get(int) = " + list.get(i));
            }
            System.out.println("모두 출력 완료");
            System.out.println("트라이블럭 나머지 코드");
        } catch (Exception ex) {
            System.err.println("캐치 블럭 코드들");
        }finally {
            //exception 발생 여부와 상관 없이 실행되는 코드블럭
            System.out.println("항상실행");
        }
        System.out.println("프로그램 종료");

    }



}
