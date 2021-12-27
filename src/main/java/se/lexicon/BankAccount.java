package se.lexicon;

public class BankAccount {
    private int AccountNumber;
    private double balance;
    private String customerName;
    public String email;
    private String phoneNumber;

    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.AccountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double value){
        if(value != 0) {
            this.balance += value;
        } else
            System.out.println("You need to deposit a value.");
    }

    public void withdraw(double value){
        if (value > balance){
            System.out.println("Insufficient balance.");
            return;
        } else
        this.balance -= value;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
