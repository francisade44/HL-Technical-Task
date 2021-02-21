package dynamicloaded;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicLoadedExample2 {
	
	@Test(description="Example2 Check hello world appears")

	public void verifyHelloWorld() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://the-internet.herokuapp.com/dynamic_loading");
		 
		 Thread.sleep(800);
		 
		 driver.findElement(By.linkText("Example 2: Element rendered after the fact")).click();
		 driver.findElement(By.xpath("//button[text()='Start']")).click();
		 if(driver.findElement(By.id("loading")) != null) {
		 
			 System.out.println("Hello World!");;
		 }
		 
		 
	}
}
		 
		 //driver.findElement(By.linkText("Example 2: Element rendered after the fact")).click();
		 //driver.findElement(By.xpath("//button[text()='Start']")).click();
		 

	


