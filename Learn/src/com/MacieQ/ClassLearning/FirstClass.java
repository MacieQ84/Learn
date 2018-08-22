package com.MacieQ.ClassLearning;

public class FirstClass {
    public static void main(String[] args) {

        FirstClassJobs testUser = new FirstClassJobs();
        testUser.setAccountNumber(123456798);
        testUser.setBalance(150.25);
        testUser.setCustomerName("Janusz Brajan");
        testUser.setEmailAdress("janusz@brajan.pl");
        testUser.setPhoneNumber("123 456 666");

        System.out.println(testUser.getCustomerName()
                + " " + testUser.getEmailAdress()
                + " " + testUser.getPhoneNumber()
                + " " + testUser.getAccountNumber()
                + " " + testUser.getBalance());

        testUser.withdrawFunds(45.28);
        System.out.println(testUser.getBalance());
        testUser.depositeFunds(100);
        System.out.println(testUser.getBalance());
        testUser.withdrawFunds(500);
        System.out.println(testUser.getBalance());

    }
}
