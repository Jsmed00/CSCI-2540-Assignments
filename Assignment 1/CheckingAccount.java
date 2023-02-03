/**
 * CSCI 2540
 * @author Jonathan Smedley
 * Assignment 1
 * CheckingAccount
 */


package assg1_Smedleyj18;




public class CheckingAccount extends Account {
	
/**
 * Checking account is a subclass of Account
 * which adds the variable overdraft which allows the
 * balance to go into the negative.
 */
	
	
	private static double fee;
	private static double overdraft;
	private double balance;
	private String acctNo;
	
/**
 * Sets the overdraft to 0.
 * @param acctNum sets the account number to a string.
 */
	
	public CheckingAccount(String acctNum) {
		super(acctNum);
		acctNo = acctNum;
		overdraft = 0;		
	}
	
/**
 * 
 * @param acctNum is the accounts number.
 * @param initial sets the initial amount for the balance.
 * @param over sets the number for the overdraft.
 */
	
	public CheckingAccount(String acctNum, double initial, double over) {
		super(acctNum);
		acctNo = acctNum;
		if(balance >= 0) {
			balance = initial;
		}
		overdraft = over;
	}
	
/**
 * 
 * @return the Overdraft.
 */
	
	public double getOverdraft() {
		return overdraft;
	}
	
/**
 * 
 * @param newO sets the new overdraft.
 */
	
	public void setOverdraft(double newO) {
		overdraft = newO;
	}
	
/**
 * 
 * @return gets the fee for using the overdraft.
 */
	
	public double getFee() {
		return fee;
	}
	
/**
 * 
 * @param newF sets the new fee.
 */
	
	public void setFee(double newF) {
		fee = newF;
	}
	
/**
 * Turns the account number, balance, and overdraft
 * into a string.
 */
	
	public String toString() {
		return("Account Number: " + acctNo + "\n" + 
			   "Current Balance: $" + balance + "\n" + 
			   "Overdraft Amount: " + overdraft);
	}
	
/**
 * @param sub subtracts the amount of money from the account
 * and also subtracts the fee in case the overdraft is used.
 */
	
	public void withdraw(double sub) {
		if(((balance - sub) - fee) >= -(overdraft)) {
			balance = balance - sub - fee;
		}
		else {
			System.out.println("The balance for your account can not be lower then the overdraft.");
		}
	}
	
/**
 * @param acc is the account where the money is being subtracted from.
 * @param minus is the amount of money being subtracted.
 */
	
	public void transferIn(Object acc, double minus) {
		if(((balance - minus) - fee) >= -(overdraft)) {
			this.balance = this.balance + minus - fee;
			((CheckingAccount)acc).balance = ((CheckingAccount)acc).balance - minus;
		}
		else {
			System.out.println("The balance for your account can not be lower then the overdraft.");
		}
	}
	
/**
 * @param acc is the account where the money is being subtracted from.
 * @param add is the amount of money being added.
 */
	
	public void transferOut(Object acc, double add) {
		if(((balance - add) - fee) >= -(overdraft)) {
			this.balance = this.balance - add - fee;
			((CheckingAccount)acc).balance = ((CheckingAccount)acc).balance + add;
		}
		else {
			System.out.println("The balance for your account can not be lower then the overdraft.");
		}
	}
	
/**
 * Display Info displays the account number, balance, and
 * the overdraft.
 */
	
	public void displayInfo() {
		System.out.println("Account Number: " + acctNo);
		System.out.println("Current Balance: $" + balance);
		System.out.println("Overdraft amount: -$" + overdraft);
		
	}





}






