package c03.exercise;

public class ExerciseP290 {
    public static void main(String[] args) {
        SmartPhone290 myPhone = new SmartPhone290("갤럭시","은색");
        System.out.println("모델"+myPhone.model);
        System.out.println("색상"+myPhone.color);


    }
}

class Phone290 {
    String model;
    String color;

    public Phone290() {
        System.out.println("Phone의 생성자 실행");
    }
}

class SmartPhone290 extends Phone290 {
    SmartPhone290(String model, String color) {
        super();
        this.model=model;
        this.color=color;
        System.out.println("smartphone(string mode),string color)생성자 실행됨" );

    }


}
