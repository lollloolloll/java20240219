package C08.lecture.p1interface;

public class C05DefaultMethod {
    public static void main(String[] args) {

        C05MyInterface a = new C05MyClass1();
        C05MyInterface b = new C05MyClass2();

        a.method100();
        b.method100();












    }
}

interface C05MyInterface {

    //body가 있는 인스턴스 메서드
    default void method100() {
        System.out.println("C05MyInterface.method100");
    }
}

class C05MyClass1 implements C05MyInterface {

}

class C05MyClass2 implements C05MyInterface {
    @Override
    public void method100() {
        System.out.println("I'm overriding");
    }
}
