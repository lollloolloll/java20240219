package C08.lecture.exercise;

public class P380 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        driver.drive(bus);
        driver.drive(taxi);



    }
}

interface Vehicle {
    void run();
}

class Driver {
    void drive(Vehicle vehicle) {
        vehicle.run ();
    }
}

class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("버스가 달립니다");
    }
}

class Taxi implements Vehicle {

    @Override
    public void run() {
        System.out.println("택시가 달립니다");
    }
}
