package AppiumPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class EcommerceApp extends BaseClass {

    @Test
    public void fillForm() throws InterruptedException {
    
    	
 	
    	
    	Thread.sleep(5000);
        //driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("sandeep velpula");
        driver.hideKeyboard();
        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/radioFemale")).click();
        
        driver.findElement(AppiumBy.id(	"android:id/text1")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"Cambodia\"))"));
        Thread.sleep(3000);
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"Cambodia\"]")).click();
        
        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
        
        String errMsg=driver.findElement(AppiumBy.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
        Assert.assertEquals(errMsg, "Please enter your name");
        
//        driver.navigate().back();
//        driver.navigate().forward();
        
        
       

        Thread.sleep(2000);
    }
}
