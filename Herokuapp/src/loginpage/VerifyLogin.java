package loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyLogin {
	
	@Parameters("browserName")
	@Test(description="To verify login is succesful for Valid Credentials")
	public void TestValidLogin(String browser) throws InterruptedException  {
		    
        WebDriver driver;
        if(browser.equalsIgnoreCase("chrome")) {
		    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    	driver= new ChromeDriver();
	    	driver.manage().window().maximize();
	    	Reporter.log("The Browser is Maximised",true);
        }else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	    	 driver= new FirefoxDriver();
			 driver.manage().window().maximize();
			 Reporter.log("The Browser is Maximised",true);
        }else {
			throw new IllegalArgumentException("Only for chrome and firefox");
		}
			
             driver.get("https://the-internet.herokuapp.com/login");
			 Reporter.log("The App is Launched",true);
			 
			 driver.findElement(By.id("username")).sendKeys("tomsmith");
			 Reporter.log("Enter username",true);
			 
			 driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
			 Reporter.log("Enter password",true);
			
			 driver.findElement(By.className("radius")).click();
			 Reporter.log("The login Button is Clicked",true);
			 
			Thread.sleep(5000);
			 
			driver.findElement(By.linkText("Logout")).click();
			Reporter.log("The logout button is Clicked",true);
		
		
			driver.close();
	}
	
	
}
