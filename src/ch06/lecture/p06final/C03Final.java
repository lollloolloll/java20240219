package ch06.lecture.p06final;

public class C03Final {
    public static void main(String[] args) {
        C03MyClass o = new C03MyClass();
        System.out.println(o.i);

        System.out.println(o.j);

    }

}

class C03MyClass {

    int i;
    final int j=10;
    final int k;
    C03MyClass() {
        this.k=200;
    }


}
