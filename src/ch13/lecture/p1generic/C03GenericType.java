package ch13.lecture.p1generic;

import javax.swing.*;

public class C03GenericType {
    public static void main(String[] args) {

        C03Box<String, Integer,Double> box1 = new C03Box();
        var box2 = new C03Box<String, Integer,Double>();

        box1.setItem1("java");
        String item1 = box1.getItem1();
        box2.setItem2(300);
        Integer item2 = box1.getItem2();

        box2.setItem3(3.14);
        Double item3 = box2.getItem3();
        box2.setItem1("spring");
        String item4 = box2.getItem1();
    }
}

class C03Box<T,U,S> {
    private T item1;
    private U item2;
    private S item3;
    public T getItem1() {
        return item1;
    }

    public void setItem1(T item1) {
        this.item1 = item1;
    }

    public U getItem2() {
        return item2;
    }

    public void setItem2(U item2) {
        this.item2 = item2;
    }

    public S getItem3() {
        return item3;
    }

    public void setItem3(S item3) {
        this.item3 = item3;
    }
}
