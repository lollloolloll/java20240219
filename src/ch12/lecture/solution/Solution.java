package ch12.lecture.solution;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        test solution = new test();

        String[] result=solution.func("thexgreatestxofxallxtime");
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));


    }
}

class test {
    String[] func(String myString) {
        String[] parts = myString.split("x+");
        return parts;
    }
}
