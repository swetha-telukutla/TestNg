package pack1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo5 {
	@Test(dataProvider="getData")
	public  void doLogin(String UserName,String passWord){
	//SFDC code for login test case	
	}
//for parallel execution(	@DataProvider(parallel=true))
@DataProvider
public Object[][] getData(){
	Object[][] data= new Object[4][2];
	data[0][0]="abc@gmail.com";
	data[0][1]="abc123";
	data[1][0]="a@gmail.com";
	data[1][1]="abc1223";
	data[2][0]="b@gmail.com";
	data[2][1]="abc123";
	data[3][0]="c@gmail.com";
	data[3][1]="abc@gmail.com";
	return data;
}
}
