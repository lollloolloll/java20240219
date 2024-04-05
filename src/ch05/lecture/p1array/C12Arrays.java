package ch05.lecture.p1array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C12Arrays {
    public static void main(String[] args) {

        System.out.println("java.util.arrays: 유틸리티클래스");


        System.out.println("toString");
        int[] arr1 = {9, 1, 3, 9, 3};

        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = new int[5];
        System.out.println(Arrays.toString(arr2));


        Arrays.fill(arr2,23);
        System.out.println(Arrays.toString(arr2));

        System.out.println("copyOf:배열복사");
        int[] arr3 = {9, 3, 0, 5, 3};
        int[] arr4 = arr3;
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr3));

        arr4[0]=10;
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr3));

        int[] arr5 = {5, 6, 6, 1, 2};
        int[] arr6 = Arrays.copyOf(arr5, arr5.length);


        arr5[0]=50;

        System.out.println(Arrays.toString(arr5));
        System.out.println(Arrays.toString(arr6));






















    }
}
