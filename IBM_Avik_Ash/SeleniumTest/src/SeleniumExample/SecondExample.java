package SeleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SecondExample {
	static WebDriver webdriver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
		 ChromeOptions chromeOptions = new ChromeOptions();
		 chromeOptions.addArguments("--remote-allow-origins=*");
		 ChromeDriver driver = new ChromeDriver(chromeOptions);
		 driver.manage().window().maximize();
		 driver.get("https://tutorialsninja.com/demo/");
		 driver.findElement(By.xpath("//input[@name='search']")).sendKeys("iphone");
		 driver.findElement(By.xpath("//div[@id='search']/span/button")).click();
		 if(driver.findElement(By.xpath("//a[contains(text(),'iPhone')]")).isDisplayed()) {
			 System.out.println("Its Passed");
		 }
		 else {
			 System.out.println("Its Failed");
		 }
		 driver.findElement(By.xpath("//a[contains(text(),'iPhone')]")).click();
		 String s=driver.findElement(By.xpath("//h1[contains(text(),'iPhone')]/parent::div/ul[2]//h2")).getText();
		 System.out.println(s);
		 driver.findElement(By.xpath("//input[@name='quantity']")).clear();
		 driver.findElement(By.xpath("//input[@name='quantity']")).sendKeys("2");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@id='button-cart']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@id='cart']/button")).click();
		 driver.findElement(By.xpath("//strong[contains(text(),'View Cart')]/parent::a")).click();
		 if(driver.findElement(By.xpath("//div[@id='content']/form/div/table/tbody/tr/td[2]/a")).isDisplayed()) {
			 System.out.println("Displayed");
		 }
		 else {
			 System.out.println("Not Displayed");
		 }
		 
		 
		 

	}

}
