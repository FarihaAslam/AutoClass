package MainPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Object.AddToCart;
import Object.Login;
import Object.Logout;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
//import Object.Logout;


public class Main {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		FileInputStream fs = new FileInputStream("C:\\Users\\labit\\Downloads\\Test.xls");
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet AddressSheet = wb.getSheet("User_Login");		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\labit\\Downloads\\Java 7 Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		Login log1 = new Login(driver);
		log1.login(AddressSheet.getCell(0,1).getContents(),AddressSheet.getCell(1,1).getContents());
		//System.out.println(AddressSheet.getCell(0,2).getContents());
		//System.out.println(AddressSheet.getCell(1,2).getContents());
		//Logout logo = new Logout(driver);
		//logo.logout();
		//log1.login(AddressSheet.getCell(0,2).getContents(),AddressSheet.getCell(1,2).getContents());
		
		Thread.sleep(2000);
		
		AddToCart Searchitem = new AddToCart(driver);
		Searchitem.Search();
		
		Thread.sleep(5000);
		Logout logo1 = new Logout(driver);
		logo1.logout();
		
		
/*		
		//FileInputStream fs = new FileInputStream("C:\\Users\\labit\\Downloads\\Test.xls");
		//Workbook wb = Workbook.getWorkbook(fs);
		//Sheet AddressSheet = wb.getSheet("User_Login");
		
		//AddToCart Searchitem = new AddToCart(driver);
		//Searchitem.Search();
		//Logout logo = new Logout(driver);
		//logo.logout();
		
		//Login
		Login log1 = new Login(driver);
		log1.login("fari@live.com","pass123");
		
		//Searchitem.Search();
		
		//Login log2 = new Login(driver);
		//log2.login("fari@live.com","pass123");
		
		//logo.logout();
		
		/*String ActualPageTitle = driver.getTitle();
		String ExpectedPageTitle = "My Account";
		if(ActualPageTitle.contentEquals(ExpectedPageTitle))
		{
		    System.out.println("Test Passed!");
		} else {
		    System.out.println("Test Failed");
		}
		System.out.println("Logged in Successfully");
		
		
		
		//Logout
		/*Logout logo = new Logout(driver);
		logo.logout();
		
		String ActualPageT = driver.getTitle();
		String ExpectedPageT = "Account Logout";
		if(ActualPageT.contentEquals(ExpectedPageT))
		{
		    System.out.println("Test Passed!");
		} else {
		    System.out.println("Test Failed");
		}
		
		System.out.println("Logged out Successfully"); */
		
	}

}
