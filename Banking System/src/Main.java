public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(12345, "John Doe", 1000);
        BankAccount account2 = new BankAccount(67890, "Jane Smith", 300);

        try {
            account1.depositAmount(400);
            System.out.println("Account 1 balance " + account1.getBalance());

            account1.transferFunds(account2, 300);
        } catch (InsufficientFundsException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
