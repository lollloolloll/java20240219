package ch05.lecture.p3enum;

public class C01Enum {

    public static void main(String[] args) {


        MyEnum1 v = MyEnum1.VALUE1;
        MyEnum1 x = MyEnum1.MY_VALUE2;
        MyEnum1 y = MyEnum1.VALUE3;
        MyEnum1 z = MyEnum1.MY_VALUE2;

        System.out.println(v == z);


    }

    enum MyEnum1 {
        VALUE1,
        MY_VALUE2,
        VALUE3,





    }


}
