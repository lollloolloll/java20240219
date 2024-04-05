package ch07.lecture.p4abstract;

public class C02Abstract {

}

abstract class C02Animal {
    //abstract method:몸통 없는 메서드
    //하위 클래스가 꼭 재정의 해야함
    //추상메서드강 있다면 클래스는 꼭 추상 클래스
   abstract void breathe(); /*{
        System.out.println("호흡하다");
    }*/

}

class C02Fish extends C02Animal {
    @Override
    void breathe() {
        System.out.println("아가미로 호흡합니다");
    }
}

class C02Cat extends C02Animal {
    @Override
    void breathe() {
        System.out.println("폐로 호흡합니다");
    }
}

//자식 클래스가 추상메서드를 오버라이드 하지 않으면
//추상 클래스가 되어야 함
abstract class C02Bird extends C02Animal {

}
