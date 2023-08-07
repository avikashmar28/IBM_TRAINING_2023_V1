package IOSAuto;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class TestIOS {
	public static IOSDriver appiumDriver;

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		String username="avik_rJ6N7d";
		String automate_key="TMMpCdxsSYx5FphqAX6S";
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("os-version", "14");
		cap.setCapability("device", "iPhone 11"); 
		cap.setCapability("app", "bs://9e3e81d38759b6639899b3867e11802e05748248"); 
		cap.setCapability("project", "ios_automation"); 
		cap.setCapability("build", "IOS 1.1"); 
		cap.setCapability("name", "IOSCheck");
		String URL="https://" + username + ":" + automate_key + "@hub-cloud.browserstack.com/wd/hub";
		appiumDriver=new IOSDriver(new URL(URL),cap);
		IOSElement click1=(IOSElement) appiumDriver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Text Button\"]"));
		click1.click();
		appiumDriver.findElementByAccessibilityId("Text Input").click();
		appiumDriver.findElementByAccessibilityId("Text Input").sendKeys("Selenium");
		//appiumDriver.findElementByAccessibilityId("Return").click();
		IOSElement rtn1=(IOSElement) new WebDriverWait(appiumDriver,30).until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Return")));
		rtn1.click();
		MobileElement mob1=(MobileElement) appiumDriver.findElementByAccessibilityId("Text Output");
		WebDriverWait wait=new WebDriverWait(appiumDriver,30);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(MobileBy.AccessibilityId("Text Output"), "Selenium"));
		String text=mob1.getAttribute("value");
		System.out.println(text);
		if(text.equalsIgnoreCase("Selenium")) {
			System.out.println("String Matched");
		}
		else {
			System.out.println("String not matched");
		}
		appiumDriver.quit();

	}

}
