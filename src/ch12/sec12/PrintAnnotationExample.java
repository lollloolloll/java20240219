package ch12.sec12;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;





public class PrintAnnotationExample {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Method[] methods = Service.class.getDeclaredMethods();

        for (Method method : methods) {
            PrintAnnotation annotation = method.getAnnotation(PrintAnnotation.class);

            printLine(annotation);
            method.invoke(new Service());
            printLine(annotation);
        }
    }

    private static void printLine(PrintAnnotation annotation) {
        int number = annotation.number();
        for (int i = 0; i < number; i++) {
            String value = annotation.value();
            System.out.print(value);
        }
        System.out.println();
    }
}




@Target({METHOD})
@Retention(RUNTIME)
 @interface PrintAnnotation {
    String value() default "-";

    int number() default 15;


}

class Service {
    @PrintAnnotation
    void method1() {
        System.out.println("실행 내용:");
    }
    @PrintAnnotation("*")
    void method2() {
        System.out.println("실행 내용:");
    }
    @PrintAnnotation()
    void method3() {
        System.out.println("실행 내용");
    }

}


