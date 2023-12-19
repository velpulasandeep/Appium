package AppiumPackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseClass {
	AndroidDriver driver;

	@BeforeClass
	public void base() throws MalformedURLException {
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("sandeep");
		// options.setApp("C:\\Users\\sandeep96\\Desktop\\APKfiles\\APKFiles\\resources\\ApiDemos-debug.apk");
		options.setApp("C:\\Users\\sandeep96\\Desktop\\GeneralStore\\General-Store.apk");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
	}

	public void longPress(WebElement ele) {
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) ele).getId()));
	}

}
