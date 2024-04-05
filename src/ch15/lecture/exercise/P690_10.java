package ch15.lecture.exercise;

import java.util.Comparator;
import java.util.TreeSet;

public class P690_10 {
    public static void main(String[] args) {

        TreeSet<Student10> treeSet = new TreeSet<Student10>(new Comparator<Student10>() {
            @Override
            public int compare(Student10 o1, Student10 o2) {
                if(o1.score>o2.score)return 1;
                else if(o1.score==o2.score)return 0;
                else return -1;
            }
        });
        treeSet.add(new Student10("hong", 86));
        treeSet.add(new Student10("white", 92));
        treeSet.add(new Student10("blue", 96));

        Student10 student10 = treeSet.last();
        System.out.println("최고 점수:" + student10.score);
        System.out.println("최고 점수를 받은 아이디:" + student10.id);



    }
}

class Student10{
    String id;
    int score;

    public Student10(String id, int score) {
        this.id = id;
        this.score = score;
    }



}
