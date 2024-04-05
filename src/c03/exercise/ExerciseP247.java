package c03.exercise;

public class ExerciseP247 {
    public static void main(String[] args) {
        double result1=10*10*Calculator247.pi;
        int result2 = Calculator247.plus(10, 5);
        int result3 = Calculator247.minus(10, 5);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
    }


}

class Calculator247 {
    static double pi=3.14150;

    static int plus(int x, int y) {
        return x + y;
    }

    static int minus(int x, int y) {
        return x - y;
    }




}
