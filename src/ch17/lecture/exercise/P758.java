package ch17.lecture.exercise;

import java.util.Arrays;
import java.util.List;

public class P758 {
    public static void main(String[] args) {


        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 92),
                new Student("신용권", 95),
                new Student("감자바", 88)
        );

        int sum = studentList.stream()
                .mapToInt(Student::getScore)
                .sum();
        Integer reduce = studentList.stream()
                .map(Student::getScore)
                .reduce(0, (a, b) -> a + b);

        System.out.println("sum = " + sum);
        System.out.println("reduce = " + reduce);


    }
}

class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
