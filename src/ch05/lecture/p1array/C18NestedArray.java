package ch05.lecture.p1array;
import java.lang.reflect.Array;
import java.util.Arrays;
public class C18NestedArray {
    public static void main(String[] args) {
        System.out.println("1차원배열");
        int[] arr1 = new int[5];

        int [][] arr2=new int[3][];
        System.out.println(Arrays.toString(arr2));
        System.out.println("원소가 참조타입이라서 int[],null값 출력");

        arr2[0]=new int[2];
        arr2[1]=new int[5];
        arr2[2]=new int[3];
        System.out.println(arr2[0].length);
        System.out.println(arr2[1].length);
        System.out.println(arr2[2].length);
        System.out.println("초기값을 지정해서 배열만들기");
        int[] arr3 = new int[]{8, 3, 1};
        int[] arr4 = {6, 2, 1, 3, 2};
        int[][]arr5=new int[][]{{83,2,24,1,1},{13,2,52,353,2},{23,3231,12,3,2521}};
        int[][]arr6={{83,2,24,1,1},{13,2,52,353,2},{23,3231,12,3,2521}};
        int[][] arr7 = new int[3][];
        arr7[0] = new int[]{5, 4, 1};
        arr7[1] = new int[]{5, 4, 1};
        arr7[2] = new int[]{5, 4, 1};























    }
}
