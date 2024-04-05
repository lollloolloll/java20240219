package ch16.lecture.Exercise;

public class P712 {
    public static void main(String[] args) {


        Person person = new Person();

        Member m1 = person.getMember1(Member::new);
        System.out.println(m1);
        System.out.println();
        Member m2 = person.getMember2(Member::new);
        System.out.println(m2);







    }
}

interface Creatable1 {
    Member create(String id);
}

interface Creatable2 {
    Member create(String id, String name);
}

class Member {
    private String id;
    private String name;

    Member(String id) {
        this.id=id;
        System.out.println("Member.Member");
    }

    Member(String id, String name) {
        this.id=id;
        this.name=name;
        System.out.println("Member.Member");

    }
    @Override
    public String toString() {
        String info = "{id:" + id + " name:" + name + "}";
        return info;
    }



}

class Person{

Member getMember1(Creatable1 creatable) {
    String id = "winter";
    Member member = creatable.create(id);
    return member;
}

Member getMember2(Creatable2 creatable){
    String id = "winter";
    String name = "한겨울";
    Member member = creatable.create(id, name);
    return member;
}


}

