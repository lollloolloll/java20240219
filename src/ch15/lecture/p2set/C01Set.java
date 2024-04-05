package ch15.lecture.p2set;

import java.util.HashSet;
import java.util.Set;

public class C01Set {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        //추가 add
        set.add(123);
        set.add(123);
        set.add(123);
        set.add(1234);

        System.out.println(set.size()); //4

        //원소가 없을 때만 추가
        set.add(1);//ok
        set.add(23);//x
        System.out.println(set.size());//5

        //원소가 없을 대만 추가
        boolean b1 = set.add(123);//false
        boolean b2 = set.add(142);//true
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);

        //검색
        boolean b3 = set.contains(1423);//false
        boolean b4 = set.contains(123);//true
        System.out.println("b3 = " + b3);
        System.out.println("b4 = " + b4);

        //지우기
        boolean b5=set.remove(123);
        boolean b6=set.remove(12342);
        System.out.println(set.size());//3
        boolean b7=set.remove(123);
        System.out.println(set.size());//3




    }
}
