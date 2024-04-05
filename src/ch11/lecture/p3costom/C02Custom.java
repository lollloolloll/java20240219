package ch11.lecture.p3costom;

public class C02Custom {
    public static void main(String[] args) {

        try {
            method1();
        } catch (Exception e) {
//            e.printStackTrace();
            String message = e.getMessage();
            System.out.println("message = " + message);


        }
        System.out.println("this is next code");

    }


    static void method1() throws Exception {
        throw new Exception("시간 초과");
    }
}
