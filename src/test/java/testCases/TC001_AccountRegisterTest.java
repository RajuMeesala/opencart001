package testCases;

import java.time.Duration;


import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AccounRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegisterTest extends BaseClass{
            

	
	
	@Test(groups={"Regression","Master"})
	public void verify_account_registration() {
		
		
		logger.info("***Starting of testcase***");
		logger.debug("This is debug log message..");
		try {
			
		HomePage hp=new HomePage(driver);
		hp.clickmyAccount();
		logger.info("Clicked on MyAccount");
		hp.clickRegister();
		logger.info("Clicked on Register");

		AccounRegistrationPage acc=new AccounRegistrationPage(driver);
		logger.info("Providing customer info");

		acc.setFname("ram");
		acc.setlname("m");
		acc.setemail(randomString()+"@gmail.com");
		acc.setphone("9282829282");
		acc.setPass("abc@123");
		acc.setcPass("abc@123");
		acc.clickAgree();
		acc.clickbutton();
		
		logger.info("Validating expected message...");

		
		String conf=acc.getconfirmation();
		Assert.assertEquals(conf,"Your Account Has Been Created!");
	   logger.info("Test Passed");
		}
		
		catch(Exception e){
			logger.error("Test Failed");
			logger.debug("Debug logs..");
			Assert.fail();
			
					
		}
		finally 
		{
		logger.info("***** Finished TC001_AccountRegistrationTest *****");
		}
	}
	

}
