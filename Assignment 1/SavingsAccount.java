/**
 * CSCI 2540
 * @author Jonathan Smedley
 * Assignment 1
 * SavingsAccount
 */


package assg1_Smedleyj18;

public class SavingsAccount extends Account {
	
/**
 * Savings Account adds interest to the accounts
 * made.
 */
	
	private double interestRate;
	private double balance;
	private String acctNo;
	
/**
 * Sets the interest to 0.
 * @param acctNum sets the account number to a string.
 */
	
	public SavingsAccount(String acctNum) {
		super(acctNum);
		acctNo = acctNum;
		interestRate = 0;
		
	}
	
/**
 * 
 * @param acctNum is the accounts number.
 * @param initial sets the initial amount for the balance.
 * @param interest sets the number for the interest rate.
 */
	
	public SavingsAccount(String acctNum, double initial, double interest) {
		super(acctNum);
		acctNo = acctNum;
		if(balance >= 0) {
			balance = initial;
		}
		interestRate = interest;
	}
	
/**
 * 
 * @return the interest rate.
 */
	
	public double getInterestRate() {
		return interestRate;
	}
	
/**
 * 
 * @param interest sets the new interest rate.
 */
	
	public void setInterestRate(double interest) {
		interestRate = interest;
	}
	
/**
 * 
 * @param newB is multiplied by the interest rate to
 * give the new balance.
 */
	
	public void addInterestRate(double newB) {
		balance = (1 + interestRate) * newB;
	}
	
/**
 * Turns the account number, balance, and
 * interest rate into a string.
 */
	
	public String toString() {
		return("Account Number: " + acctNo + "\n" +
	           "Current balance: $" + balance + "\n" +
			   "Interest Rate: " + interestRate);
	}
	
/**
 * Displays the account number, current balance, and
 * the interest rate. 
 */
	
	public void displayInfo() {
		System.out.println("Account Number: " + acctNo);
		System.out.println("Current Balance: $" + balance);
		System.out.println("Interest Rate: " + interestRate);
	}

}















