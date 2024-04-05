package ch13.lecture.exercise;

public class P578 {
    public static void main(String[] args) {


        var box1 = new Box578<>();//object로 결정
        box1.content = "100";
        Box578 box2 = new Box578<>();//object로 결정
        box2.content = "100";
        var box3 = new Box578<>();
        box3.content = 100;

        boolean result1 = box1.compare(box2);
        System.out.println("result1 = " + result1);
        boolean result2 = box1.compare(box3);
        System.out.println("result2 = " + result2);


    }
}

class Box578<T> {
    T content;


    boolean compare(Box578<T> other) {
        boolean result = content.equals(other.content);
        return result;
    }


}

