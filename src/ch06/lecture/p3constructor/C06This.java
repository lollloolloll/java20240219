package ch06.lecture.p3constructor;

public class C06This {
    public static void main(String[] args) {
        C06MyClass o1 = new C06MyClass();
        o1.name = "son";
        C06MyClass o2 = new C06MyClass();
        System.out.println(o1.name);
        o2.name = "lee";
    }
}

class C06MyClass {
    void instruction() {
        System.out.println("this:현재 객체의 참조값");
    }
    String name="hong";

}