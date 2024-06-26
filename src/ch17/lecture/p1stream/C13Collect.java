package ch17.lecture.p1stream;

import java.util.ArrayList;
import java.util.List;

public class C13Collect 
{
    public static void main(String[] args) {


        List<String> list = List.of("java", "wpring",
                "css", "html", "react");
        List<Integer> result1 = new ArrayList<>();

        for (String s : list) {
            result1.add(s.length());
        }

        System.out.println(result1);


        ArrayList<Integer> collect = list.stream()
                .collect(() -> new ArrayList<Integer>(),
                        (c, e) -> c.add(e.length()), (a,b)->a.addAll(b));

        System.out.println("collect = " + collect);
        
    }
}
