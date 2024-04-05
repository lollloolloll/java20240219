import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class C02For {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < 6; i++) {
            System.out.println("*****");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");

        for (int i = 0; i < 10; i++) {
            for (int j = 10; j > i; j--) {
                System.out.print("*");
            }
            System.out.println("");

        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < 6; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("#");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < 6; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("#");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        int temp = 1;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(temp);
                temp = (temp + 1) % 10;

            }
            System.out.println("");


        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        int x, y;
        for (x = 1; x <= 10; x++) {
            if ((60 - 4 * x) % 5 == 0) {
                y = (60 - 4 * x) / 5;
                System.out.println("(" + x + "," + y + ")");

            }

        }
        System.out.println();
        System.out.println();
        System.out.println();
        int a = 0, b = 0;
        while (a + b != 5) {
            a = (int) (Math.random() * 6) + 1;
            b = (int) (Math.random() * 6) + 1;
            if (a + b == 5) {
                System.out.println("(" + a + "," + b + ")");

            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");

        int k, i, j, minus = 1, plus = 1;
        for (i = 0; i < 13; i++) {
            for (j = 0; j <= 13 - minus; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= plus; k++) {
                System.out.print("*");
            }
            System.out.println();
            minus += 1;
            plus += 2;

        }
        int max = plus;
        minus = 13;
        plus = 1;
        for (i = 0; i <= 13; i++) {
            for (j = 1; j <= 13 - minus; j++) {
                System.out.print(" ");
            }
            for (k = max; k >= plus; k--) {
                System.out.print("*");
            }

            System.out.println();
            minus -= 1;
            plus += 2;
        }
        minus = 1;
        plus = 1;
        for (i = 0; i < 13; i++) {
            for (j = 0; j <= 13 - minus; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= plus; k++) {
                System.out.print("*");
            }
            System.out.println();
            minus += 1;
            plus += 2;

        }
        max = plus;
        minus = 13;
        plus = 1;
        for (i = 0; i <= 13; i++) {
            for (j = 1; j <= 13 - minus; j++) {
                System.out.print(j);
            }
            for (k = max; k >= plus; k--) {
                System.out.print("");
            }

            System.out.println();
            minus -= 1;
            plus += 2;
        }



        System.out.println();
        System.out.println();
        System.out.println();
        minus = 13;
        temp = 0;


        int n = 13; // 행의 개수

        // 숫자 삼각형 출력
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println(); // 공백 줄 추가

        // 공백 삼각형 출력
        for (i = 0; i < n; i++) {
            // 왼쪽 공백 출력
            for (j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // 숫자 출력
            for (j = 0; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println(); // 줄 바꿈

        }
        System.out.println();
        System.out.println();
        System.out.println();



        int selection = 0, balance = 0, input = 0, output = 0;
        while (selection != 4) {
            System.out.println("--------------------");
            System.out.println("1.예금| 2.출금| 3.잔고| 4.종료");
            System.out.println("--------------------");

            System.out.print("선택>");
            selection = scanner.nextInt();
            if (selection == 1) {
                System.out.print("예금액>" );
                input = scanner.nextInt();

                System.out.println("예금액>"+input );
                balance += input;

            } else if (selection == 2) {
                System.out.print("출금액>" );
                output = scanner.nextInt();

                System.out.println("출금액>"+output );
                balance -= output;
                if(balance<0){
                    System.out.print("잔액부족입니다");
                    balance+=output;
                }

            } else if (selection == 3) {
                System.out.print("잔고>" + balance);
            } else if (selection == 4) {
            } else {
                System.out.println("유효하지않는 입력값 입니다");
            }


        }
        System.out.println("프로그램 종료");


    }
}
