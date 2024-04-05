package c03.exercise;

public class ExerciseP156 {
    public static void main(String[] args) {
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";

        if (strVar1 == strVar2) {
            System.out.println("strVar1과strVar2참조가 같음");
        } else {
            System.out.println("strVar1과strVar2참조가 다름");

        }
        if (strVar1.equals(strVar2)) {
            System.out.println("strVar1과strVar2는 문자열이 같음");

        }

        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");

        if (strVar3 == strVar4) {
            System.out.println("Strvar3와strVar4는 참조가같음");


        }else{
            System.out.println("Strvar3와strVar4는 참조가다름");

        }
        String hobby = "";
        if (hobby.equals("")) {
            System.out.println("hobby가 참조하는 String객체는 빈 문자열");
        } if (hobby.isBlank()) {
            System.out.println("hobby가 참조하는 String객체는 빈 문자열");
        } if (hobby.isEmpty()) {
            System.out.println("hobby가 참조하는 String객체는 빈 문자열");
        }






























    }
}
