package ch16.lecture.p1lambda;

public class C17ConstructorReference {
    public static void main(String[] args) {

        C17MyInterface1 obj1=C17MyClass::new;
        C17MyInterface2 obj2=C17MyClass::new;





    }
}

interface C17MyInterface1 {
    C17MyClass method();
}

interface C17MyInterface2 {
    C17MyClass method(String s, int i);
}

class C17MyClass {
    C17MyClass() {

    }
    C17MyClass(String s, int i) {

    }
}