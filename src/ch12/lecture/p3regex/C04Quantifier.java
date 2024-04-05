package ch12.lecture.p3regex;

public class C04Quantifier {
    public static void main(String[] args) {


        //수량자
        //{n}: 정확히n번
        //{n,m}
        // n~m 번

        //{n.}:n번 이상
        // +: {1,}:1번이상
        // *: {0,}:1번이상
        // ?: {0,1}: 한번 또는 없음
        //{n}:n번


        String p1 = "\\d{3}";
        System.out.println("012".matches(p1));
        System.out.println("892".matches(p1));
        System.out.println("89z".matches(p1));
        System.out.println("6".matches(p1));

        System.out.println();
        System.out.println();
        String p2 = "010-\\d{4}-\\d{4}";
        System.out.println("010-1234-9876".matches(p2));
        System.out.println("999-1234-9876".matches(p2));
        System.out.println("010-1234-9876".matches(p2));
        System.out.println("010-3333-222".matches(p2));
        System.out.println("01099405684".matches(p2));
        System.out.println();
        System.out.println();

        //{n,m}
        String p3 = "[가-힣]{3,4}";
        System.out.println("손흥민".matches(p3));
        System.out.println("이강인".matches(p3));
        System.out.println("대한 민국".matches(p3));
        System.out.println("한국".matches(p3));
        System.out.println("서울 특별시".matches(p3));
        System.out.println();
        System.out.println();
        //{n,}
        String p4 = "[가-힣]{2,}";
        System.out.println("손흥민".matches(p4));//true
        System.out.println("이강인".matches(p4));//true
        System.out.println("대한 민국".matches(p4));//false
        System.out.println("한국".matches(p4));//true
        System.out.println("서울 특별시".matches(p4));//false
        System.out.println("한".matches(p4));//false
        System.out.println("".matches(p4));//false
        System.out.println("한국 seoul".matches(p4));//false
        System.out.println();
        System.out.println();
        //영문대소문자와 한글 한글자 이상
        String p5= "[a-zA-Z가-힣]{1,}";
        System.out.println("한국".matches(p5));//true
        System.out.println("korea".matches(p5));//true
        System.out.println("seoul한국".matches(p5));//true
        System.out.println("seoul 한국".matches(p5));//false
        System.out.println();
        System.out.println();
        //?==={0,1}
        String p6 = "010-{0,1}\\d{4}-?\\d{4}";
        System.out.println("010-9393-2412".matches(p6));//true
        System.out.println("01099933222".matches(p6));//true
        System.out.println("0109993-3222".matches(p6));//true
        System.out.println("010-99933222".matches(p6));//true
        System.out.println();
        System.out.println();
        //+:1번 이상
        String p7 = "\\w+";
        System.out.println("9123jdf".matches(p7));//true
        System.out.println(" ".matches(p7));//false
        System.out.println();
        System.out.println();
        //*:0번 이상
        String p8 = "\\w*";
        System.out.println("983jF_83jf".matches(p8));//true
        System.out.println(" ".matches(p8));//true


    }
}
