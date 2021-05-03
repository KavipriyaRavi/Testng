package TestPackage;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {

	@Test(dataProvider="dp")
	public void Mobilelogincarloan(String username,String password)
	{
		System.out.println("We");
		System.out.println(username);
		System.out.println(password);
	}

	@Test
	public void Mobilelogicarloan()
	{
		System.out.println("Mob");

	
	}
	@Test
	public void bfsuit()
	{
		
		System.out.println("I am the First");
	}
	@Test
	public void MobileLoginAPCarLoan()
	{
		System.out.println("API");
	}
	
	@Test
	public void MobileLoginAPICarLoan()
	{
		System.out.println("API");
	}
	@Test
	public void LoginAPICarLoan()
	{
		System.out.println("kvb");
	}
	@DataProvider
	public Object[][] dp()
	{
		//1.username/password-good credit history
		//2.diff username/password-no credit history
		//3.fraud credit history
		Object[][] date=new Object[3][2];
		date[0][0]="Firstname";
		date[0][1]="Firstpassword";
		date[1][0]="Secondname";
		date[1][1]="Secondpassword";
		date[2][0]="Thirdname";
		date[2][1]="Thirdpassword";
		return date;
		
				
		
		
	}
}
