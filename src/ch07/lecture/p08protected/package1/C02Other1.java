package ch07.lecture.p08protected.package1;

public class C02Other1 {
    private void method1() {
        C01Parent o1 = new C01Parent();


        //package private 접근가능
        o1.method1();
        //protected 접근가능
        o1.method2();



    }
}
