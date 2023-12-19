package AppiumPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class LongPressFunctionality  extends BaseClass{
	@Test
	public void longPress1() throws InterruptedException         
	{
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Views']")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Expandable Lists']")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='1. Custom Adapter']")).click();
		WebElement ele=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"People Names\"]")); 
		
		
		//longPress(ele);
		// Java
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) ele).getId(),"duration",2000
		));
	}

}
