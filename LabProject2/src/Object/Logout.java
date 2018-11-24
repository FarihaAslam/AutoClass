package Object;

    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Logout {

		WebDriver driver;
		public Logout(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(xpath="//*[@id=\"column-right\"]/div/a[13]")
	    public WebElement LogoutLink;
		
		@FindBy(xpath="//*[@id=\"content\"]/div/div/a")
	    public WebElement LogoutButton;
		
		@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a/i")
	    public WebElement AccountLink;
		
		@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
	    public WebElement LoginLink;
		
	public void logout()
	{
		LogoutLink.click();
		LogoutButton.click();
		AccountLink.click();
		LoginLink.click();
		}
	}


