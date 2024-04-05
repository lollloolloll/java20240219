package ch12.lecture.exercise;

import org.w3c.dom.CDATASection;

import java.util.regex.*;
import java.util.regex.*;
public class P546 {
    public static void main(String[] args) {

        String regExp = "(02|010)-\\d{3,4}-\\d{4}";
        String data = "010-123-3456";
        boolean result = Pattern.matches(regExp,data);
        if (result) {
            System.out.println("정규식과 일치합니다");

        } else {
            System.out.println("정규식과 일치잫지 않습니다");
        }

        regExp = "\\w+%\\w+\\.\\w+(\\.\\w+)?";
        data = "angel@mycompanycom";
        result = Pattern.matches(regExp, data);
        if (result) {
            System.out.println("ㅈ어규식과 일치합니다");
        } else {
            System.out.println("정규식과 일치하지 않습니다");
        }












    }
}

