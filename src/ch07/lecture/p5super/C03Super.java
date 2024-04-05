package ch07.lecture.p5super;

import ch07.lecture.p1inheritance.C03Polymorphism;

public class C03Super {

}

class C03Parent {


    C03Parent(int age) {

    }

}

class C03Child extends C03Parent {
    C03Child() {
        //상위타입의 파라미터없는 생성자가 없으므로 super()에서 오류남
        super(3);
    }

}
