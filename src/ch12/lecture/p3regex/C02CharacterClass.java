package ch12.lecture.p3regex;

public class C02CharacterClass {
    public static void main(String[] args) {


        System.out.println("a".matches("[abc]"));
        System.out.println("b".matches("[abc]"));
        System.out.println("c".matches("[abc]"));
        System.out.println("".matches("[abc]"));

        String p1 = "[abc][abc][abc]";

        System.out.println("abc");
        System.out.println("bac");
        System.out.println("cab");
        System.out.println("cccbbb");
        System.out.println("bbbbb");
        System.out.println("aaa");

        String p2 = "[a-z]";
        System.out.println("a".matches(p2));
        System.out.println("s".matches(p2));
        System.out.println("z".matches(p2));
        System.out.println("A".matches(p2));
        System.out.println("A".matches(p2));
        System.out.println("Z".matches(p2));
        System.out.println("Z".matches(p2));
        System.out.println("0".matches(p2));

        String p3 = "[a-zA-Z}";//[abcdefghijklmnopqrstuvwxyzABCDEFG}

        String p4 = "[a-zA-Z0-9";
        String p5 = "가-힣";//한글 한글잔

        String p6 = "[^abc]"; //a,b,c외
        System.out.println("a".matches(p6));
        System.out.println("c".matches(p6));
        System.out.println("d".matches(p6));
        System.out.println("d".matches(p6));
        System.out.println("d".matches(p6));


















    }
}
