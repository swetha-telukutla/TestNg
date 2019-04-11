package pack1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo3 {
	@Test
	public void test(){
		String expectedMessage="abc";
		String actualMessage="abc";
		Assert.assertEquals(actualMessage, expectedMessage);
		System.out.println("===============");
		String expectedTitle="TechArch";
		String actualTitle="TechArch";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.fail("my app is not ready yet");
	}
	

}
