package C02.lecture.P02type;

import java.util.Random;
import java.util.Scanner;

public class exercise {

    public static void main(String[] args) {

//        System.out.print("생성할 난수의 개수를 입력하세요: ");
//        int count = scanner.nextInt();

        Random random = new Random();

        while(true) {
            int randomNumber = random.nextInt();
            System.out.println(randomNumber);
        }

    }
}
