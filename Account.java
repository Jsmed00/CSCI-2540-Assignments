/**
 * CSCI 2540
 * @author Jonathan Smedley
 * Assignment 1
 * Account
 */

package assg1_Smedleyj18;

/**
 * Account class will be used to represent
 * a bank account. The account can be used for deposit,
 * withdraw, and transfer.
 */

public class Account {
	
	private String acctNo;
	protected double balance;
	
/**
 * The default balance is set to 0 and
 * the account number is set to a string.
 */	
	
	public Account(String acctNum) {
		balance = 0;
		acctNo = acctNum;
		acctNum = ("Account Number: ");

		
	}
	
/**
 * 
 * @param initial sets the initial number for the balance.
 * @param acctNo is the accounts number.
 */
	
	public Account(double initial, String acctNum) {
		
		if(balance >= 0) {
			balance = initial;
		}
		acctNo = acctNum;
		acctNum = ("Account Number: ");
	}
	
/**
 * 
 * @return the account number for the account.
 */
	
	public String getAcctNo() {
		return acctNo;
	}
	
/**
 * 
 * @return the balance for the account.
 */
	
	public double getBalance() {
		return balance;
	}
	
/**
 * 
 * @param newB will set the new balance for the account.
 */
	
	public void setBalance(double newB) {
		balance = newB;
	}
	
/**
 * 
 * @param add will add the amount of money being deposited into the
 * account.
 * This will also update the balance of the account
 */
	
	public void deposit(double add) {
		if(add > 0) {
			balance = balance + add;
		}
		else {
			System.out.println("The deposited number should be positive.");
		}
				
	}
	
/**
 * 
 * @param sub will subtract the amount of money being withdrawn
 * from the account.
 * This will also update the balance of the account.
 */
	
	public void withdraw(double sub) {
		if(sub < balance) {
			balance = balance- sub;
		}
		else if(sub > balance) {
			System.out.println("The amount being withdrawn must be lower then the balance in your account.");
		}
		else {
			System.out.println("The withdrawn number should be positive.");
		}
			
	}
	
/**
 * 
 * @param acc is the account where the balance is being
 * subtracted from.
 * @param minus is the amount of money being subtracted.
 */
	
	public void transferIn(Object acc, double minus) {
		if(minus > 0) {
			this.balance = this.balance + minus;
			((Account)acc).balance = ((Account)acc).balance - minus;
		}
		else {
			System.out.println("The amount of money being transfered into your account needs to be positive.");
		}
	}
	
/**
 * 
 * @param acc is the amount where the balance is getting 
 * added from.
 * @param add is the amount of money being added.
 */
	
	public void transferOut(Object acc, double add) {
		if(add > 0) {
			this.balance = this.balance - add;
			((Account)acc).balance = ((Account)acc).balance + add;
		}
		else {
			System.out.println("The amount of money being transfered out of your account needs to be positive.");
		}
	}
	
/**
 * Displays the updated account number and balance.
 */
	
	public void displayInfo() {
		System.out.println("Account Number: " + acctNo);
		System.out.println("Balance: $" + balance);
	}
	
/**
 * Turns the account number and balance into a string.
 */
	
	public String toString() {
		return("Account Number: " + acctNo + "\n" +
						   "Current Balance: $" + balance);
	}
	
/**
 * 
 * @param eq is the account that is being compared to
 * @return either true or false base on if the account is equal
 * to each other or not.
 */
	
	public boolean equals(Account eq) {
		if(this.acctNo == eq.acctNo) {
			return true;
		}
		else {
			return false;
		}
	}
	
	

}
