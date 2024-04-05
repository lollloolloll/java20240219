package ch14.lecture.p1thread;

public class C08Thread {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(()->{
            for (int i = 0; i <30000 ; i++) {
                System.out.println("i = " + i);
            }
        });
        t.start();//쓰레드 시작
        t.join();//현재 쓰레드가 t쓰레드의 종료를 기다림

        for (int i = 0; i < 30000; i++) {
            System.err.println(i);
        }


    }
}
