package dynamicloaded;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicLoadedExample1 {
	
    @Test(description="Example1")
	public  void Testload() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://the-internet.herokuapp.com/dynamic_loading");
		 
		 Thread.sleep(800);
		 
		 driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
		 driver.findElement(By.xpath("//button[text()='Start']")).click();

	}

}
