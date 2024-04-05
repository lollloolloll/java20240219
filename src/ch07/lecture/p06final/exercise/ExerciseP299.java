package ch07.lecture.p06final.exercise;

public class ExerciseP299 {
    public static void main(String[] args) {

    }
}

class Car {

    int speed;

    void speedUP() {
        speed+=1;
    }

     void stop() {
        System.out.println("차를 멈춤");
        speed=0;
    }

}

class SportsCar extends Car {
    @Override
    void speedUP() {
        speed+=10;
    }
    void stop() {
        System.out.println("스포츠카 멈추기");
        speed=0;
    }
}