/*
 * Class: CMSC203 
 * Instructor: Grinberg
 * Description: a savings account class that creates a savings account with initial balance and a copy of a saving account.
 * it also has an interest rate accrual for the balance in the account and an account number
 * Due: 4/11/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: B. Leigh Vining
 */
public class SavingsAccount extends BankAccount {
		private double rate = 2.5;
		private int savingsNumber = 0;
		private String accountNumber;
		
		public SavingsAccount(String name, double amount) {
		super(name, amount);
		accountNumber = (super.getAccountNumber() + "-" + savingsNumber);
		
		savingsNumber++;
		}
		
		public SavingsAccount(SavingsAccount oldAccount, double amount) {
		super(oldAccount, amount);
		accountNumber = (super.getAccountNumber() + "-" + savingsNumber);
		
		savingsNumber++;
		}
		
		public void postInterest() {
			double interestRate = (rate/ (100 * 12));
			double total = (super.getBalance() * interestRate);
			
			super.deposit(total);
		}
		
		@Override
		public String getAccountNumber() {
			return accountNumber;
		}
}
