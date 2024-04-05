package ch06.lecture.p1field;

public class C03Field {
    class C03Car {
        String color = "black";
        int price = 3000;
    }

    public static void main(String[] args) {
        C03Field outerInstance = new C03Field();
        C03Car car1 = outerInstance.new C03Car();

        System.out.println(car1.color);
        System.out.println(car1.price);
    }
}
