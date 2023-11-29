// Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.

class BankAccount {
    int balance;
    BankAccount() {
        balance = 0;
    }
    void deposit(int a) {
        balance += a;
    }
    void withdraw(int a) {
        while (a < balance) {
            balance -=a;
        }
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(){
        balance = 0;
    }
    void withdraw(int a) {
        if (a < balance && balance > 100) {
            balance -= a;
        } else {
            System.out.println("Error balance insufficient, please check balance");
        }
    }
    void display() {
        System.out.println("Your account balance is: "+ balance);
    }
}

public class Two {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(500);
        bankAccount.withdraw(200);
        System.out.println("Bank Account Balance: " + bankAccount.balance);
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.deposit(1000);
        savingsAccount.withdraw(200);
        savingsAccount.display();
    }
}