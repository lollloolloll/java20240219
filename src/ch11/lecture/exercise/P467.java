package ch11.lecture.exercise;

public class P467 {
    public static void main(String[] args) {

        System.out.println("[프로그램시작]\n");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("프로그램 종료");


    }


    static void printLength(String data) {
        try {
            int result=data.length();
            System.out.println("문자수:" + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            //e.printStacktrace();
        } finally {
            System.out.println("[마무리 실행]\n");
        }

    }

}
