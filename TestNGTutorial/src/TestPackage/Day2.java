package TestPackage;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {

	@Test()
	public void Demo2()
	{
		System.out.println("Good");
		Assert.assertTrue(false);
	}
	
	@AfterTest
	public void sub()
	{
		System.out.println("Before all");
	}
}
