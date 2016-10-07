package account;

import static org.junit.Assert.*;


import org.junit.Test;

public class Account_test  {

	@Test
	public void testAccount() {
		Account account= new Account(1122, 20000);
		account.setAnnualInterestRate(4.5);
		account.withdraw(2500);
		account.deposit(3000);
		System.out.println("Balance is " + account.getBalance());
		System.out.println("Monthly interest is " + account.getMonthlyInterestRate());
		System.out.println("The account was created at " + account.getDateCreated());
		
		
		
	}
	

	
	@Test(expected=InsufficientFundsException.class)

	public final void testWithdraw() throws InsufficientFundsException {
		
		Account account= new Account(1122, 0);

		account.deposit(500.00);
		

		assertEquals("$400 Expected, actual is $500",(long)account.getBalance(),(long)500.00);
	
	
		account.withdraw(900); 
		
		
       

	}
	
	
	
	 


}
