package pages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public WebDriver driver;
	
	@FindBy(xpath = "//p[contains(text(),\"I'm shopping for myself\")]")
	WebElement PersonalAccountText ;
	
	@FindBy(xpath = "//span[contains(text(),'Select & Continue')]")
	WebElement SelectContinueText;	
	
public RegisterPage (WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	
	public void getPersonalAccountClick () {
		PersonalAccountText.click();
	}
	
     public void getSelectContinueClick() {
    	 SelectContinueText.click();
     }

}
