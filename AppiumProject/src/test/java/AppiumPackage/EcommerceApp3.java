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

public class EcommerceApp3 extends BaseClass {

    @Test
    public void fillForm() {
        try {
            // Wait for the element to be present before interacting with it
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            
            // Locate the name field and enter the name
            WebElement nameField = wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.id("com.androidsample.generalstore:id/nameField")));
            nameField.sendKeys("sandeep velpula");
            
            // Hide the keyboard
            driver.hideKeyboard();
            
            // Select the "Female" radio button
            driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/radioFemale")).click();
            
            // Click on the "Country" dropdown
            driver.findElement(AppiumBy.id("android:id/text1")).click();
            
            // Scroll to and click on the desired country ("Cambodia")
            driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
                            ".scrollIntoView(new UiSelector().textContains(\"Cambodia\"))")).click();
            
            // Click on the "Let's Shop" button
            driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
            
            // Add two products to the cart
            driver.findElement(By.xpath("(//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productAddCart\"])[1]")).click();
            driver.findElement(By.xpath("(//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productAddCart\"])[2]")).click();
            
            // View the cart
            driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id=\"com.androidsample.generalstore:id/appbar_btn_cart\"]")).click();
            
            // Wait for the cart page to load
            wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("com.androidsample.generalstore:id/toolbar_title"), "Cart"));
            
            // Calculate the total price of items in the cart
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
            // Assert.assertEquals(expectedTotal, sum, "Total price is not as expected");

        } catch (Exception e) {
            e.printStackTrace();
            // Handle the exception or fail the test as needed
            Assert.fail("Test failed: " + e.getMessage());
        }
    }
}
