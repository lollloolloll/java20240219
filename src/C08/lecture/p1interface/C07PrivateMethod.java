package C08.lecture.p1interface;

public class C07PrivateMethod {


}

interface C07MyInterface {
    //public static final field
    //public abstract instance method
    //public default method
    //public static method

    //private instance method
    //private static method

    default void method1() {
        System.out.println("C07MyInterface.method1");
        extracted();
    }

    default void method2() {
        System.out.println("C07MyInterface.method2");
        extracted();

    }
    private void extracted() {
        System.out.println("두 메소드의 중복된 코드");

    }
}
