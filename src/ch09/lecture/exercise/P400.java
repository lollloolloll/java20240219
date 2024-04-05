package ch09.lecture.exercise;

public class P400 {
    public static void main(String[] args) {


        A400.B400 b = new A400.B400();
        System.out.println(b.field1);
        b.method1();

        System.out.println(A400.B400.field2);
        A400.B400.method2();









    }
}

class A400 {
    static class B400 {
        int field1=1;
        static int field2=2;

        B400() {
            System.out.println("B-생성자 실행");
        }

        void method1() {
            System.out.println("B-method1실행");
        }

        static void method2() {
            System.out.println("B-method2실행");
        }


    }
}
