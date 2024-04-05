package ch11.lecture.p2throw;

public class C05Throw {
    public static void main(String[] args) {


        try {
            someMethod3();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getException());
        }


    }


    static void someMethod1()throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }

    static void someMethod2() throws ClassNotFoundException {
        someMethod1();
    }

    static void someMethod3()throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }

}
