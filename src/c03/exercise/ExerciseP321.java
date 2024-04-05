package c03.exercise;

import org.lwjgl.fmod.FMOD_STUDIO_EVENT_CALLBACK;

public class ExerciseP321 {
    public static void main(String[] args) {














    }
}

class InstanceofExample {

    static void personInfo(Person person) {
        System.out.println("name"+person.name);
        person.walk();
        if (person instanceof Student student) {
            System.out.println("student"+student.studentNo);

        }
    }

    public static void main(String[] args) {

    }
}

class Person {
    public String name;

    Person(String name) {
        this.name=name;
    }

    void walk() {
        System.out.println("걷습니다");
    }
}

class Student extends Person {
    int studentNo;

    public Student(String name, int studentNo) {
        super(name);
        this.studentNo = studentNo;
    }

    void study() {
        System.out.println("공부를 합니다");
    }
}
