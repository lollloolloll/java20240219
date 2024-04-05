package ch11.lecture.exercise;

public class P479 {
    public static void main(String[] args) throws ClassNotFoundException {

        try {
            findclass();
        } finally {
            System.out.println("this is next code");
        }


    }

    static void findclass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }



}
