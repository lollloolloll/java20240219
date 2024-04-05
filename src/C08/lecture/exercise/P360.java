package C08.lecture.exercise;

public class P360 {
    public static void main(String[] args) {
        Service service = new ServiceImpl();

        service.defaultMethod1();
        System.out.println();
        service.defaultMethod2();
        System.out.println();

        Service.staticMethod1();
        System.out.println();
        Service.staticMethod2();
        System.out.println();














    }
}

interface Service {
    default void defaultMethod1() {
        System.out.println("Service.defaultMethod1 종속 코드");
        defaultCommon();
    }

    default void defaultMethod2() {
        System.out.println("Service.defaultMethod2 종속 코드");
        defaultCommon();
    }

    private void defaultCommon() {
        System.out.println("Service.defaultCommon 중복 코드A");
        System.out.println("Service.defaultCommon 중복 코드B");
    }

    static void staticMethod1() {
        System.out.println("Service.staticMethod1 종속코드");
        staticCommon();
    }
    static void staticMethod2() {
        System.out.println("Service.staticMethod2 종속 코드");
        staticCommon();
    }

    private static void staticCommon() {
        System.out.println("staticMethod 중복코드C");
        System.out.println("staticMethod 중복코드D");
    }




}

class ServiceImpl implements Service {

}
