class SavingAccount extends BankAccount {
    private double interestRate;
    public SavingAccount(int accountNumber,String customerName,double balance, double interestRate) {
        super(accountNumber,customerName,balance);
        this.interestRate = interestRate;
    }
    @Override
    void displayInfo(){
        System.out.println("\n Saving Accounts");
        System.out.println("Account Number: "+getAccountNumber());
        System.out.println("Customer Name: "+getCustomerName());
        System.out.println("Balance: "+getBalance());
        System.out.println("Interest rate: "+interestRate+"%");
    }
}
