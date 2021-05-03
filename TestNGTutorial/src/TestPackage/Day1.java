package TestPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day1 {
	
	@BeforeMethod()
	public void afsuit()
	{
		System.out.println("Lasttt");
	}
    @Test(groups= {"Smoke"})
	public void Demo()
	{
		System.out.println("Positive");
	}
    
    @Test
    public void demo1()
    {
    	System.out.println("Happy");
    }
	
}
