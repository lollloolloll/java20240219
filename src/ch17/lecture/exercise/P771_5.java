package ch17.lecture.exercise;

import java.util.Arrays;
import java.util.List;

public class P771_5 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList(
                "This is a java book"
                ,"lambda expression",
                "JavaB suports Lambda expressions"
        );
        list.stream().filter(e->e.toLowerCase().contains("java"))
                .forEach(System.out::println);

    }
}
