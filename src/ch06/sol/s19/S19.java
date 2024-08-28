package ch06.sol.s19;

public class S19 {
    public static void main(String[] args) {
        Account account = new Account();

        account.setBalance(10000);
        System.out.println("현재장고 = " + account.getBalance());

        account.setBalance(-100);
        System.out.println("현재장고 = " + account.getBalance());

        account.setBalance(2000000);
        System.out.println("현재장고 = " + account.getBalance());

        account.setBalance(300000);
        System.out.println("현재장고 = " + account.getBalance());
    }
}
class Account{
    static final int MIN_BALANCE = 0;
    static final int MAX_BALANCE = 0;

    private int balance= 0;

    public void setBalance(int balance) {
        if(balance >= MIN_BALANCE && MAX_BALANCE <= balance){
        this.balance = balance;
        }
    }

    public int getBalance() {
        return this.balance;
    }
}
