package ch17.lecture.p2primitive;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C01IntStream {
    public static <LIst> void main(String[] args) {


        //기본타입 원소를 처리하는 stream
        //intstream,Longstream,doublesStream

        int[] arr = {9,10,1,0,2,3,9,1,5,5};
        IntStream stream1 = Arrays.stream(arr);
        IntStream stream2 = IntStream.of(arr);
        List<Integer> list = List.of(10, 3, 9, 5, 7, 6, 10);
        IntStream intstream = list.stream()
                .mapToInt(Integer::intValue);

        //최종연산

        //sum

        int sum = Arrays.stream(arr)
                .sum();
        System.out.println("sum = " + sum);


        //min

        OptionalInt min = Arrays.stream(arr)
                .min();
        System.out.println("min = " + min);

        //max

        OptionalInt max = Arrays.stream(arr)
                .max();
        System.out.println("max = " + max);

        //avaerage


        OptionalDouble average = Arrays.stream(arr)
                .average();
        System.out.println("average = " + average);

        //toArray

        int[] array = Arrays.stream(arr)
                .toArray();
        System.out.println("array = " + Arrays.toString(array));


        //중간연산

        Stream<Integer> boxed = Arrays.stream(arr)
                .boxed();
        System.out.println("boxed = " + boxed);
        long count = boxed.count();
        System.out.println("count = " + count);


        //boxed




    }
}
