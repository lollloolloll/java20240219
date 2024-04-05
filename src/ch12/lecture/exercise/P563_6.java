package ch12.lecture.exercise;

public class P563_6 {
    public static void main(String[] args) {


        Member member = new Member("blue", "이파란");
        System.out.println(member);







    }
}

class Member {
    private String id;
    private String name;

    Member(String id, String name) {
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
