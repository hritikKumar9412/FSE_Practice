class CurrentAccount extends BankAccount {
    private double overdraftLimit;
    public CurrentAccount(int accountNumber, String customerName, double balance,double overdraftLimit) {
        super(accountNumber,customerName,balance);
        this.overdraftLimit = overdraftLimit;

    }

    // Method OverLoading
    @Override

    void displayInfo(){
        System.out.println("\n Current Accounts");
        System.out.println("Account Number: "+getAccountNumber());
        System.out.println("Customer Name: "+getCustomerName());
        System.out.println("Balance: "+getBalance());
        System.out.println("Interest rate: "+overdraftLimit);
    }
}
