package ch05.lecture.p1array;

public class C07Array {
    public static void main(String[] args) {

        int[] arr = new int[]{6, 5, 7, 2, 3, 10,2,5,3,25,13};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(10*arr[i]+" ");
        }
        System.out.println("***************");
        for (int item : arr) {
            System.out.print(10*item+" ");
        }

















    }
}
