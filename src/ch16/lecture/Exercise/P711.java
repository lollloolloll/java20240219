package ch16.lecture.Exercise;

public class P711 {
    public static void main(String[] args) {


        Person711 person = new Person711();
        person.ordering(String::compareToIgnoreCase);




    }
}

interface Comparable {
    int compare(String a, String b);
}

class Person711 {

    void ordering(Comparable comparable){
    String a = "홍길동";
    String b = "김길동";

    int result = comparable.compare(a, b);

    if(result<0)

    {
        System.out.println(a + "은" + b + "보다 앞에 옵니다");
    }else if(result==0)

    {
        System.out.println(a + "는" + b + "와 같습니다");
    }else{
        System.out.println(a+"는"+b+"보다 뒤에 옵니다");
    }
}

}
