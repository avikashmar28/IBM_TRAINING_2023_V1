package SeleniumExample;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FirstExample {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
		 ChromeOptions chromeOptions = new ChromeOptions();
		 chromeOptions.addArguments("--remote-allow-origins=*");
		 ChromeDriver driver = new ChromeDriver(chromeOptions);
		 driver.manage().window().maximize();
		 driver.get("http://www.automationpractice.pl/index.php");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 System.out.println(driver.getTitle());
		 //driver.findElement(By.id("APjFqb")).sendKeys("gmail");
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 //driver.findElement(By.name("btnK")).click();
		 //driver.findElement(By.xpath("//input[@name='btnK']")).click();
		 driver.findElement(By.xpath("//header[@id='header']/div[2]//a")).click();
		 //driver.findElement(By.xpath("//a[@class='sf-with-ul']")).click();
		 //WebElement ele=driver.findElement(By.xpath("//a[@class='sf-with-ul']"));
		 //Actions action=new Actions(driver);
		 //action.moveToElement(ele).perform();
		 //driver.findElement(By.xpath("//a[@title='T-shirts']")).click();
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("avikashmar28@gmail.com");
		 driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Angana@1995");
		 driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		 String msg=driver.findElement(By.xpath("//span[@class='shop-phone']")).getText();
		 System.out.println(msg);
		 
		WebElement ele=driver.findElement(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]"));
		Actions action=new Actions(driver);
		action.moveToElement(ele).perform();
		//driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[2]/ul/li/a")).click();
		driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[2]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//div[@id='center_column']/ul/li/div//a")).click();
		Thread.sleep(1000);
		//driver.close();
		 
		

	}

}
