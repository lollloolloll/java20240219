package ch15.lecture.p3stack;

import java.util.Stack;

public class C02Stack {
    public static void main(String[] args) {

        var stack = new Stack<String>();

        stack.push("son");
        stack.push("lee");
        stack.push("son");

        String item1= stack.peek();
        String item2= stack.peek();

        System.out.println(item1);
        System.out.println(item2);


    }
}
