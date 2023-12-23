package AppiumPackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseClass {
    AndroidDriver driver;

    @BeforeClass
    public void setUp() {
        try {
            UiAutomator2Options options = new UiAutomator2Options();
            options.setDeviceName("sandeep");
            options.setApp("C:\\Users\\sandeep96\\Desktop\\GeneralStore\\General-Store.apk");

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
            // Uncomment the line below if implicit wait is needed
            // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        } catch (MalformedURLException e) {
            e.printStackTrace(); // Handle or log the exception as needed
        }
    }

//    public void longPress(WebElement element) {
//        ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",
//                ImmutableMap.of("elementId", ((RemoteWebElement) element).getId()));
//    }
//
//    public void scrollIntoElement(String text) {
//        driver.findElement(AppiumBy.androidUIAutomator(
//                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\""
//                        + text + "\"))")).click();
//    }
    
    public void tearDown()
    {
    	driver.quit();
    }

}
