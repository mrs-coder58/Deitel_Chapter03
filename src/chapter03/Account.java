package chapter03;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance){
        this.name=name;
        if(balance > 0.0){
            this.balance=balance;
        }
    }
    public void deposit(double depositAmount){
        if(depositAmount > 0.0){
            balance += depositAmount;
        }
    }
    public void withdraw(double withdrawalAmount){
        if(balance >= withdrawalAmount){
            balance -= withdrawalAmount;
        }
        else {
            System.out.println("Withdrawal amount exceeded account balance.");
        }
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        if (balance > 0.0){
            this.balance=balance;
        }
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
