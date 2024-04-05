package ch12.lecture.exercise;

import java.util.regex.Pattern;

public class P566_17 {
    public static void main(String[] args) {
        String id = "5Angel1004";
        String regExp ="[a-zA-Z][a-zA-Z0-9]{7,11}";
        boolean isMatch = Pattern.matches(regExp,id);

        if (isMatch) {
            System.out.println("ID로 사용할수 있습니다");
        } else {
            System.out.println("ID로 사용할수 없습니다");
        }


    }
}
