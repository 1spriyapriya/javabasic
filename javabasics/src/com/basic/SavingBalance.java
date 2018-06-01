package com.basic;

public class SavingBalance {
	public static int annualInterestRate;
	public  double savingBalance;
	public SavingBalance(double balance) {
		this.savingBalance=balance;
	}
public void calculateMonthlyInterest() {
	double interest=(savingBalance*(annualInterestRate/100)/12);
savingBalance=savingBalance+interest;
}public static void modifyInterestRate(int newValue) {
	annualInterestRate=newValue;
}
public void showBalance() {
	System.out.println("balance"+savingBalance);
}
public static void main(String []args) {
	SavingBalance sb1=new SavingBalance(2000);
	SavingBalance sb2=new SavingBalance(3000);
	SavingBalance.modifyInterestRate(4);
	sb1.showBalance();
	sb2.showBalance();
	sb1.calculateMonthlyInterest();
	sb2.calculateMonthlyInterest();
	sb1.showBalance();
	sb2.showBalance();
	SavingBalance.modifyInterestRate(7);
	sb1.calculateMonthlyInterest();
	sb2.calculateMonthlyInterest();
	sb1.showBalance();
	sb2.showBalance();
}

	
}

