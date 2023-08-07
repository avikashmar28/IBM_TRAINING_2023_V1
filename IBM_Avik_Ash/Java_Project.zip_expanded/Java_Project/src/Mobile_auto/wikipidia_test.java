package Mobile_auto;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.*;

public class wikipidia_test {
	private static final Object True = null;
	public static AndroidDriver appiumDriver;

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		String username="avik_nThqkS";
		String automate_key="eaBVHycSLUJHfZsFnMXN";
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("os-version", "10.0");
		cap.setCapability("device", "Google Pixel 3"); 
		cap.setCapability("app", "bs://9d52361d6139a9eb27b9db1a4d46437df63f1156"); 
		cap.setCapability("project", "wiki_check"); 
		cap.setCapability("build", "Build 1.1"); 
		cap.setCapability("name", "FirstWikiCheck");
		String URL="https://" + username + ":" + automate_key + "@hub-cloud.browserstack.com/wd/hub";
		appiumDriver=new AndroidDriver(new URL(URL),cap);
		//MobileElement click1=(MobileElement) appiumDriver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"org.wikipedia.alpha:id/horizontal_scroll_list_item_text\"]"));
		//System.out.println(click1.getText());
		//click1.click();
		
		MobileElement click1=(MobileElement) appiumDriver.findElement(By.id("org.wikipedia.alpha:id/fragment_feed_header"));
		assertEquals(click1.isEnabled(),true);
		click1.click();
		appiumDriver.findElement(By.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("browserstack");
		appiumDriver.findElement(By.xpath("//android.view.View[@resource-id=\"org.wikipedia.alpha:id/fragment_feed_header\"]")).click();
		
		appiumDriver.quit();

	}

}
