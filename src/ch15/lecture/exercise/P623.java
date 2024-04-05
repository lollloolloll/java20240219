package ch15.lecture.exercise;
import java.util.*;
public class P623 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<Member>();
        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));

        System.out.println("총 객체 수:"+set.size());








    }

}

class Member {
    String name;
    int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return name.hashCode()+age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member target) {
            return target.name.equals(name) && (target.age == age);
        }else return false;
    }
}

