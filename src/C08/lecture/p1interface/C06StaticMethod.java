package C08.lecture.p1interface;

public class C06StaticMethod {
    public static void main(String[] args) {

        My_Interface.method1();










    }
}

interface My_Interface {
    //field(public static final)
    //abstract method(public abstract)
    //default method(public insttance)

    //static method(public static)
    static void method1() {
        System.out.println("My_Interface.method1");
    }
}