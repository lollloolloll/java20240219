package ch17.lecture.p1stream;

import java.util.List;
import java.util.Optional;

public class C12Reduce {
    public static void main(String[] args) {


        List<String> j = List.of("j", "a", "v", "a");
        String reduce = j.stream()
                .reduce("", (a, b) -> a + b);
        System.out.println("reduce = " + reduce);

        Optional<String> reduce1 = j.stream()
                .reduce((a, b) -> a + b);
        String s = reduce1.get();
        System.out.println("s = " + s);



    }
}
