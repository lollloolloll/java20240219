package ch13.lecture.p1generic;

public class C02GenericType {
    public static void main(String[] args) {

        C02Box<String> box1 = new C02Box<String>();
        C02Box<Integer> box2 = new C02Box<Integer>();


        box1.setItem("java");
        String item1 = box1.getItem();

        box2.setItem(300);
        Integer item2 = box2.getItem();




    }
}
//generic type
//<>:타입 파라미터
//타입파라미터 이름 작성관습
//:대문자 한글자
//T:Type
//E:element
//K:Key
//V:Value
//R:return
//S,U,V:의미없음
//T1,T2
class C02Box<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
