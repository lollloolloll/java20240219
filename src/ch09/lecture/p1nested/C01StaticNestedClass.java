package ch09.lecture.p1nested;

public class C01StaticNestedClass {
    public static void main(String[] args) {
        // 외부 클래스의 인스턴스 생성
        C01MyClass myClass = new C01MyClass();

        // 내부 클래스의 인스턴스 생성
        C01MyClass.C01NestedClass obj1 = myClass.new C01NestedClass();
    }
}

class C01MyClass {
    // 비정적 중첩 클래스
    class C01NestedClass {
        // 내부 클래스의 내용
    }

    void method1() {
    }

    // 필드, 생성자, 메서드 등
}
