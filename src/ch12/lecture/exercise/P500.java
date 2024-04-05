package ch12.lecture.exercise;

public class P500 {
    public static void main(String[] args) {


        Student s1 = new Student(1,"홍길동");
        Student s2 = new Student(1,"홍길동");

        if (s1.hashCode() == s2.hashCode()) {
            if (s1.equals(s2)) {
                System.out.println("동등 객체입니다");
            } else {
                System.out.println("데이터가 다릅니다");
            }
        } else {
            System.out.println("해시코드가 다릅니다");
        }

    }
}

class Student {
    private int no;
    private String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    int getNo() {
        return no;
    }
    String getName() {
        return name;

    }

    @Override
    public int hashCode() {
        int hashCode = no + name.hashCode();
        return hashCode;
    }
    public boolean equals(Object obj) {
        if (obj instanceof Student target) {
            if (no == target.getNo() && name.equals(target.getName())) {
                return true;
            }
        }
        return false;

    }


}
