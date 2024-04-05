package ch09.lecture.p2anonymous;

import java.util.Arrays;
import java.util.Random;

public class C07Sample {
    public static void main(String[] args) {

        //TODO:null대신 익명클래스 객체 코드 작성
        Game rpsgame = new Game() {
            @Override
            public void play() {
                String[] rps = {"가위", "바위", "보"};
                Random random = new Random();
                int randomIndex = random.nextInt(3);
                System.out.println(rps[randomIndex]);

            }
        };
        rpsgame.play();//"rock,sciesor.paper

        Game lottogame1 = new Game() {
            @Override
            public void play() {
                Random random = new Random();
                int randomnumber = random.nextInt(45) + 1;
                System.out.println(randomnumber);
            }
        };
        Game lottogame2 = new Game() {
            @Override
            public void play() {
                Random random = new Random();
                int[] select = new int[6];
                for (int i = 0; i < 6; i++) {
                    int check = 0;
                    select[i] = random.nextInt(45) + 1;
                    while (check < i) {
                        if (select[i] == select[check]) {
                            i--;
                            break;
                        }else{check++;}
                    }
                }

                System.out.println(Arrays.toString(select));
            }



        };
        lottogame2.play();


    }
}

interface Game {
    void play();
}

