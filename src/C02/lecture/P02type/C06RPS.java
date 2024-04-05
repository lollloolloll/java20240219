package C02.lecture.P02type;

import java.util.Random;
import java.util.Scanner;

public class C06RPS {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println(" 가위,바위,보");
        while (true) {
            int user = Integer.parseInt(scanner.nextLine());
            int computer = random.nextInt(1, 4);
            String result= computer==1?"pc:가위":computer==2?"pc:바위":"pc:보";
            System.out.println(result);


        }
    }
}
