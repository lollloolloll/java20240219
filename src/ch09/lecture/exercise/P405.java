package ch09.lecture.exercise;

public class P405 {
    public static void main(String[] args) {












    }
}

class A405 {
    void method(int arg) {
        int var=1;

        class B405 {
            void method2() {
                System.out.println("arg = " + arg);
                System.out.println("var = " + var);
            }
        }
        B405 b = new B405();

        b.method2();
    }
}
