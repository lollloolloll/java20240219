package C08.lecture.exercise;

public class p383 {
    public static void main(String[] args) {

        Taxi383 taxi383 = new Taxi383();
        Bus383 bus383 = new Bus383();










    }
    public static void rdie(Vehicle vehicle) {
        vehicle.run();
    }
}

interface Vehicle383 {
    void run();
}

class Bus383 implements Vehicle {
    @Override
    public void run() {
        System.out.println("버스가 달립니다");
    }
    void checkFare() {
        System.out.println("승차요금을 체크합니다");
    }
}

class Taxi383 implements Vehicle {
    @Override
    public void run() {
        System.out.println("택시가 달립니다");
    }
}
