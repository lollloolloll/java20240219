package ch06.lecture.p2method;

public class C08VarArgs {
    public static void main(String[] args) {
        C08MyClass o1 = new C08MyClass();
        o1.method1(1);
        o1.method1(1);
        o1.method1(3,3);
        o1.method2(6,7,8);
        o1.method2(1);
        o1.method2(6,7);
    }
}

class C08MyClass {
    void method1(int a) {
        System.out.println("C08MyClass.method1");
    }

    void method1(int a, int b) {
        System.out.println("C08MyClass.method1");
    }

    void method2(int... a) {
        System.out.println("C08MyClass.method1");
        System.out.println(a.length);
    }

    void metohd3(String s,double n, int...a) {

    }
}
