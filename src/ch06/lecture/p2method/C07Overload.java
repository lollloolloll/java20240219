package ch06.lecture.p2method;

public class C07Overload {
    public static void main(String[] args) {
        C07MyClass o1 = new C07MyClass();
        o1.method1();

    }

}

class C07MyClass{
    //파라미터의 갯수,타입이 다른
    //같은 일므의 메서드 작성 가능

    void method1() {

    }

    void method1(int a) {

    }

    void method1(double a) {

    }
    void method1(double a,double b) {

    }

    void method1(double a, double b, double c) {

    }

    void method1(double a, int b) {

    }

    void method1(int a, double b) {

    }
















}