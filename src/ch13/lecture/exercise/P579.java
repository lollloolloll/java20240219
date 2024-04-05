package ch13.lecture.exercise;

public class P579 {
    static <T> Box579<T> boxing(T t) {
        Box579<T> box = new Box579<T>();
        box.set(t);
        return box;
    }
    public static void main(String[] args) {
        Box579<Integer> box1 = boxing(100);
        int intValue = box1.get();
        System.out.println(intValue);

        Box579<String> box2 = boxing("홍길동");
        String strValue = box2.get();
        System.out.println(strValue);




    }
}

class Box579<T> {
    private T t;

    T get() {
        return t;
    }

    void set(T t) {
        this.t=t;
    }

}
