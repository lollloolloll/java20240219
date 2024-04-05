package c03.exercise;

public class ExerciseP228 {
    public static void main(String[] args) {
        Car228 car1 = new Car228("자가용");
        car1.method1();
        Car228 car2 = new Car228("자가용","빨강");
        car2.method1();
        Car228 car3 = new Car228("자가용","검정",200);
        car3.method1();

    }
}

class Car228 {
    String company="현대자동차";
    String model;
    String color;
    int maxSpeed;

    Car228(String model) {
        this(model, "은색", 250);
    }

    Car228(String model, String color) {
        this(model, color, 250);
    }

    public Car228(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    void method1() {
        System.out.println("car.company"+company);
        System.out.println("car.model"+model);
        System.out.println("car.color"+color);
        System.out.println("car.maxspeed"+maxSpeed);
        System.out.println();
    }
}
