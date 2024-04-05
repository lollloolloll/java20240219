package ch12.lecture.p2wrapper;

public class C04Unboxing {
    public static void main(String[] args) {

        Integer a=3;
        int c = a.intValue();//과거 언박싱
        int b=a;//자동 언박싱

        Long d = 5L;

        long e=d;//자동 언박싱
        double f=e;
        double g=d;//


        Integer h=null;
        int i = h;//auto unboxing


        System.out.println("실행종료");



    }
}
