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
import pageObjects.Android.AddToCartElements;
import pageObjects.Android.LoginPageElements;
import utilities.ReUsableMethods;

public class AddToCartImplementation extends LoginPageImplementation {

    @Test(priority=2)
    public void fillForm1() throws InterruptedException {
       AddToCartElements atc=new AddToCartElements(driver);
       
       ReUsableMethods re=new ReUsableMethods(driver);
            atc.setproduct1();
            atc.setProduct2();
            atc.setviewCartField();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("com.androidsample.generalstore:id/toolbar_title"), "Cart"));
            List<WebElement> productPrices = driver.findElements(By.xpath("//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productPrice\"] "));
          double sum = 0;
          for (WebElement productPrice : productPrices) {
              String price = productPrice.getText();
              double d = Double.parseDouble(price.substring(1));
              sum = sum + d;
          }

          // Print the total price
          System.out.println("Total Price: $" + sum);

          // Optionally, you can add an assertion to verify the total price if needed
          // Assert.assertEquals( sum, "Total price is not as expected");
    
           
            String ele=driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
          // Assert.assertEquals(ele, sum);
           System.out.println("Total element"+ele);
           
           Thread.sleep(2000);
           
           WebElement ele1=driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));
           re.longPress(ele1);
           Thread.sleep(2000);
           //driver.findElement(By.id("android:id/button1")).click();
            
            atc.setCloseBtnField();
            atc.setCheckBoxField();
            atc.setProceedBtnField();
            
            
         
    }}

