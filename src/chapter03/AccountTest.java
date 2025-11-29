package chapter03;


public class AccountTest {
    public static void main(String[] args) {
        //THE WAY TO USE SCANNER WITHOUT IMPORTING IT
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        Account account1 = new Account("Cristiano Ronaldo",150);
        Account account2 = new Account("Lionel Messi",-200);

        System.out.println("Name: " + account1.getName());
        displayAccount(account1);

        System.out.println("Name: " + account2.getName());
        displayAccount(account2);
        account2.setBalance(500);
        displayAccount(account2);

        account1.deposit(250);
        displayAccount(account1);

        account2.deposit(150);
        displayAccount(account2);

        System.out.print("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();

        account1.deposit(depositAmount);
        displayAccount(account1);

        account2.deposit(depositAmount);
        displayAccount(account2);

        account1.withdraw(200);
        displayAccount(account1);

        account2.withdraw(300);
        displayAccount(account2);

        System.out.print("Please enter the withdraw amount for " + account1.getName() + ": ");
        double withdrawalAmount = scanner.nextDouble();
        account1.withdraw(withdrawalAmount);
        displayAccount(account1);
    }

    public static void displayAccount(Account account) {
        System.out.println(account.getName() + " balance: " + account.getBalance() + "$");
    }
}
