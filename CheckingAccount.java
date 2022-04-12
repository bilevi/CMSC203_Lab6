/*
 * Class: CMSC203 
 * Instructor: Grinberg
 * Description: a checking account class that creates a checking account with initial balance and a withdraw method
 * Due: 4/11/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: B. Leigh Vining
 */
public class CheckingAccount extends BankAccount {
		private static final double FEE = 0.15;
		
		public CheckingAccount(String name, double amount) {
			
			super(name, amount);
			super.setAccountNumber(super.getAccountNumber() + "-10");
		}
		
		@Override
		public boolean withdraw(double amount) {
			
			return super.withdraw(amount + FEE);
		}
}
