//package ch06.lecture.p5static;
//
//public class C01Static {
//    public static void main(String[] args) {
//        C01MyClass o1 = new C01MyClass();
//        o1.name = "son";
//        C01MyClass o2 = new C01MyClass();
//        o2.name = "lee";
//
//        //참조변수로 static멤버 사용하는건 권장하지 않음
////        o1.location = "seoul";
//
//        C01MyClass.location = "seoul";
//        System.out.println("o1 = " + o1);
//        System.out.println("o2 = " + o2);
//        System.out.println("o1.location = " + o1.location);
//        System.out.println("o2.location = " + o2.location);
//
//        //static메서드는 클래스로 접근해서 실행시키는 것을 권장
//        o1.method2();
//        C01MyClass.method2();
//
//    }
//
//}
//
//class C01MyClass {
//    //인스턴스 필드(인스턴스 변수)
//    String name;
//    //static 필드(class 변수)
//    static String location;
//
//    void method1() {
//
//    }
//}
//
