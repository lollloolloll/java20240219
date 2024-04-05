package ch17.lecture.p1stream;

import java.util.List;

public class C11Reduce {
    public static void main(String[] args) {

        //reduce:redection 최종연산


        List<String> list = List.of("java", "css", "spring", "html");

        String result1="";
        for (String s : list) {
            result1 += s;
        }
        System.out.println("result1 = " + result1);

        List<Integer> list1 = List.of(3, 6, 9, 10);
        int sum1=0;
        for (Integer i : list1) {
            sum1+=i;
        }
        System.out.println("sum1 = " + sum1);

        String reduce = list.stream()
                .reduce("", (result, e) -> result + e);
        System.out.println("reduce = " + reduce);

        Integer reduce1 = list1.stream()
                .reduce(0, (s, v) -> s + v);
        System.out.println("reduce1 = " + reduce1);


    }
}
