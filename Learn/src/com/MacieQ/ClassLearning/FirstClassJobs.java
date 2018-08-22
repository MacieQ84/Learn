package com.MacieQ.ClassLearning;

public class FirstClassJobs {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String emailAdress;
    private String phoneNumber;

    //constructor
    public FirstClassJobs(int accountNumber, double balance, String customerName, String emailAdress, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.emailAdress = emailAdress;
        this.phoneNumber = phoneNumber;

    }

    public FirstClassJobs(int accoutNumer, double balance){
        this(accoutNumer, balance, "aaaa", "adreess", "phone");
    }

    public FirstClassJobs(){

    }

    public void depositeFunds(double funds){
        this.balance += this.balance + funds;
    }

    public void withdrawFunds(double funds){
        if(this.balance - funds < 0){
            System.out.println("Sorry, insifficient funds... ");
        } else
            this.balance -= this.balance - funds;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
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

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
