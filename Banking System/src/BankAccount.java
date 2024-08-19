import java.nio.file.AccessMode;
import java.util.AbstractMap;

public class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private int balance;

    public BankAccount(int accountNumber, String accountHolder, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int depositAmount(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        this.setBalance(this.getBalance() + amount);
        return this.getBalance();
    }


    public int withdrawAmount(int drawAmount) throws InsufficientFundsException{
        if (drawAmount < 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (drawAmount > this.getBalance()) {
            throw new InsufficientFundsException("Insufficient balance exception.");
        }
        this.setBalance(getBalance() - drawAmount);
        return getBalance();
    }

    public void transferFunds(BankAccount targetAccount, int amount)
            throws IllegalArgumentException, InsufficientFundsException {
        if (targetAccount == null) {
            throw new IllegalArgumentException("Target account is invalid.");
        }
        if (amount < 0) {
            throw new InsufficientFundsException("Transfer amount must be positive");
        }

        this.withdrawAmount(amount);

        targetAccount.depositAmount(amount);

        System.out.println("Transfer successful.\nNew balance of source account: " + this.getBalance());
        System.out.println("New balance of target account: " + targetAccount.getBalance());
    }
}
