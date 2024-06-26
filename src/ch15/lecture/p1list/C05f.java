package ch15.lecture.p1list;

import java.util.ArrayList;
import java.util.List;

public class C05f {
    public static void main(String[] args) {
        //List.of로 리스트 객체 생성
        List<Object> list1=List.of();
        System.out.println(list1.size());

        List<String> list2 = List.of("java");
        System.out.println(list2.size());
        System.out.println(list2);

        List<String> list3 = List.of("react", "vue", "jsp");
        System.out.println(list3);

        List<String> list4 = new ArrayList<>();
        list4.add("spring");
        list4.add("css");
        System.out.println(list4);

        //중첩된 List
        List<List<Integer>> list5 = List.of(
                List.of(95, 96),
                List.of(83, 92, 97),
                List.of(78, 83, 93, 87, 88)

        );
        System.out.println(list5.get(1).get(1));
        System.out.println(list5.get(1).get(1));
        System.out.println(list5.get(1).get(1));





    }
}
