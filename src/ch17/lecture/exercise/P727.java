import java.util.Arrays;
import java.util.List;

public class P727 {

    public static void main(String[] args) {

        List<Student727> list = Arrays.asList(
                new Student727("홍길동", 10),
                new Student727("신용권", 20),
                new Student727("유미선", 30)
        );

        double avg = list.stream()
                .mapToInt(student -> student.getScore())
                .average()
                .orElse(0.0); // 만약 요소가 없으면 0.0을 반환

        System.out.println("avg = " + avg);
    }
}

class Student727 {
    private String name;
    private int score;

    public Student727(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
