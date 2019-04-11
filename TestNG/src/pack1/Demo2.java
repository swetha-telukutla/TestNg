package pack1;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Demo2 {
	
	@Test(priority = 1)
	public void LoginIntoAccount() {
		throw new SkipException("connection issue");
		//System.out.println("LoginIntoAccount to make the payment");
	}

	@Test(priority = 2,enabled=false)
	public void MakeThePayment() {
		System.out.println("MakeThePayment");

	}

	@Test(priority = 3)
	public void LogOutPayment() {
		System.out.println(" LogOutPayment after make done");
	}
}



