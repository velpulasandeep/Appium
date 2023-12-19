package AppiumPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class EcommerceApp2 extends BaseClass {

    @Test
    public void fillForm() throws InterruptedException {
    
    	
 	
    	
    	Thread.sleep(5000);
        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("sandeep velpula");
        driver.hideKeyboard();
        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/radioFemale")).click();
        
        driver.findElement(AppiumBy.id(	"android:id/text1")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"Cambodia\"))"));
        //Thread.sleep(3000);
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"Cambodia\"]")).click();
        
        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
        
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"Jordan 6 Rings\"))"));
        int productCount=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
        System.out.println(productCount);
        
        for(int i=0;i<productCount;i++)
        {
        	String ProductName=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
        	System.out.println(ProductName);
        	if(ProductName.equalsIgnoreCase("Jordan 6 Rings"))
        	{
        		driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
        	}
        }
        driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
        Thread.sleep(3000);
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")),"Cart"));

        String msg=driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
        Assert.assertEquals(msg, "Jordan 6 Rings");
        
        
    }
}
