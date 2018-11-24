package Object;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddToCart {
	
	WebDriver driver;
	public AddToCart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
@FindBy(name="search")
public WebElement searchbox;

@FindBy(xpath="//*[@id=\"search\"]/span/button")
public WebElement searchbutton;

@FindBy(xpath="//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]/i")
public WebElement AddtoCartIcon;

@FindBy(id="button-cart")
public WebElement AddtoCartButton;

@FindBy(xpath="//*[@id=\"cart\"]/button")
public WebElement ItemButton;

@FindBy(xpath="//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]/strong")
public WebElement CheckoutLink;

//BILLING DETAILS

@FindBy(xpath="\"//*[@id=\\\"collapse-payment-address\\\"]/div/form/div[3]/label/input\"")
public WebElement Radiobtn;

//ADD ADDRESS DETAILS

@FindBy(id="input-payment-firstname")
public WebElement Fname;
@FindBy(id="input-payment-lastname")
public WebElement Lname;
@FindBy(id="input-payment-company")
public WebElement Comp;
@FindBy(id="input-payment-address-1")
public WebElement Add1;
@FindBy(id="input-payment-address-2")
public WebElement Add2;
@FindBy(id="input-payment-city")
public WebElement City;
@FindBy(id="input-payment-postcode")
public WebElement PC;
@FindBy(id="input-payment-country")
public Select Country;
@FindBy(id="input-payment-zone")
public Select State;
@FindBy(id="button-payment-address")
public WebElement CB1;
@FindBy(xpath="//*[@id=\"shipping-existing\"]/select")
public Select EA;
@FindBy(id="button-shipping-address")
public WebElement CB2;
@FindBy(xpath="//*[@id=\"collapse-shipping-method\"]/div/p[4]/textarea")
public WebElement DM;
@FindBy(id="button-shipping-method")
public WebElement CB3;
@FindBy(xpath="//*[@id=\"collapse-payment-method\"]/div/p[3]/textarea")
public WebElement PM;
@FindBy(id="button-payment-method")
public WebElement CB4;
@FindBy(xpath="//*[@id=\"collapse-payment-method\"]/div/div[2]/div/input[1]")
public WebElement Checkbox;
@FindBy(id="button-confirm")
public WebElement CB5;
/*

//PAYMENT METHOD

WebElement PaymentMethod = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//*[@id=\"collapse-payment-method\"]/div/p[3]/textarea"))));
PaymentMethod.sendKeys("\nThis is payment method description");

WebElement Checkbox = driver.findElement(By.xpath("//*[@id=\"collapse-payment-method\"]/div/div[2]/div/input[1]"));
Checkbox.click();

WebElement ContinueButton4;
ContinueButton4 = driver.findElement(By.id("button-payment-method"));
ContinueButton4.click();


//CONFIRM ORDER

WebElement ContinueButton5 = wait.until(ExpectedConditions.elementToBeClickable((By.id("button-confirm"))));
ContinueButton5.click();

System.out.println("Order has been placed successfully"); 


//NAVIGATE TO STORE SCREEN

WebElement ContinueButton6 = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//*[@id=\"content\"]/div/div/a"))));
ContinueButton6.click();
*/

public void Search()
{
	searchbox.sendKeys("hp lp3065");
	searchbutton.click();
	AddtoCartIcon.click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	AddtoCartButton.click();
	ItemButton.click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	CheckoutLink.click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Radiobtn.click();
	Fname.sendKeys("Fariha");
	Lname.sendKeys("Aslam");
	Comp.sendKeys("ABC Company");
	Add1.sendKeys("Dummy Address 1");
	Add2.sendKeys("Dummy Address 2");
	City.sendKeys("Austria");
	PC.sendKeys("75300");
	Country.selectByVisibleText("Australia");
	try {
		Thread.sleep(2000);
	 } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	State.selectByVisibleText("Victoria");
	CB1.click();
	try {
		Thread.sleep(3000);
	 } catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
		EA.selectByValue("4797");
		CB2.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		DM.sendKeys("This is delivery method description");
		CB3.click();
		PM.sendKeys("This is payment method description");
		Checkbox.click();
		CB4.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		CB5.click();
	 }
	 }
}
}

	 
	 
	 
	  
	 

