package ch06.lecture.p2method;

import java.util.Random;
public class C09Return {
    public static void main(String[] args) {
        C09MyClass obj = new C09MyClass();
        obj.method2();
    }
}
class C09MyClass{
            void method1(){
        System.out.println("statement1");
        System.out.println("statement2");

        return;

    }
    void method2(){
        Random random = new Random();
        while (true) {
            int dice1 = random.nextInt(6) + 1;
            int dice2 = random.nextInt(6) + 1;

            System.out.println("(" + dice1 + ","+ dice2 + ")");
        }
    }
}
