package ch17.lecture.p3optional;

import java.util.Optional;
import java.util.OptionalInt;

public class C02Primitive {
    public static void main(String[] args) {


       //OptionalInt
       //OptionalDouble
        //OptionalLong
        //:값을 가질수 있근 상태



//만드는법
        OptionalInt o1 = OptionalInt.of(3);
       OptionalInt o2= OptionalInt.of(3);
        OptionalInt o3 = OptionalInt.empty();


        //isPresent:값이 있으면 true
        o1.isPresent();
        o3.isPresent();
        o1.isEmpty();
        o3.isEmpty();

        //isEmpty:값이 없으면 true

        o1.getAsInt();
//        o3.getAsInt();//exception

        //getAsInt:값 얻기(없으면 exceptional)


        o1.getAsInt();
//        o3.getAsInt();//exception

        //orElse:값 없으면 기본값으로 얻기

        o1.orElse(0);
        o3.orElse(0);

    }
}
