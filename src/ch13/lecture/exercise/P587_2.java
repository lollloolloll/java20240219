package ch13.lecture.exercise;

public class P587_2 {
    public static void main(String[] args) {


        Container<String> container1 = new Container<String>();
        container1.set("홍길동");
        String str = container1.get();
        System.out.println(str);

        System.out.println();
        var container2 = new Container<Integer>();
        container2.set(6);
        int value = container2.get();
        System.out.println(value);




    }
}

class Container<T> {
    T result;

    public T get() {
        return result;
    }

    public void set(T result) {
        this.result = result;
    }
}