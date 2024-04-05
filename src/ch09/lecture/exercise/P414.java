package ch09.lecture.exercise;

import ch06.sec12.kumho.Tire;

public class P414 {
    public static void main(String[] args) {
        Car414 car = new Car414();

        car.run1();

        car.run2();

        car.run3(new Tire414() {
            @Override
            void roll() {
                System.out.println("익명 자식 Tire객체 3이 굴러갑니다");
            }
        });


    }
}

class Tire414 {
    void roll() {
        System.out.println("일반 타이어가 구릅니다");
    }
}

class Car414 {
    private Tire414 tire1 = new Tire414();
    private Tire414 tire2 = new Tire414() {
        @Override
        void roll() {
            System.out.println("익명 자식 Tire414객체 1이 구릅니다");
        }
    };

    void run1() {
        tire1.roll();
        tire2.roll();
    }

    void run2() {
        Tire414 tire = new Tire414() {
            @Override
            void roll() {
                System.out.println("이겸ㅇ 자식 Tire414객체 2가 굴구릅니다");
            }
        };
        tire.roll();
    }

    void run3(Tire414 tire) {
        tire.roll();
    }


}
