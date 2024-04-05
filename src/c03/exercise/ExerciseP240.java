package c03.exercise;

public class ExerciseP240 {
    public static void main(String[] args) {

        Calculator myCal = new Calculator();
        double result1 = myCal.areaRectangle(10);
        double result2 = myCal.areaRectangle(10, 20);
        double result3 = myCal.lineRectangle(10);
        double result4 = myCal.lineRectangle(10, 20);
        System.out.println("직사각형의 길이" + result1);
        System.out.println("정사각형의 길이" + result2);
        System.out.println("직사각형의 넓이" + result3);
        System.out.println("정사각형의 넓이" + result4);

    }
}
class Calculator{
    int areaRectangle(int a){
        return 4 * a;

    }
    int areaRectangle(int a,int b){
        return (a + b) * 2;

    }

    int lineRectangle(int a) {
        return a*a;

    }

    int lineRectangle(int a, int b) {
        return a*b;
    }

}
