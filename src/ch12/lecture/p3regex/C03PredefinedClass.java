package ch12.lecture.p3regex;

public class C03PredefinedClass {
    public static void main(String[] args) {

        //[0,9]:\d
        //whitespace:\d
        //word Character[a=zA=z0=9]:


        String p1 = "\\d";
        System.out.println("0".matches(p1));
        System.out.println("5".matches(p1));
        System.out.println("a".matches(p1));
        System.out.println("123".matches(p1));

        System.out.println(" ".matches("\\s"));
        System.out.println("\t".matches("\\s"));
        System.out.println("\n".matches("\\s"));

        String str = "손 흥민";
        str.replaceAll("\\s", "");

    }
}
