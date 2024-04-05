package ch07.lecture.p2polymorphism;

public class C05Polymorphism {


    A a;
    C05Polymorphism() {
        a = new A();
        a = new B();
        a = new C();
    }


    public static void main(String[] args) {


    }
}

class A {

    public void method1() {
        System.out.println("A.method1");
    }
}

class B extends A {
    public void method1() {
        System.out.println("B.method1");}

}
class C extends A {
    public void method1() {
        System.out.println("C.method1");}

}
