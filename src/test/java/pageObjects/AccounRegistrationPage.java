package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccounRegistrationPage extends BasePage {

	
	public AccounRegistrationPage(WebDriver driver){
		
		super(driver);
		
	}
	
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement fname;
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement lname;
	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement phone;
	@FindBy(xpath="//input[@id='input-password']")
	WebElement pswd;
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement cpswd;
	@FindBy(xpath="//input[@name='agree']")
	WebElement agree;
	@FindBy(xpath="//input[@value='Continue']")
	WebElement cbtn;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirm;
	
	public void setFname(String firstname) {
		fname.sendKeys(firstname);
	}
	public void setlname(String lastname) {
		lname.sendKeys(lastname);
	}
	public void setemail(String em) {
		email.sendKeys(em);
	}
	public void setphone(String p) {
		phone.sendKeys(p);
	}
	public void setPass(String pas) {
		pswd.sendKeys(pas);
	}
	public void setcPass(String cpas) {
		cpswd.sendKeys(cpas);
	}
	public void clickAgree() {
		agree.click();
		
	}
	public void clickbutton() {
		cbtn.click();
		
	}
	
	
	
public String getconfirmation() {
     try {
    	 return(msgConfirm.getText());
     }
     catch(Exception e) {
    	 return (e.getMessage());
     }
}

	




}
