package c03.exercise;

public class ExerciseP280_19 {
    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(10000);
        System.out.println("현재잔고:"+account.getBalance());
        account.setBalance(-100);
        System.out.println("현재잔고:" + account.getBalance());
        account.setBalance(2000000);
        System.out.println("현재잔고:" + account.getBalance());
        account.setBalance(300000);
        System.out.println("현재잔고:" + account.getBalance());

    }

}

class Account {
    static private final int MIN_BALANCE=0;
    static private final int MAX_BALANCE=1000000;
    private int balnace=0;


    public int getBalance() {
        return balnace;
    }

    public int setBalance(int balance) {
        if(MIN_BALANCE<=balance&&MAX_BALANCE>=balance)
        this.balnace=balance;
        return this.balnace;
    }










}
