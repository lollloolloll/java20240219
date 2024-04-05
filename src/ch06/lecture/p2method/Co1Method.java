package ch06.lecture.p2method;

public class Co1Method {
    public static void main(String[] args) {
        C01Person person1 = new C01Person();
        C01Person person2 = new C01Person();

        person1.name = "son";
        person2.name = "lee";

        person1.walk();
        person2.walk();
    }
}
class C01Person{

    String name;

    void walk(){
        System.out.println("메서드가 실행하는 코드들");
        System.out.println(name+"걷습니다");
    }
}
