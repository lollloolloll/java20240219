package ch17.lecture.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class P772_6 {
    public static void main(String[] args) {

        List<Member6> list = Arrays.asList(
                new Member6("홍길동",30),
                new Member6("신용권",30),
                new Member6("감자바",26)
        );
        OptionalDouble avg = list.stream()
                .mapToInt(m -> m.getAge())
                .average();
        System.out.println("평균나이:"+avg);


    }
}

class Member6 {
    private String name;
    private int age;

    public Member6(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
