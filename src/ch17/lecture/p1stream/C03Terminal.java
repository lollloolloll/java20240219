package ch17.lecture.p1stream;

import java.util.List;

public class C03Terminal {
    public static void main(String[] args) {
        
        
        
        //(terminal operation)
        
        
        //anyMatch


        List<String> list = List.of("java", "css", "react", "spring", "hello world");
        
        //anyMatch
        boolean css = list.stream()
                .anyMatch(e -> e.equals("css"));
        System.out.println("css = " + css);

        boolean jsp = list.stream()
                .anyMatch(e -> e.equals("jsp"));
        System.out.println("jsp = " + jsp);

        boolean hasBlank = list.stream()
                .anyMatch(e -> e.contains(" "));
        System.out.println("hasBlank = " + hasBlank);

        boolean threeAndMore = list.stream()
                .allMatch(e -> e.length() >= 10);
        System.out.println("threeAndMore = " + threeAndMore);

        boolean lessTen = list.stream()
                .allMatch(e -> e.length() < 10);
        System.out.println("lessTen = " + lessTen);

    }
}
