package ch12.lecture.p3regex;

public class C06BeginEnd {
    public static void main(String[] args) {
        
        
        //^(caret):시작
        //$:끝


        String s = ",,abc,def,,,xyz,,,";
        System.out.println("s  = " + s);
        String s1 = s.replaceAll(",+", "");
        System.out.println("s1 = " + s1);

        String s2 = s1.replace("^", "hi");
        System.out.println("s2 = " + s2);

        String s3=s1.replaceAll("^,+", "");
        System.out.println("s3 = " + s3);

        String s4 = s1.replaceAll("$", "hello");
        System.out.println("s4 = " + s4);
        String s5 = s1.replaceAll(",+$", "");
        System.out.println("s5 = " + s5);
        
        
    }
}
