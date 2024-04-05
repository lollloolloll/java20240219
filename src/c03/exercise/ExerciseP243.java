package c03.exercise;

public class ExerciseP243 {
    public static void main(String[] args) {


        Car243 myCar = new Car243("벤츠");
        Car243 yourCar = new Car243("포르쉐");
        myCar.run();
        yourCar.run();




    }
}

class Car243 {
    String model;
    int speed;

    Car243(String model) {
        this.model=model;
    }

    void setSpeed(int speed) {
        this.speed=speed;
    }

    void run() {
        this.setSpeed(100);
        System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h");
    }
}

