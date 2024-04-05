package ch15.lecture.exercise;

import java.util.*;

public class P674 {
    public static void main(String[] args) {


        TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new FruitComparator());

        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("수박", 1000));
        treeSet.add(new Fruit("딸기", 6000));

        for (Fruit fruit : treeSet) {
            System.out.println(fruit.name+":"+fruit.price);
        }


   }
}

class Fruit {
    String name;
    int price;

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

class FruitComparator implements Comparator<Fruit> {

    @Override
    public int compare(Fruit o1, Fruit o2) {
        if (o1.price < o2.price) return -1;
        else if(o1.price==o2.price) return 0;
        else return 1;
    }
}
