package ch09.lecture.exercise;

public class P399 {
    public static void main(String[] args) {

        A.B b = new A.B();












    }
}

class A {
    static class B {

    }

    B field1 = new B();
    static B field2 = new B();
    A() {
        B b = new B();
    }

    void method1() {
        B b = new B();
    }

    static void method2() {
        B b = new B();
    }

}
