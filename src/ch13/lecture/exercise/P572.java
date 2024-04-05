package ch13.lecture.exercise;

public class P572 {
    public static void main(String[] args) {


//        Box<String> box1 = new Box<>();
        var box1 = new Box<String>();
        box1.content = "안녕하세요";
        String str = box1.content;
        System.out.println(str);

//        Box<Integer> box2 = new Box<>();
        var box2 = new Box<Integer>();
        box2.content=100;
        int value = box2.content;
        System.out.println(value);


    }
}

class Box<T> {
    T content;
}
