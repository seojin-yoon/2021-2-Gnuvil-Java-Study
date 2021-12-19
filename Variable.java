package JavaTest;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 100;
		int num2 = 45892;
		
		int plus = num + num2;
		int minus = num - num2;
		int multiply = num * num2;
		int divide = num2 / num; //quotient
		int modulo = num2 % num; //remainder
		
		String myString = "Hi,";
		String addString = " my brother!";
		char myChar = 'A';
		long myBigNumber = 34359786876199L;
		float myfloat = 3432.123f;
		
		System.out.println(num);
		System.out.println(myString);
		System.out.println(myChar);
		System.out.println(myBigNumber);
		System.out.println(myfloat);
		
		System.out.println(plus);
		System.out.println(minus);
		System.out.println(multiply);
		System.out.println(divide);
		System.out.println(modulo);
		
		System.out.println(myString + addString);
	}

}

import java.util.*;
import java.text.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Account account = new Account(sc.nextInt(), sc.nextInt());
		Account.setAnnualInterestRate(sc.nextDouble());
		
		account.withdraw(sc.nextDouble());
		account.deposit(sc.nextDouble());
		
		
		
		System.out.printf("balance: %.1f\n", account.getBalance());
		DecimalFormat format=new DecimalFormat(".###");
		double data=account.getMonthlyInterest();
		double data2=Math.floor(data*1000)/1000;
		String ret=format.format(data2);
		System.out.println("monthly interest: "+ ret);
	}
}

class Account {
	private static int id;
	private static double balance;
	private static double annualInterestRate;
	private static Date dateCreated;
	Account(int id1, double balance1) {
		id=id1;
		balance=balance1;
	}
	Account(){}
	public static void setAnnualInterestRate(double x) {
		annualInterestRate=x;
	}
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public static double getMonthlyInterestRate() { 
		return annualInterestRate/1200;
	}
	public static double getMonthlyInterest() {
		return getMonthlyInterestRate() * balance;
	}
	public static void withdraw(double x) {
		if(x>balance) {
		}
		else {
			balance -= x;
		}
	}
	public static void deposit(double x) {
		balance += x;
	}
	public static int getId() {
		return id;
	}
	public static double getBalance() {
		return balance;
	}
}


    
