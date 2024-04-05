package ch13.lecture.p1generic;

public class C09GenericMethod {
    //제네릭 메서드
     public static <T> void method(T para) {

    }

    public static <T> T method1() {
         return null;
    }



    public static void main(String[] args) {

        C07Box<String> box = new C07Box<>();
         method("hello");//java는 파라미터를 보고 type
        // 파라미터 유추
        method(1234);

        String s = method1();
        Integer i = method1();
        int d = method1();




    }

}

class Box<T> {

}

interface Container<T> {

}
