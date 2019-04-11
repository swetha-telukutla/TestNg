package pack1;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo1 {
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("BeforeMethod");
	}

	@AfterMethod
	public void AfterMethod() {
		System.out.println("AfterMehod");
	}

	@BeforeTest
	public void BeforeTest() {
		System.out.println("BeforeTest");
	}

	@AfterTest
	public void AfterTest() {
		System.out.println("AfterMehod");
	}

	@Test(priority = 1)
	public void LoginIntoAccount() {
		throw new SkipException("connection issue");
		//System.out.println("LoginIntoAccount to make the payment");
	}

	@Test(priority = 2, dependsOnMethods = { "LoginIntoAccount" })
	public void MakeThePayment() {
		System.out.println("MakeThePayment");

	}

	@Test(priority = 3, dependsOnMethods = { "MakeThePayment" })
	public void LogOutPayment() {
		System.out.println(" LogOutPayment after make done");
	}
}
