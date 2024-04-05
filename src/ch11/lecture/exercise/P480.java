package ch11.lecture.exercise;

public class P480 {
    public static void main(String[] args) {

        Account account = new Account();

        account.deposit(10000);
        System.out.println("예금액" + account.getBalance());

        try {
            account.withdraw(30000);
        } catch (InsufficientException e) {
            String message = e.getMessage();
            System.err.println("message = " + message);
        }


    }
}

class InsufficientException extends Exception {
    InsufficientException() {

    }

    InsufficientException(String message) {
        super(message);
    }


}

class Account {
    private long balance;

    public long getBalance() {
        return balance;
    }

    void deposit(int money) {
        balance += money;
    }

    void withdraw(int money) throws InsufficientException {
        if (balance < money) {
            throw new InsufficientException("잔고부족:" + (money - balance) + "모자람");

        }
        balance -= money;
    }

}
