package ch17.lecture.exercise;

import ch06.exercise.p13.MemberExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P773_7 {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용관", "개발자")

        );
List<Member>developers=list.stream()
        .filter(m->m.getJob().equals("개발자"))
        .collect(()->new ArrayList<>(),(c,b)->c.add(b),(a,b)->{});

        developers.stream()
                .forEach(d-> System.out.println(d.getName()));


    }
}

class Member {
    String name;
    String job;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Member(String name, String job) {
        this.name = name;
        this.job = job;

    }
}
