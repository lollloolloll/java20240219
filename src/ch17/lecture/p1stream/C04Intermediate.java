package ch17.lecture.p1stream;

import java.util.List;
import java.util.stream.Stream;

public class C04Intermediate {
    public static void main(String[] args) {


        //(intermediate operation)
        //filter, map, distinct,sorted,peek,limit

        //중간연산은 최종연산이 있을 때만 실행
        List<Integer> list = List.of(3, 5, 9, 8, 1, 6, 4);

        Stream<Integer> stream1 = list.stream();
             Stream<Integer>stream2=stream1.filter(e -> {
                    System.out.println(e);
                    return true;
                });
        long count = stream2.count();
        //중간 stream 변수 없이 사용
        list.stream()
                        .filter(e -> {
                            System.out.println(e);
                            return true;
                        })
        .count();

        System.out.println("프로그래 ㅁ종료");
    }
}
