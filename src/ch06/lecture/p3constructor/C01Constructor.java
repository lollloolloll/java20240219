package ch06.lecture.p3constructor;

public class C01Constructor {
    public static void main(String[] args) {
        C01MyClass obj = new C01MyClass();

    }
}

class C01MyClass {

    void instruction() {
        System.out.println("생성자:constructor");
        System.out.println("객체 생성시 실행되는 코드블럭");
        System.out.println("생성자 이름은 클래스 이름과 같음)");
        System.out.println("필요하면 파라미터 작성가능");


        System.out.println("객체 생성시 실행되어야 하는 코드들");
        System.out.println("주로 필드값 초기화");
        System.out.println("초기설정");
    }
}
