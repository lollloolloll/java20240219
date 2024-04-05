package c03.exercise;

public class ExerciseP308 {

    public static void main(String[] args) {


        Parent308 parent = new Child308();
        parent.method1();
        parent.method2();
//        parent.method3(); 호출 불가
//        Child308 child = (Child) parent;
//        child.field2 = "data2";
//        child.method3();




    }
}

class Parent308 {
    void method1() {
        System.out.println("Parent=method1()");

    }

    void method2() {
        System.out.println("Parent=method2()");

    }
}

class Child308 extends Parent308 {

    @Override
    void method2() {
        System.out.println("Child-method123()");

    }
    void method3() {
        System.out.println("Child-method3()");
    }
}
