package AppiumPackage;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import pageObjects.Android.LoginPageElements;
import utilities.ReUsableMethods;

public class LoginPageImplementation extends BaseClass {

    @Test(priority=1)
    public void fillForm() throws InterruptedException {
       // try {
            // Wait for the element to be present before interacting with it
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            
            LoginPageElements se=new LoginPageElements(driver);
            
            ReUsableMethods re=new ReUsableMethods(driver);
            se.setNameField("sweety");
            se.setRadioBtnField();
            se.setCountryDropdownField();
            
            re.scrollIntoElement("Cambodia");
     
//            driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
//                       ".scrollIntoView(new UiSelector().textContains(\"Cambodia\"))")).click();
            se.setShopBtnField();
            Thread.sleep(2000);
            re.screenshot(driver, "sandeep");
//            se.setproduct1();
//            se.setProduct2();
//            se.setviewCartField();
//            wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("com.androidsample.generalstore:id/toolbar_title"), "Cart"));
//            List<WebElement> productPrices = driver.findElements(By.xpath("//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productPrice\"] "));
//          double sum = 0;
//          for (WebElement productPrice : productPrices) {
//              String price = productPrice.getText();
//              double d = Double.parseDouble(price.substring(1));
//              sum = sum + d;
//          }
//
//          // Print the total price
//          System.out.println("Total Price: $" + sum);
//
//          // Optionally, you can add an assertion to verify the total price if needed
//          // Assert.assertEquals( sum, "Total price is not as expected");
//    
//           
//            String ele=driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
//          // Assert.assertEquals(ele, sum);
//           System.out.println("Total element"+ele);
//           
//           Thread.sleep(2000);
//           
//           WebElement ele1=driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));
//           longPress(ele1);
//           Thread.sleep(2000);
//           //driver.findElement(By.id("android:id/button1")).click();
//            
//            se.setCloseBtnField();
//            se.setCheckBoxField();
//            se.setProceedBtnField();
//            
            
         
    }}

