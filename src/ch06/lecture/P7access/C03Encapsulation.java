package ch06.lecture.P7access;

public class C03Encapsulation {
    public static void main(String[] args) {
        C03MyClass obj1 = new C03MyClass();
//        obj1.name = "son";
//        obj1.age = 44;
        System.out.println(obj1.getName("son"));
//        System.out.println(obj1.name);
        System.out.println(obj1.getAge(44));
//        System.out.println(obj1.age);



    }
}

class C03MyClass {
    //필드
    private String name;
    private int age;
    //메서드

    public String getName(String name) {
        this.name=name;
        return name;
    }
    public int getAge(int age) {

        return age;
    }
}
