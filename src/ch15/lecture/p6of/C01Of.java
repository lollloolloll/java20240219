package ch15.lecture.p6of;

import java.util.ArrayList;
import java.util.List;

public class C01Of {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("css");
        list.add("html");
        list.add("react");
        System.out.println(list);
        list.add("Spring");
        list.remove(0);
        list.set(1, "vue");
        System.out.println(list);

        List<String> list2 = List.of("java", "css", "html", "react");
        System.out.println(list2);
//        list2.set(1, "vue");
//        list2.add(1, "vue");
//        list2.remove(0);


    }
}
