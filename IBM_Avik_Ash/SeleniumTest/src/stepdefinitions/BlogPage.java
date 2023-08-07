package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BlogPage {
	
	static WebDriver driver;
	@Given("user is in Search page")
	public void Navigatefirstpage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
		 ChromeOptions chromeOptions = new ChromeOptions();
		 chromeOptions.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(chromeOptions);
		 driver.manage().window().maximize();
		 driver.get("http://www.automationpractice.pl/index.php");
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 Thread.sleep(2000);
	}
	
	@When("user enters [string] product")
	public void giveinput(String product) throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//header[@id='header']/div[2]//a[contains(text(),'Sign in')]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(product);
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Angana@1995");
		
	}
	@And("Click on Search button")
	public void clicksubmit() {
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
	}
	@Then("Click on Search button")
	public void DR() {
		System.out.println("Final");
	}

}
