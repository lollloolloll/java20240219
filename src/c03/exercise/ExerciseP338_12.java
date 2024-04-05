//package c03.exercise;
//
//public class ExerciseP338_12 {
//
//    public static void main(String[] args) {
//        action(new A());
//        action(new B());
//        action(new C());
//    }
//
//    private static void action(A a) {
//        a.method1();
//
//        if (a instanceof C c) {
//            c.method2();
//        }
//}
//
//class A338 {
//    void method1() {
//        System.out.println("A-mehotd1()");
//    }
//}
//
//class B338 extends A338 {
//
//    void method1() {
//        System.out.println("B-method1()");
//    }
//}
//
//class C338 extends A338 {
//    void method1() {
//        System.out.println("C-method1()");
//    }
//    void method2() {
//        System.out.println("C-method2()");
//    }
//}
//
