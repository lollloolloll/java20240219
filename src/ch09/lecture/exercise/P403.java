package ch09.lecture.exercise;

public class P403 {
    public static void main(String[] args) {










    }
}

class A403 {
    void useB() {
        class B403 {
            int field1=1;
            static int field2=2;

            B403(){
                System.out.println("B-생성자 실행");
            }
            void method1(){
                System.out.println("B-method1 실행");
            }

            void method2() {
                System.out.println("B-method2 실행");
            }

        }


    }

}
