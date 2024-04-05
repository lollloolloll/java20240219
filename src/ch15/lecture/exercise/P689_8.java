package ch15.lecture.exercise;

import java.util.Objects;
import java.util.Set;
import java.util.*;

public class P689_8 {
    public static void main(String[] args) {

        Set<Student> set = new HashSet<Student>();

        set.add(new Student(1, "홍길동"));
        set.add(new Student(2, "신용권"));
        set.add(new Student(1, "조민우"));

        System.out.println("저장된 객체 수:" + set.size());
        for (Student s : set) {
            System.out.println(s.studentNum + ":" + s.name);
        }





    }
}

class Student {
    int studentNum;
    String name;

    public Student(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentNum == student.studentNum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentNum);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNum=" + studentNum +
                ", name='" + name + '\'' +
                '}';
    }

}
