package pageObjects.Android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AddToCartElements {
   
	AndroidDriver driver;
	public AddToCartElements(AndroidDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="(//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productAddCart\"])[1]")
	private WebElement product1Added;
	
	@AndroidFindBy(xpath="(//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productAddCart\"])[2]")
	private WebElement product2Added;
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@resource-id=\"com.androidsample.generalstore:id/appbar_btn_cart\"]")
	private WebElement viewAddToCart;
	//com.androidsample.generalstore:id/toolbar_title
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/toolbar_title")
	private WebElement WaitForAddToCartLoad;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productPrice\"] ")
	private WebElement TotalPrice;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/totalAmountLbl")
	private WebElement TotalAmount;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/termsButton")
	private WebElement LongPressBtn;
	
	@AndroidFindBy(id="android:id/button1")
	private WebElement CloseBtn;
	
	@AndroidFindBy(className  ="android.widget.CheckBox")
	private WebElement CheckBoxField;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnProceed")
	private WebElement ProceedBtn;
	
	
	public void setproduct1()
	{
		product1Added.click();
	}
	
	public void setProduct2()
	{
		product2Added.click();
	}
	
	public void setviewCartField()
	{
		viewAddToCart.click();
	}
	
	
	public void setCloseBtnField()
	{
		CloseBtn.click();
	}
	
	public void setCheckBoxField()
	{
		CheckBoxField.click();
	}
	
	public void setProceedBtnField()
	{
		ProceedBtn.click();
	}
	
	public void setLongPress()
	{
		LongPressBtn.isDisplayed();
	}
	
	
}
