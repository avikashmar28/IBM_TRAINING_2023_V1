package Mobile_auto;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppAuto {
	public static AndroidDriver appiumDriver;

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		String username="avikash_QvfRcH";
		String automate_key="MeCYohWMTvyp5gzpfFta";
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("os-version", "9.0");
		cap.setCapability("device", "Google Pixel 3"); 
		cap.setCapability("app", "bs://ea860c65f971e4eca7132c75e7d68e202fe0543a"); 
		cap.setCapability("project", "IBM_Training"); 
		cap.setCapability("build", "Build 1.0"); 
		cap.setCapability("name", "FirstMobileTest");
		String URL="https://" + username + ":" + automate_key + "@hub-cloud.browserstack.com/wd/hub";
		appiumDriver=new AndroidDriver(new URL(URL),cap);
		MobileElement click1=(MobileElement) appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Button[2]"));
		click1.click();
		MobileElement click2=(MobileElement) appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]"));
		click2.click();
		MobileElement pref=(MobileElement) appiumDriver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Preference\"]"));
		String displayedtext=pref.getText();
		System.out.println(displayedtext);
		pref.click();
		MobileElement pref2=(MobileElement) appiumDriver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"7. Fragment\"]"));
		pref2.click();
		List<MobileElement> mobilelement=appiumDriver.findElements(By.xpath("//android.widget.ListView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView[1]"));
		System.out.println(mobilelement.size());
		for(MobileElement ee:mobilelement) {
			System.out.println("Items are:" +ee.getText());
		}
		appiumDriver.quit();



	}

}
