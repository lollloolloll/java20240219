package C08.lecture.p1interface;

public class C03Method {
    public static void main(String[] args) {

        C03Pet pet1 = new C03Cat();
        C03Pet pet2 = new C03GoldFish();
        pet1.feed();
        pet2.feed();


    }
}

interface C03Pet {

    //인터페잇의 메서드는 모두 추상 메서드
    //public abstract생략 가능
   public abstract void feed();



}
abstract class C03Animal {
    abstract void breathe();
}

class C03Cat extends C03Animal implements C03Pet {

    @Override
    void breathe() {
        System.out.println("고양이가 폐로 숨쉬기");
    }

    @Override
    public void feed() {
        System.out.println("고양이이에게 닭ㄱ가슴살을 준다");
    }
}

class C03Tiger extends C03Animal {

    @Override
    void breathe() {
        System.out.println("호랑이가 폐로 숨쉬기");
    }
}

class C03GoldFish extends C03Animal implements C03Pet {

    @Override
    void breathe() {
        System.out.println("금붑붕어가 아가미로 호흡");
    }

    @Override
    public void feed() {
        System.out.println("금뭅ㅇ어에게 새우를 준다");
    }
}
