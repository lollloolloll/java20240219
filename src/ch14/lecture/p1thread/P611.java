package ch14.lecture.p1thread;

public class P611 {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        User1Thread user1Thread = new User1Thread(calculator);
        user1Thread.start();

        User2Thread user2Thread = new User2Thread(calculator);
        user2Thread.start();

    }
}

class Calculator {
    private int memory;

    public int getMemory() {
        return memory;
    }

    public synchronized void setMemory(int memory) {
        this.memory = memory;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ": " + this.memory);
    }
}

class User1Thread extends Thread {
    private Calculator calculator;

    public User1Thread(Calculator calculator) {
        this.calculator = calculator;
        setName("User1Thread");
    }

    @Override
    public void run() {
        calculator.setMemory(100);
    }
}

class User2Thread extends Thread {
    private Calculator calculator;

    public User2Thread(Calculator calculator) {
        this.calculator = calculator;
        setName("User2Thread");
    }

    @Override
    public void run() {
        calculator.setMemory(50);
    }
}
