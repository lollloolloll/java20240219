package c03.exercise;

public class ExerciseP311 {
    public static void main(String[] args) {

        Parent parent = new Child();
        parent.field1 = "data1";
        parent.method1();
        parent.method2();
        /*parent.field2 = "data2";
        parent.method3();*/

        Child child = (Child) parent;
        child.field2 = "data2";
        child.method3();



    }
}

class Parent {
    public String field1;

    void method1() {
        System.out.println("Parent-method1()");
    }
    void method2() {
        System.out.println("Parent-mehotd2()");
    }


}

class Child extends Parent {
    public String field2;

    void method3() {
        System.out.println("child-method3");
    }


}