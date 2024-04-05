package C08.lecture.p1interface;

public class C01InterFace {

    C01ConcreteClass o1 = new C01ConcreteClass();
    C01MyInterface o2= o1;

}


interface C01MyInterface {

}

class C01ConcreteClass implements C01MyInterface {

}
