package ch17.lecture.p1stream;

import java.util.List;

public class C09Sorted {
    public static void main(String[] args) {


        //sorted:정렬된 stream 리턴
        List<Integer> list = List.of(9, 3, 19, 6, 5, 7, 1);

        list.stream()
                .sorted()
                .forEach(System.out::println);
        list.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println();
        list.stream()
                .distinct()
                .forEach(System.out::println);

        List<String> list1 = List.of("java", "css", "react", "html", "spring","vue");
        list1.stream()
                .sorted()
                .forEach(System.out::println);


    }
}
