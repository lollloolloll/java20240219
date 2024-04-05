package c03.exercise;

public class ExerciseP335_11 {
    public static void main(String[] args) {
        MainActivity335 main = new MainActivity335();
        main.onCreate();
    }
}

class Activity335 {
    void onCreate() {
        System.out.println("기본적인 실행 내용");
    }
}

class MainActivity335 extends Activity335 {
    @Override
    void onCreate() {
        super.onCreate();
        System.out.println("추가적인 내용 실행");
    }
}
