package C08.lecture.p1interface;

import java.io.Serializable;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;

public class C08String {
    public static void main(String[] args) {
        String s = "java";
        Object o = s;
        Serializable serializable = s;
        CharSequence charSequence = s;
        Comparable comparable = s;
        Constable constable = s;
        ConstantDesc constantDesc = s;

        comparable.compareTo("hello");
        charSequence.chars();

        System.out.println(s instanceof String);
        System.out.println(s instanceof Object);
        System.out.println(s instanceof Serializable);
        System.out.println(s instanceof CharSequence);
        System.out.println(s instanceof Comparable);
        System.out.println(s instanceof Constable);
        System.out.println(s instanceof ConstantDesc);

        System.out.println(charSequence instanceof CharSequence);
        System.out.println(charSequence instanceof String);
    }
}
