package C02.lecture.P02type;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // 배열 스트림 생성
        IntStream stream = Arrays.stream(array);

        // 중간 연산: 짝수만 필터링하여 출력
        stream.filter(n -> n % 2 == 0)
                .forEach(System.out::println); // 최
        // 종 연산
    }
}
