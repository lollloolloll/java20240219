package ch04.lecture.p1lif.p2switch;

public class C05Switch {
    public static void main(String[] args) {

        char grade = 'B';

        switch (grade) {
            case 'A', 'a' -> {
                System.out.println("우수 회원입니다");
            }
            case 'B', 'b' -> {
                System.out.println("일반회원입니다");
            }
            case 'C', 'c' -> {
                System.out.println("손님입니다");
            }
        }
        switch (grade) {
            case 'A', 'a' -> System.out.println("우수회원입니다");
            case 'B', 'b' -> System.out.println("일반회원입니다");
            case 'C', 'c' -> System.out.println("손님입니다");

        }


    }
}
