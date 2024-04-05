package ch06.lecture.p2method;

import org.lwjgl.util.zstd.ZSTDOutBuffer;

import java.util.Random;

public class C10Return {
    C10MyClass o = new C10MyClass();
    int a = o.method1();
    int c = 10 / o.method1();

}
class C10MyClass{
    int method1() {

        System.out.println("메서드 종료 값반환");
        return 5;

    }
    double method2() {
        return 3.14;
    }

    String method3() {
        return "hello";
    }

    long method4() {
        return 10;
    }

    double method5() {
        return 10;
    }

    void method6() {

    }

    int method7(int bound) {
        Random random = new Random();
        return random.nextInt();
    }

}
