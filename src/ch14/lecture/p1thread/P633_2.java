package ch14.lecture.p1thread;

public class P633_2 {
    public static void main(String[] args) {

        Thread thread1 = new MovideThread();
        thread1.start();

        Thread thread2 = new MusicRunnable();
        thread2.start();


    }
}

class MovideThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <3 ; i++) {
            System.out.println("동영상을 재생합니다");
        }
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {

        }
    }
}

class MusicRunnable extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <3 ; i++) {
            System.out.println("음악을 재생합니다");

        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
    }
}
