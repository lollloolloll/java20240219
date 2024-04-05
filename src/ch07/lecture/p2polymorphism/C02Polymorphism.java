package ch07.lecture.p2polymorphism;

public class C02Polymorphism {
    public static void main(String[] args) {
        C02Cat cat = new C02Cat();
        cat.breathe();




    }
}

class C02Animal {
    public void breathe() {
        System.out.println("호흡합니다.");
    }
}

class C02Cat extends C02Animal {
    public void breathe() {
        System.out.println("호흡합니다.");
    }
}
