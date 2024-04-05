package c03.exercise;

public class ExerciseP294 {
    public static void main(String[] args) {
        int r=10;

        Calculator294 calculator = new Calculator294();
        System.out.println("원 면적" + calculator.areaCircle(r));
        System.out.println();
        Computer294 computer = new Computer294();
        System.out.println("원 면적" + computer.areaCircle(r));
    }
}

class Calculator294 {
    public double areaCircle(double r) {
        System.out.println("Calculator 객체의 areaCircle()실행");
        return 3.1491592*r*r;
    }
}

class Computer294 extends Calculator294 {
    public double areaCircle(double r) {
        System.out.println("computer 객체의 areaCircle() 실행");
        return Math.PI*r*r;
    }
}
