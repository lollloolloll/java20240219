package ch07.lecture.p08protected.package2;

import ch07.lecture.p08protected.package1.C01Parent;

public class C01Child extends C01Parent {
    private void method1() {
        //package private     은 접근 불가
        //super.method1();


        //protected은 접근 가능
        super.method2();


    }
}
