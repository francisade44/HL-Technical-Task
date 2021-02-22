package javascriptalert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class jsConfirm {
	
	//@Parameters(browser)
	@Test(description="Click for js confirm")
	public void JsConfirm() throws InterruptedException  {
		    
        WebDriver driver;
        
		    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    	driver= new ChromeDriver();
	    	driver.manage().window().maximize();
	    	Reporter.log("The Browser is Maximised",true);
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		    Reporter.log("The App is Launched",true);
			 
			 Thread.sleep(800);
			 
			WebElement element= driver.findElement(By.xpath("//button[contains(text(), 'js confirm')]"));
			 
			 //WebElement ok = driver.findElement(By.linkText("Click for JS Confirm"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", element);
			 

}
}
