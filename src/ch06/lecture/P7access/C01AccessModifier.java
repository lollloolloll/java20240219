package ch06.lecture.P7access;

public class C01AccessModifier {
    public static void main(String[] args) {

    }

}

class C01MyClass {
    int age;
//public field
    private String address;

//package private
    int  name;

    void method() {

    }


//하나의 파일에 하나의 public class만 작성 가능

        //access modifier(접근제한자,접근제어자");

        //public,protected,private,default");

        //protected:다른패키지라도 상속받으면 접근 가능

        //package private(default):같은 패키지 내에서만 접근가능

        //protected:모든 곳에서 접근 가능(가장 넓은 범위)");

        //private:클래스 내에서만 접근 가능(가장좁은범위)");



}
