package ch07.lecture.p3casting;

public class C01Casting {
    public static void main(String[] args) {

        C01Animal animal1 = new C01Tiger();
        animal1.breathe();
//강제형변환(Casting)
        C01Tiger tiger = (C01Tiger) animal1;
        tiger.meow();

        C01Animal animal2 = new C01Cat();
        animal2.breathe();

    }

}

class C01Animal {

    void breathe() {
        System.out.println("호흡합니다");
    }
}

class C01Tiger extends C01Animal {
    @Override
    void breathe() {
        System.out.println("호랑이가 폐로 호흡합니다");
    }

    void meow() {
        System.out.println("어흥~");
    }

}

class C01Cat extends C01Animal {
    @Override
    void breathe() {
        System.out.println("고양이가 폐로 호흡합니다");
    }

    void meow() {
        System.out.println("냐아옹~");
    }
}
