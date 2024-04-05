package ch09.lecture.p2anonymous;

public class C08Lambda {
    public static void main(String[] args) {
        C08MyInterface obj = () -> System.out.println("재정의 1");
    obj.method();



        //추상 메서드가 하나인 인터페[이스의
        //익명클래스 객체 생성시 람다 표현식으로
        //간단하게 작성 가능하다



    }
}

interface C08MyInterface {
    void method();
}
