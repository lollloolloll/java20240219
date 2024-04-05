package c03.exercise;

public class ExerciseP251 {
    public static void main(String[] args) {
        Car251.simulate(); // 정적 메서드는 클래스 이름으로 직접 호출
        Car251 myCar = new Car251();
        myCar.speed = 60;
        myCar.run();
    }
}

class Car251 {
    int speed;

    void run() {
        System.out.println(speed + "으로 달립니다");
    }

    static void simulate() {
        Car251 myCar = new Car251();
        myCar.speed = 200;
        myCar.run();
    }
}
