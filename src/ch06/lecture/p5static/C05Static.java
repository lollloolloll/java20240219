package ch06.lecture.p5static;

public class C05Static {

}

class C05MyClass {
    void instruciton() {
        System.out.println("static field");
    }
    static int age=30;
    static double area=Math.PI*10*10;
    static{
        System.out.println("statement ...");
        System.out.println("statement ...");
        System.out.println("statement ...");
        System.out.println("statement ...");

    }


//    void instruciton() {
//        System.out.println("생성자");
//    }
//    void instruciton() {
//        System.out.println("인스턴스 메서드");
//    }
//    void instruciton() {
//        System.out.println("static 메서드");
//    }




}
