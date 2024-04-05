package ch09.lecture.exercise;

public class P397 {
    public static void main(String[] args) {
        // 외부 클래스 A397의 인스턴스 생성
        A397 a = new A397();

        // 외부 클래스의 인스턴스를 사용하여 내부 클래스 B397의 인스턴스 생성
        A397.B397 b = a.new B397();
    }
}

class A397 {
    class B397 {
        int field1 = 1;
        static int field2 = 2;

        B397() {
            System.out.println("B-생성자 실행");
        }

        void method1() {
            System.out.println("B-method1 실행");
        }

        static void method2() {
            System.out.println("B-method2 실행");
        }
    }

    void useB() {
        B397 b = new B397();
        System.out.println(b.field1);
        b.method1();
        System.out.println(B397.field2);
        B397.method2();
    }
}
