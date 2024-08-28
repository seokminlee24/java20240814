package ch06.sol.s20;

public class Account {
    String number;
    String name;
    int balance;

    public Account(String number, String owner, int balance) {
        this.number = number;
        this.name = owner;
        this.balance = balance;
    }

    public void setNumber(String number) {
        this.number =number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
}
