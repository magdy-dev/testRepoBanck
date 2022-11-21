package com.magdy.entity;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    private  int customerNumber ;
    private int pinNumber;
    private double checkingBalance=0 ;
    private double savingBalance=0;

    Scanner input=new Scanner(System.in);
    DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");

    public int setCustomerNumber(int customerNumber){
        this.customerNumber=customerNumber;
        return customerNumber;
    }




    public double calcCheckingWithdraw(double amount){
        checkingBalance=(checkingBalance-amount);
        return checkingBalance;
    }


    public double calcSavingWithdraw(double amount){
        savingBalance=(savingBalance-amount);
        return savingBalance;
    }

    public double calcCheckingDeposit(double amount){
        checkingBalance=(checkingBalance+amount);
        return checkingBalance;

    }

    public double calcSavingDeposit(double amount){
        savingBalance=(savingBalance+amount);
        return savingBalance;

    }

    public void getCheckingWithdrawInput(){
        System.out.println("Checking Account balance :"+moneyFormat.format(checkingBalance));
        System.out.println("Amount you want  to withdraw  from checking Account ");
        double amount =input.nextDouble();

        if ((checkingBalance-amount)>=0){
            calcCheckingWithdraw(amount);
            System.out.println("new checking Amount Balance :"+moneyFormat.format(checkingBalance ));
        }else {
            System.out.println("Balance cannot be Negative."+"\n");
        }
    }
    public  void getSavingWithdrawInput(){
        System.out.println("Saving Account Balance "+moneyFormat.format(savingBalance));
        System.out.println("Amount you want to withdraw form saving Account :");
        double amount = input.nextDouble();

        if((savingBalance-amount)>=0){
            calcSavingWithdraw(amount);
            System.out.println("new saving  Account Balance :"+moneyFormat.format(savingBalance));

        }else {
            System.out.println("Balance Cannot be Negative. "+"\n");
        }

    }

    public void getCheckingDepositInput(){
        System.out.println("checking Account Balance : "+moneyFormat.format(checkingBalance));
        System.out.println("Amount  you want Deposit Checking  Account : ");
        double amount  =input.nextDouble();
        if ((checkingBalance+amount)>=0){
            calcCheckingDeposit(amount);
            System.out.println("New Checking Account Balance :"+moneyFormat.format(checkingBalance));
        }else {
            System.out.println("Balance Cannot be Negative ."+"\n") ;
        }
    }

    public void getSavingDepositInput(){
        System.out.println("Saving Account Balance :"+moneyFormat.format(savingBalance));
        System.out.println("Amount you want to Deposit Saving Account :");
        double amount =input.nextDouble();

        if((savingBalance+amount)>=0){
            calcCheckingDeposit(amount);
            System.out.println("New Saving Balance :"+moneyFormat.format(savingBalance));
        }else {
            System.out.println("Balance Cannot be Negative ."+"\n") ;
        }
    }

























































    public int getCustomerNumber() {
        return customerNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public DecimalFormat getMoneyFormat() {
        return moneyFormat;
    }

    public void setMoneyFormat(DecimalFormat moneyFormat) {
        this.moneyFormat = moneyFormat;
    }
}
