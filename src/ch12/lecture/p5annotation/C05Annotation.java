package ch12.lecture.p5annotation;


@interface MyAnnotation5 {
//element(attribute속성)정의 기능

    String name();
    int type();
    String[] role();


}

@MyAnnotation5(name = "controller", type = 3, role = {"admin","user"})
public class C05Annotation {


}
