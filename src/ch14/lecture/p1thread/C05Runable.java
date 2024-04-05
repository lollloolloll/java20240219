package ch14.lecture.p1thread;

import java.awt.*;

public class C05Runable {
    public static void main(String[] args) {
        //2,Rubable인터페이스 구현

        //runable 메서드 재정의
        Thread t = new Thread(new MyThread5());
        for (int i = 0; i < 30000; i++) {
            System.out.println(i);
        }
    }
}

class MyThread5 implements Runnable {
    public void run(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i <5 ; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }
}

