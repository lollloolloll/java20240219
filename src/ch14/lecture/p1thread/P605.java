package ch14.lecture.p1thread;

public class P605 {
    public static void main(String[] args) {

        SumThread sumthread = new SumThread();
        sumthread.start();
        try {
            sumthread.join();
        } catch (InterruptedException e) {
        }
        System.out.println("1~100의 합:"+ sumthread.getSum());


    }



}

class SumThread extends Thread {
    long sum;

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            sum+=i;

        }
    }
}
