package ch05.lecture.p3enum;

public class C02Enum {


    public static void main(String[] args) {

        Season s = Season.FALL;

        switch (s) {
            case SPRING -> System.out.println("봄이네요");
            case SUMMER -> System.out.println("여름ㅋ");

            case FALL -> System.out.println("가을");

            case WINTER -> System.out.println("겨울");
        }

        System.out.println(s.name());
        System.out.println(s.ordinal());

        System.out.println(s.toString());
        System.out.println(s.hashCode());
        s.printDescription();

    }


    enum Season {
        SPRING, SUMMER, FALL, WINTER;

         void printDescription() {
            System.out.println(this.name()+"이네요");
        }


    }



}
