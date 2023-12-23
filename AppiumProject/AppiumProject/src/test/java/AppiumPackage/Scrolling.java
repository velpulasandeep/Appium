package AppiumPackage;

import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;

public class Scrolling extends BaseClass {

    @Test
    public void scrollingFunctionality() {
        // Click on the "Views" element
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Views']")).click();

        // Scroll to the "Expandable Lists" element
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"Expandable Lists\"))"));
    }
}
