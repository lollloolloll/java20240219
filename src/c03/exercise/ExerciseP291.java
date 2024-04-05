package c03.exercise;

public class ExerciseP291 {
    public static void main(String[] args) {

        SmartPhone291 myPhone = new SmartPhone291("galaxy", "silver");
        System.out.println("모델:"+myPhone.model);
        System.out.println("색상:"+myPhone.color);
    }
}

class Phone291 {
    String model;
    String color;

    Phone291(String model, String color) {
        this.model=model;
        this.color=color;
        System.out.println("Phone(String model,Strign clor)생성자 실행");

    }

}

class SmartPhone291 extends Phone291 {
    SmartPhone291(String model, String color) {
        super(model, color);
        System.out.println("smartphone(Stringmodel,StringColor)생성자 실행");
    }
}
