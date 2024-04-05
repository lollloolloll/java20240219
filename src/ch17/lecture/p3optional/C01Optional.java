package ch17.lecture.p3optional;

import java.util.Optional;

public class C01Optional {
    public static void main(String[] args) {

        //Optional
        //null이 아닌 값을 포함 할 수있는 컨테이너

        Optional<String> s = Optional.of("java");
        Optional<Integer>i = Optional.of(3);
        Optional<Double> d = Optional.of(3.14);
        //Optional<Object> o=Optional.of(null) null안됨
        System.out.println("C10Optional");
        Optional<Object> container1 = Optional.empty();

        //값이 있는 지?

        boolean present1 = s.isPresent();
        boolean present2 = container1.isPresent();
        System.out.println("present2 = " + present2);
        System.out.println("s = " + s);


        //값이 없는 지?
        boolean empty = s.isEmpty();
        boolean empty1 = container1.isEmpty();
        System.out.println("empty1 = " + empty1);
        System.out.println("empty = " + empty);

        //값 꺼내기


        String s1 = s.get();
        Integer i1 = i.get();
        Double v = d.get();
//        Object o = container1.get();excpetion


//        값일 없을 때 꺼내기

        String s2 = s.orElse("");
        Integer i2 = i.orElse(0);
        Object o = container1.orElse(new Object());


        System.out.println("C10Optional.main");

    }
}
