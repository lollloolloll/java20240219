package c03.exercise;

public class ExerciseP318 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        driver.drive(bus);


        Taxi taxi = new Taxi();
        driver.drive(taxi);

    }
}

class Vehicle {
    void run() {
        System.out.println("차량이 달립니다");
    }
}

class Bus extends Vehicle {

    @Override
    void run() {
        System.out.println("버스가 달립니다");
    }
}

class Taxi extends Vehicle {
    @Override
    void run() {
        System.out.println("택시가 달립니다");
    }
}

class Driver {
    void drive(Vehicle vehicle) {
        vehicle.run();
    }
}
