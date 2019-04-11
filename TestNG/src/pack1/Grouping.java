package pack1;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Grouping {
	@BeforeGroups("database")
	public void setUp() {
		System.out.println("setup database");
	}

	@AfterGroups("database")
	public void TearDown() {
		System.out.println("close database");
	}

	@Test(groups = "cross-browser")
	public void runChrome() {
		System.out.println("run chrome");
	}

	@Test(groups = "cross-browser")
	public void runFirefox() {
		System.out.println("run firefox");
	}

	@Test(groups="database")
	public void testSql() {
		System.out.println("test sql");
	}

	@Test(groups="database")
	public void testOracle() {
		System.out.println("testoracle");
	}

	@Test(dependsOnGroups={"database","cross-browser"})
	public void runFinal() {
		System.out.println("runFinal");
	}
}
