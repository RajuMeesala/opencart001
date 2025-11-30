package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	   //constructor -initiate drivers
	   public HomePage(WebDriver driver){
		   
		    super(driver);
	   } 
	   //locators - xpath,ids

	  @FindBy(xpath="//span[normalize-space()='My Account']")
		WebElement myAccount;	
	  @FindBy(xpath="//a[normalize-space()='Register']")
				WebElement myRegister;
	  @FindBy(linkText="Login")
	  WebElement log;


	   //Action methods- click()
		   
	   public void clickmyAccount() {
		   
		   myAccount.click();
	   }
     public void clickRegister() {
		   
		   myRegister.click();
	   }
	   public void clickLogin() {
		   log.click();
	   }
	

}
