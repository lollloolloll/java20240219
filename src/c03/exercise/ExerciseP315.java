package c03.exercise;

public class ExerciseP315 {
    public static void main(String[] args) {
        Car315 mycar = new Car315();

        mycar.tire = new Tire315();
        mycar.run();

        mycar.tire = new HankookTire315();
        mycar.run();

        mycar.tire = new KumhoTire315();
        mycar.run();
    }
}

class Tire315 {
    void roll() {
        System.out.println("회전합니다");
    }
}

class HankookTire315 extends Tire315 {
    void roll() {
        System.out.println("한국타이어가 회전합니다");
    }
}

class KumhoTire315 extends Tire315 {
    @Override
    void roll() {
        System.out.println("금호타이어가 회전합니다");
    }
}

class Car315 {
    Tire315 tire;

    void run() {
        tire.roll();
    }
}