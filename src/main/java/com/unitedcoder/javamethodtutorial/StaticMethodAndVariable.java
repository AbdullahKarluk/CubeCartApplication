package com.unitedcoder.javamethodtutorial;

public class StaticMethodAndVariable {
    //static variable
    private static double accountBalance;
    private static String accountName;
    private static int accountNumber;
    private int deposit;
    public int money;
    public static int cash;
    private static int account;



    public StaticMethodAndVariable() {
    }
    //static method

    public static double getAccountBalance() {
        return accountBalance;
    }

    public static void setAccountBalance(double accountBalance) {
        StaticMethodAndVariable.accountBalance = accountBalance;
    }

    public static String getAccountName() {
        return accountName;
    }

    public static void setAccountName(String accountName) {
        StaticMethodAndVariable.accountName = accountName;
    }

    public static int getAccountNumber() {
        return accountNumber;
    }

    public static void setAccountNumber(int accountNumber) {
        StaticMethodAndVariable.accountNumber = accountNumber;
    }
}
