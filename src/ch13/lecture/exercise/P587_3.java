package ch13.lecture.exercise;

public class P587_3 {
    public static void main(String[] args) {


        var container1 = new Container3<String, String,Integer>();
        container1.set("홍길동", "도착");
        String name1 = container1.getKey();
        String job = container1.getValue();

        var container2 = new Container3<String, Integer,Integer>();
        container2.set("홍길동", 35);
        String name2=container2.getKey();
        int age=container2.getValue();


    }
}

class Container3<K, V,N> {
    private K key;
    private V value;
    private N brand;

    public K getKey() {
        return key;
    }

    public void set(K key,V value) {
        this.key = key;
        this.value=value;
    }

    public V getValue() {
        return value;
    }

    public N getBrand() {
        return brand;
    }

    public void setBrand(N brand) {
        this.brand = brand;
    }
}

