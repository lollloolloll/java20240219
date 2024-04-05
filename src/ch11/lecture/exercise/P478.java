package ch11.lecture.exercise;

public class P478 {
    public static void main(String[] args) {

        try {
            findClass();
        } catch (ClassNotFoundException e) {
            System.out.println("예외처리:"+e.toString());
        }



    }

    static void findClass() throws ClassNotFoundException {
        Class.forName("Java.lang.String2");

    }


}
