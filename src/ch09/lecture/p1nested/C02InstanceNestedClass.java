package ch09.lecture.p1nested;

public class C02InstanceNestedClass {
    public static void main(String[] args) {
        // 외부 클래스의 인스턴스 생성
        C02MyClass obj1 = new C02MyClass();

        // 외부 클래스의 인스턴스를 사용하여 내부 클래스의 인스턴스 생성
        C02MyClass.C02NestedClass obj2 = obj1.new C02NestedClass();
    }
}

class C02MyClass {
    // 비정적 중첩 클래스
    class C02NestedClass {
        // 내부 클래스의 내용
    }

    // 필드, 생성자, 메서드 등
    int j;
    static int i;
    void method1() {
        // 내부 클래스의 인스턴스 생성
        C02NestedClass obj = new C02NestedClass();
    }
}
