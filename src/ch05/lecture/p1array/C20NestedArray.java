package ch05.lecture.p1array;
import java.util.Arrays;
public class C20NestedArray {
    public static void main(String[] args) {
        System.out.println("2차원배열");
        int[] arr1 = new int[]{5, 8, 9};
         arr1 = new int[]{2, 3, 4,6,13};
        System.out.print(Arrays.toString(arr1));
        System.out.println("<-new연산자 생략");

        int[][] arr2 = {
                {80, 90, 86}, {60, 23}
        };
        int[][] arr3 = arr2;
        arr3[0][1]=33;
        System.out.println(arr3[0][1]);
        arr3[1] = arr1;
        System.out.println(arr2[1][1]);
































    }
}
