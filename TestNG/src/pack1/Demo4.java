package pack1;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo4 {
	SoftAssert SoftAsser=new SoftAssert();
	@Test
	public void test(){
		String expectedMessage="abc";
		String actualMessage="abc";
		 SoftAsser.assertEquals(actualMessage, expectedMessage);
		System.out.println("===============");
		String expectedTitle="TechArch";
		String actualTitle="TeckA";
		 SoftAsser.assertEquals(actualTitle, expectedTitle);
		 SoftAsser.assertAll();
	}
}
