package c03.exercise;

class Television {
    static String company = "Mycompany";
    static String model = "LCD";
    static String info;
    static{
         info = company + "-" + model;
    }

}
public class ExerciseP249 {
    public static void main(String[] args) {
        Television televison = new Television();
        System.out.println(televison.info);
    }
}
