package ch07.lecture.p5super;

public class C01Super {
    public static void main(String[] args) {
        C01Child child = new C01Child();
        child.method1();
    }
}

class C01Parent {
    int field1;
    void method1() {
        System.out.println("부모 클래스의 메서드 코드 실행");
    }

}

class C01Child extends C01Parent {
    @Override
    void method1() {
        System.out.println("자식 클래스의 메소드 코드 실행");
        //상위 타입의 멤버 참조를 접근하기위한 키워드
        super.method1();
        System.out.println(super.field1);
    }
}
