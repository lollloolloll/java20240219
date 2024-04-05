package C08.lecture.exercise;

public class Exercise04 {

    void method(A a) {

    }
}

interface A {

}

//B가 A를 구현하다
//A:인터페이스
//B:구현클래스(concrete class)
class B implements A{

}

class D extends B {

}

class C implements A {

}

class E extends C {
}

