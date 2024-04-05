package ch09.lecture.p1nested;

public class C05EffectivelyFinal {
    void method(int param) {
        param=3;
        int i=3;
        class LocalClass {
            void method() {
                System.out.println(i);
//                System.out.println(param);
            }
        }
    }

    public static void main(String[] args) {





    }
}

