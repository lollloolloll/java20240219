package ch09.lecture.exercise;

public class P395 {
    public static void main(String[] args) {


        A395 a = new A395();
        A395.B395 b = a.new B395();



    }
}

class A395 {
    class B395 {

    }

    B395 field = new B395();
    A395() {
        B395 b = new B395();
    }

    void method() {
        B395 b = new B395();
    }
}
