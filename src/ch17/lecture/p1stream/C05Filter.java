package ch17.lecture.p1stream;

import java.util.List;

public class C05Filter {
    public static void main(String[] args) {


        List<Integer> list = List.of(9, 6, 3, 0, 12, 15, 18, 21);
        
        //filter:특정 요소만 filtering
        long count = list.stream()
                .filter(e -> e % 2 == 0)
                .count();
        System.out.println("count = " + count);


    }
}
