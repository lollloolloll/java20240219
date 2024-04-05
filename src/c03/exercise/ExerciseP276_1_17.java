package c03.exercise;
/*
1.

3번

2.

4번

3.

1번

4.

1번->3번

5.

1번->3

6.

2번->4

7.

2번

8.

3번->2

9.

1번->2

10.

4번

11.

3번

12.

필드
생성자
메서드

14.

reSet(String name,String id){
this.name=name;
this.id=id;
}

*/



public class ExerciseP276_1_17 {
    public static void main(String[] args) {

        Printer Printer = new Printer(13);
        Printer.println(10);
        Printer.println(true);
        Printer.println(5.7);
        Printer.println("홍길동");

    }


}

 class Printer {
    private int a;
   private boolean b;
   private String s;
   private double d;

    Printer(int a) {
        this.a=a;
    }

    public static void println(int a) {

         System.out.println(a);
    }

    public static void println(boolean b) {

         System.out.println(b);
    }

    public static void println(String s) {
         System.out.println(s);
    }

    public static void println(double d) {
         System.out.println(d);
    }

}


