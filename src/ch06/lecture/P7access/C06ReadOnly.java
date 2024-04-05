package ch06.lecture.P7access;

//record는 14버전부터 사용가능
//record는 readonly 클래스를 만들때 효율적으로 만들수 있다 아래는 그 예씨
public class C06ReadOnly {
    public static void main(String[] args) {

        C06MyClass1 o1 = new C06MyClass1("son",33);
        System.out.println("o1.getName()=" + o1.getname());
        System.out.println("o1.getAge()" + o1.getAge());
        System.out.println();

        C06myClass2 o2 = new C06myClass2("lee", 44);
        System.out.println("o2.name()" + o2.name());
        System.out.println("o2.age()" + o2.age());



    }
}

// record

record C06myClass2(
        String name,
        int age
) {

}

class C06MyClass1 {

    private String name;
    private int age;
    public String getname() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public C06MyClass1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

