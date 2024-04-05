package ch05.lecture.p2string;

public class C02String {
    public static void main(String[] args) {
        String a = "son";
        String b = "lee";
        String c = "son";
        String d;
        d = "son";

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(d));
        System.out.println("string비교는 equals사용(문자내용비교)");































    }
}
