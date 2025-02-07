public class BankAppDriver {
    public static void main(String[] args) {

        BankAccount regularAccount = new BankAccount(501, "John Doe", 5000.0);
        System.out.println("Bank Account Details:");
        regularAccount.check_balance();
        regularAccount.deposit_money(1500.0);
        regularAccount.withdraw_money(2000.0);
        regularAccount.check_balance();

        SavingsAccount savingsAccount = new SavingsAccount(502, "Kaine Smith", 10000.0, 5);
        System.out.println("\nSavings Account Details:");
        savingsAccount.check_balance();
        savingsAccount.deposit_money(2000.0);  // Deposit in savings account
        savingsAccount.apply_interest();  // Apply interest in savings account
        savingsAccount.withdraw_money(3000.0);  // Withdraw from savings account
        savingsAccount.check_balance();
    }

}
