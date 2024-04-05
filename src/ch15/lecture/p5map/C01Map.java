package ch15.lecture.p5map;

import java.util.*;
import java.util.Map;

public class C01Map {
    public static void main(String[] args) {


        //map:etnry(key,value)를 저장
        //같은 key를 가진 두개의 entry저장 X


        Map<String,String> map = new HashMap<>();

        //entry추가

        map.put("java", "programming language");
        map.put("css", "style sheet");
        map.put("html", "hypertext markup language ");
        map.put("spring", "java framework");
        map.put("react", "frontend library");
        map.put("react", "frontend library");

        //map 크기
        System.out.println(map.size());//5

        //entry 검색

        boolean a=map.containsKey("java");
        boolean b=map.containsKey("jsp");
        System.out.println(a);
        System.out.println(b);

        //entry 의 value얻기
        String value1 = map.get("java");
        String value2 = map.get("react");
        String value3 = map.get("liberty");
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3+"ㄴㄹㄴㄹㄴㄹ");

        //entry수정

        map.put("java", "프로그래밍 언어");
        String value4 = map.get("java");
        System.out.println("value4 = " + value4);

        if (map.containsKey("css")) {
            map.put("css", "스타일 시트");
        }
        if (map.containsKey("jsp")) {
            map.put("jsp", "java server page");
        }
        System.out.println("map.get(\"css\") = " + map.get("css"));
        System.out.println("map.get(\"jsp\") = " + map.get("jsp"));

        
        //entry 지우기
        System.out.println("map.size()" + map.size());
        map.remove("css");
        System.out.println("map.size()" + map.size());




        //전체탐색
        
        //1.keySet
        Set<String> keys = map.keySet();
        //foreach
        //iterator
        //enhanced for
        for (String num : keys) {
            System.out.println(num+":"+map.get(num));
        }

        //2.entrySet
        System.out.println("### entrySet && enhanced for");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        //forEach
        //iterator
        //enhanced for
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


        //2-1.iterator
        
        //3.forEach
        System.out.println("### forEach 메서드 활용");
        map.forEach((K, V)-> System.out.println(K+":"+V));


    }
}

