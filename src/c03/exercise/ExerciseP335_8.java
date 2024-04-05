package c03.exercise;

public class ExerciseP335_8 {
    public static void main(String[] args) {

        SnowTire snowTire = new SnowTire();
        Tire tire =  snowTire;
        Tire tire1 = new Tire();
        snowTire.run();
        tire.run();
        tire1.run();




    }
}

class Tire {
    void run() {
        System.out.println("일반 타이어가 굴러갑니다");
    }
}

class SnowTire extends Tire {
    @Override
    void run() {
        System.out.println("스노우 타이어가 굴러갑니다");
    }
}
