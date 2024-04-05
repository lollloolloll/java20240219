package ch13.lecture.exercise;

public class P573 {
    public static void main(String[] args) {


        Product<Tv, String> product1 = new Product<>();

        product1.setKind(new Tv());
        product1.setModel("스마트Tv");

        Tv tv = product1.getKind();
        String tvModel = product1.getModel();
        System.out.println("tvModel = " + tvModel);
        System.out.println("tv = " + tv);

        Product<Car, String> product2 = new Product<>();

        product2.setKind(new Car());
        product2.setModel("SUV자동차");

        Car car = product2.getKind();
        String carModel = product2.getModel();
        System.out.println("carModel = " + carModel);
        System.out.println("car = " + car);


    }
}

class Product<K, M> {
    private K kind;
    private M model;

    public K getKind() {
        return kind;
    }

    public void setKind(K kind) {
        this.kind = kind;
    }

    public M getModel() {
        return model;
    }

    public void setModel(M model) {
        this.model = model;
    }
}

class Tv {

}

class Car {

}

