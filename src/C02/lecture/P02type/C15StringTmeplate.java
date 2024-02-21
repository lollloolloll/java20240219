package C02.lecture.P02type;

import java.util.Scanner;

public class C15StringTmeplate {

    public static  void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("이름을 입력하세요");
        String name=scanner.nextLine();
        System.out.println("나이를 입력하세요");
        String age=scanner.nextLine();
        System.out.println("주소를 입력하세요");
        String address=scanner.nextLine();


        scanner.close();

    }
}
