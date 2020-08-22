package pages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInfoPage {
	
	public WebDriver driver;

	@FindBy(xpath = "//*[text()= 'Create an Account'])[1]")
	WebElement CreateAccountButton;
	
	 @FindBy(xpath = "(//p[@class='u__bold u__text-align--center u__husky']")
	 WebElement createSiteText; 
	 	 
	 @FindBy(name = "email")
	 WebElement emailfield;
	 
	 @FindBy(name = "password")
	 WebElement passwordfield;
	 
	 @FindBy(name = "zipcode")
	 WebElement zipcodefield;
	 
	 @FindBy(name = "phone")
	 WebElement phonefield;
	 
	 @FindBy(xpath = "//span[text()='Create an Account']")
	 WebElement createAccountButton;
	 
	 public ContactInfoPage(WebDriver driver) {

	  this.driver = driver;
	  PageFactory.initElements(driver, this);
	  
	 }	 
		 public void emailfieldinput() {
		  emailfield.sendKeys("islamrash@gmail.com");
		 }
		 public void passwrdfieldinput() {
		  passwordfield.sendKeys("rashida123");
		 }
		 public void zipCodefieldinput() {
		  zipcodefield.sendKeys("22201");
		 }
		 public void phoneNumberfieldinput() {
		  phonefield.sendKeys("7039448822");
		 }
		 public void createButtonAccount() {
		  createAccountButton.click();
		 }
		 public boolean createButtonClickable() {
		  boolean click = createAccountButton.isEnabled();
		  return click;
		 }

		
		
}





