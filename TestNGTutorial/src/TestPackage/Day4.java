package TestPackage;

import org.testng.annotations.Test;

public class Day4 {

	@Test(dependsOnMethods= {"XoginAPILoan"})
	public void webloginHomeloan()
	{
		System.out.println("We");
	}
	
	@Test
	public void MobloginHomeloan()
	{
		System.out.println("Mob");
	}
	
	@Test
	public void XoginAPILoan()
	{
		System.out.println("API");
	}
	
}
