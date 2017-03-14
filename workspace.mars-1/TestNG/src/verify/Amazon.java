package verify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Amazon {
	public WebDriver d;
	@Test (priority = 1)
	public void Page(){
	
	System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\gecko\\geckodriver.exe");
	 d = new FirefoxDriver();

	}
	@Test (priority = 2)
	public void Google() throws Exception 
	{
		d.get("http://www.google.com");
		d.findElement(By.id("gs_htif0")).sendKeys("Amazon");
		d.findElement(By.id("_fZl")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/h3/a")).click();
		Thread.sleep(1000);
		d.findElement(By.id("nav-cart")).click();
		String t = d.getTitle();
		System.out.println(t);
	} 
}

