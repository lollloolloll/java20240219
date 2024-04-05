package ch06.lecture.p3constructor;

public class C09DefaultConstructor {
    public static void main(String[] args) {
        C09MyClass1 obj1 = new C09MyClass1(33);
        C09MyClass2 obj2 = new C09MyClass2();
        C09MyClass3 obj3 = new C09MyClass3();















    }
}

class C09MyClass4 {
    int age;

    public C09MyClass4(int age) {
        this.age = age;
    }

    C09MyClass4() {

    }
}

class C09MyClass3 {
    void instruction() {
        System.out.println("필드X");
        System.out.println("생성자X");
        System.out.println("(defaultConstructor");
        System.out.println("파라미터없는 생성자,기본생성자");
        System.out.println("생성자를 작성하지않으면 파라미터없는 생성자 자동 추가");
    }
}

class C09MyClass2 {
    public C09MyClass2() {

    }
    }

class C09MyClass1 {
    int age;

    public C09MyClass1(int age) {
        this.age = age;
    }
}