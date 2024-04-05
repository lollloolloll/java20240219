package c03.exercise;

public class ExerciseP329 {
    public static void main(String[] args) {
        Dog329 dog = new Dog329();
        dog.sound();

        Cat329 cat = new Cat329();
        cat.sound();

        animalSound(new Dog329());
        animalSound(new Cat329());



    }

    static void animalSound(Animal329 animal) {
        animal.sound();

    }

}

abstract class Animal329 {
    void breathe() {
        System.out.println("숨을 쉽니다");
    }

    abstract void sound() ;

}

class Dog329 extends Animal329 {
    void sound() {
        System.out.println("멍멍ㅁ엄어멍");
    }
}

class Cat329 extends Animal329 {
    @Override
    void sound() {
        System.out.println("냐냐냐냐냐냐냔");
    }
}