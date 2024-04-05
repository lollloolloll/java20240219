package ch12.lecture.p1object;

public class C02ToString {
    public static void main(String[] args) {
        Object o1 = new C02MyClass("son","london",33);
        System.out.println(o1.toString());

        Object o2 = new C02MyClass("lee", "paris", 22);
        System.out.println(o2.toString());
        System.out.println(o2);







    }
}

class C02MyClass {

    private String name;
    private String address;
    private int age;

    public C02MyClass(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
