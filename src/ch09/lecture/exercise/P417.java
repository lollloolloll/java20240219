package ch09.lecture.exercise;

public class P417 {
    public static void main(String[] args) {
        Home417 home417 = new Home417();

        home417.use1();
        home417.use2();
        home417.use3(new RemoteControl417() {
            @Override
            public void turnOn() {
                System.out.println("난방을 켭니다");
            }

            @Override
            public void turnOff() {
                System.out.println("난방을 끕니다");
            }
        });


    }
}

interface RemoteControl417 {
    void turnOn();

    void turnOff();
}

class Home417 {
    private RemoteControl417 rc = new RemoteControl417() {
        @Override
        public void turnOn() {
            System.out.println("Tv를 켭니다");
        }

        @Override
        public void turnOff() {
            System.out.println("Tv를 끕니다");
        }
    };

    void use1() {
        rc.turnOn();
        rc.turnOff();
    }

    void use2() {
        RemoteControl417 rc = new RemoteControl417() {
            @Override
            public void turnOn() {
                System.out.println("에어컨을 켭니다");
            }

            @Override
            public void turnOff() {
                System.out.println("에어컨을 끕니다");
            }
        };
        rc.turnOn();
        rc.turnOff();
    }

    void use3(RemoteControl417 rc) {
        rc.turnOn();
        rc.turnOff();
    }


}
