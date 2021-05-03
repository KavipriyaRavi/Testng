package TestPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GolablValuesDrive {
	
	public static void main(String args[]) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream Fis=new FileInputStream("C:\\Users\\sudharsan\\eclipse-workspaceNew\\TestNGTutorial\\src\\TestPackage\\data.properties");
		prop.load(Fis);
		System.out.println(prop.getProperty("browser"));
		prop.setProperty("browser","firefox");
		System.out.println(prop.getProperty("browser"));
		FileOutputStream fos=new FileOutputStream("C:\\Users\\sudharsan\\eclipse-workspaceNew\\TestNGTutorial\\src\\TestPackage\\data.properties");
		prop.store(fos, null);
	     
	}

}
