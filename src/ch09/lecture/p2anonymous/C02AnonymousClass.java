package ch09.lecture.p2anonymous;

public class C02AnonymousClass {
    public static void main(String[] args) {
        C02Parent obj = new C02Parent(){
            @Override
            void method1() {
                System.out.println("메서드재ㅓㅈㅇ의");
            }
            //상속된 멤버
             };

        obj.method1();



    }
}

abstract class C02Parent {
    void method1() {
        System.out.println("C02Parent.method1");
    }
}
