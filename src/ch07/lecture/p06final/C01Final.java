package ch07.lecture.p06final;

public class C01Final {
    public static void main(String[] args) {

    }
}

class C01Parent {

    //final:하위 클래스가 재정의 하지 못하도록 함
    final void method1() {
        System.out.println("C01Parent.method1");
    }
}

class C01Child extends C01Parent {

}
