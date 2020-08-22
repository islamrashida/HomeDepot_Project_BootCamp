package pages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage2 {
WebDriver driver;
	
	@FindBy(xpath = ("//*[contains(@id,'headerMyAccountTitle')][div]"))
	WebElement MyAccountText;
	
	@FindBy(xpath = "//p[3]//a[1]//span[1]")
	WebElement Register;
	
	@FindBy(xpath = "//p[contains(text(),\"I'm shopping for myself\")]")
	WebElement PersonalAccountText ;
	
	@FindBy(xpath = "//span[contains(text(),'Select & Continue')]")
	WebElement SelectContinueText;
	
	public HomePage2 (WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public String MyAccountTextVerification() {
		String MyAccountCurrentText=MyAccountText.getText();
		return MyAccountCurrentText;
	}
	
	public void MyAccountClick() {
		MyAccountText.click();
	}
	public void Registerbutton() {
		Register.click();
	}
	public void getPersonalAccountClick () {
		PersonalAccountText.click();
	}
	
     public void getSelectContinueClick() {
    	 SelectContinueText.click();
     }
}





