package c03.exercise;

public class ExerciseP225 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.instruction();

        Car car2 = new Car("자가용");
        car2.instruction();

        Car car3 = new Car("자가용", "빨강");
        car3.instruction();

        Car car4 = new Car("택시", "검정", 200);
        car4.instruction();
    }
}

class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    Car() {
    }

    Car(String model) {
        this.model = model;
    }

    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    void instruction() {
        System.out.println("company = " + company);
        System.out.println("model = " + model);
        System.out.println("color = " + color);
        System.out.println("maxSpeed = " + maxSpeed);
        System.out.println();
    }
}
