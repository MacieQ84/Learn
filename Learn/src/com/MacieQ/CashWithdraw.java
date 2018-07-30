package com.MacieQ;
import java.util.Scanner;

public class CashWithdraw {
    /*
    The cash machine will only accept the transaction if X is a multiple of 5, and Pooja's account balance has enough
    cash to perform the withdrawal transaction (including bank charges).
    For each successful withdrawal the bank charges 0.50 $US. Calculate Pooja's account balance after an attempted
    transaction.

    Input
    Positive integer 0 < X <= 2000 - the amount of cash which Pooja wishes to withdraw.

    Nonnegative number 0<= Y <= 2000 with two digits of precision - Pooja's initial account balance.
     */
    public static void main(String[] args) {

        Scanner readInput = new Scanner(System.in);
        double accountBalance = 120.56;
        final double charge = 0.5;
        System.out.println("Your accout balance: " + accountBalance);
        System.out.println("How much money do You want ? ");
        double cashWithdraw = readInput.nextDouble();
        double accoutBalanceAfter = accountBalance - cashWithdraw - charge;

        if (cashWithdraw % 5 != 0) {
            System.out.println("You must take multiplicity of 5$");
        } else if (accoutBalanceAfter <= 0) {
            System.out.println("You don`t have so much money");
        } else if (cashWithdraw < 5 && cashWithdraw > 2000) {
            System.out.println("Maximum withrawal = 2000$");
        } else
            System.out.println("Take Your cash \nYour actual accout balance - " + accoutBalanceAfter);
    }
}

