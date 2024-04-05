package c03.exercise;

public class ExerciseP253 {
    public static void main(String[] args) {
        Korean253 k1 = new Korean253("123456-1234567","김자바");

        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        k1.name = "김자바";
    }
}

class Korean253 {
    final String nation = "대한민국";
    final  String ssn;

    String name;

    public Korean253(String ssn, String name) {
        this.ssn=ssn;
        this.name=name;
    }

}
