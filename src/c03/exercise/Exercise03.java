package c03.exercise;
import java.util.Arrays;
public class Exercise03 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        String string1 = "123";
        String string3 = "123";

        System.out.println(arr1 == arr2);
        System.out.println(string1==string3);
        System.out.println(arr1.equals(arr2));
        
        
    }
}
