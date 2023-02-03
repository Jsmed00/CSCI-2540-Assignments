/**
 * CSCI 2540
 * @author Jonathan Smedley
 * Assignment 1
 * AccountTest
 */

package assg1_Smedleyj18;

/**
 * The account test is used to test
 * all of the functions in the Account,
 * Checking account, and Savings account.
 */

public class AccountTest {
	
	public static void main(String[] args) {
		
		Account Jon = new Account("1");
		Account Jake = new Account("2");
		Account Jay = new Account(20.00, "3");
		Account Joe = new Account(50.00, "4");
		CheckingAccount Cody = new CheckingAccount("5");
		CheckingAccount Bob = new CheckingAccount("6", 200, 20);
		CheckingAccount Jess = new CheckingAccount("7", 75, 100);
		CheckingAccount Ava = new CheckingAccount("8", 100, 75);
		SavingsAccount Jeff = new SavingsAccount("9");
		SavingsAccount Jerry = new SavingsAccount("10", 300, 0.2);
		
		Jon.displayInfo();
		System.out.println("");
		Jake.displayInfo();
		System.out.println("");
		Jay.displayInfo();
		System.out.println("");
		Joe.displayInfo();
		System.out.println("");
		
		Jon.setBalance(100);
		Jake.deposit(25);
		Jay.withdraw(50);
		Jay.displayInfo();
		System.out.println("");
		Jon.withdraw(10);
		Jon.displayInfo();
		System.out.println("");
		
		Jake.transferIn(Jon, 5);
		Joe.transferOut(Jay, 20);
		Jon.displayInfo();
		System.out.println("");
		Jake.displayInfo();
		System.out.println("");
		Jay.displayInfo();
		System.out.println("");
		
		Joe.displayInfo();
		System.out.println("");
		System.out.println(Jon.toString());
		System.out.println("");
		
		Jess.setOverdraft(50);
		Jess.setFee(10);
		
		Cody.displayInfo();
		System.out.println("");
		Bob.displayInfo();
		System.out.println("");
		Jess.displayInfo();
		System.out.println("");
		System.out.println(Cody.toString());
		System.out.println("");
		
		Bob.withdraw(210);
		Bob.displayInfo();
		System.out.println("");
		Ava.withdraw(145);
		Ava.displayInfo();
		System.out.println("");
		
		Bob.transferIn(Jess, 10);
		Bob.displayInfo();
		System.out.println("");
		Jess.displayInfo();
		System.out.println("");
		
		Bob.transferIn(Jess, 35);
		Bob.displayInfo();
		System.out.println("");
		Jess.displayInfo();
		System.out.println("");
		
		Ava.transferOut(Jess, 145);
		Ava.displayInfo();
		System.out.println("");
		Jess.displayInfo();
		System.out.println("");
		Ava.transferOut(Jess, 120);
		Ava.displayInfo();
		System.out.println("");
		Jess.displayInfo();
		System.out.println("");
		Jess.transferIn(Ava, 250);
		Ava.displayInfo();
		System.out.println("");
		Jess.displayInfo();
		System.out.println("");
		
		Jeff.displayInfo();
		System.out.println("");
		Jerry.displayInfo();
		System.out.println("");
		
		Jeff.setInterestRate(0.5);
		Jeff.displayInfo();
		System.out.println("");
		
		Jerry.addInterestRate(300);
		Jerry.displayInfo();
		System.out.println("");
		
		System.out.println(Jeff.toString());
		System.out.println("");
		
		
		}

}
