package ch06.lecture.p2method;

public class C04Parameter {
    public static void main(String[] args) {

        C04calculator cal = new C04calculator();
        cal.printSum(2,3);
        cal.printSum(9,13);
        cal.printSum(200,300);


        cal.printDivide(3.14, 0.5);
        cal.printDivide(9.0, 3);
        cal.printDivide(7, 2);



    }

}

class C04calculator{

    void printDivide(double x,double y){
        double result=x/y;

        System.out.println("result = " + result);
    }




    void printSum(int x,int y){
         int result=x+y;

        System.out.println("result = " + result);

    }
}
