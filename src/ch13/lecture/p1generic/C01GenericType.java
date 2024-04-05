package ch13.lecture.p1generic;

import java.util.stream.Stream;

public class C01GenericType {
    public static void main(String[] args) {

        C01Box box = new C01Box();
        box.setItem("java");
        Object item = (String) box.getItem();
        if (item instanceof String string) {

        }

        C01Box box2 = new C01Box();
        box2.setItem(300);
        Integer item2 =(Integer) box2.getItem();
    }
}

class C01Box {
    private Object item;

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }
}
