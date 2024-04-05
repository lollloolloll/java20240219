package ch07.lecture.p7object;

public class C03Sample {
    public static void main(String[] args) {


        Shape shape1 = new Round(3);
        Shape shape2 = new Rectangle(5, 7);
        shape1.printArea();//원넓이
        shape2.printArea();//사각형넓이


        printDescription(shape1);//r=3,넓이
        printDescription(shape2);//"가로5,세로7 넓이35
    }

    static void printDescription(Object o) {
        System.out.println(o.toString());
    }


}

abstract class Shape {
    public abstract void printArea();
}

class Round extends Shape {
    int a;

    public Round(int a) {
        this.a=a;
    }

    @Override
    public void printArea() {
        System.out.println(a*a*Math.PI);
    }

    @Override
    public String toString() {
        return "이것은 원의 넓이입니다";
    }
}

class Rectangle extends Shape {
int a;int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override

    public void printArea() {
        System.out.println(a*b);
    }

    @Override
    public String toString() {
        return "이것은 사각형의 넓이입니다";
    }
}

