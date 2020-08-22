package runner2;

import org.testng.annotations.Test;

import Base.HomeDepot.Base_Class;
import pages2.ContactInfoPage;
/*import Pages2.CreateDepotAccount;
import pages2.Home;
import pages2.Home2;*/
import pages2.HomePage2;
import pages2.RegisterPage;

public class Runner2 extends Base_Class{
  
	@Test(priority = 1)
  public void HomePageVerifiction() {
	  
	  HomePage2 home = new HomePage2(driver);
	  home.MyAccountClick();
	  home.MyAccountTextVerification();	
	  home.Registerbutton();
  }	  
	@Test(priority = 2)
  public void RegisterPageVerification() {
	  RegisterPage rp = new RegisterPage(driver);
		 rp.getSelectContinueClick();
		 rp.getPersonalAccountClick();
	}
	
@Test(priority = 3)
	public void ContactInfoPageVerification() throws InterruptedException {
	ContactInfoPage info = new ContactInfoPage(driver);
				
	
	info.emailfieldinput();	
	info.passwrdfieldinput();
	info.phoneNumberfieldinput();
	info.zipCodefieldinput();
	info.createButtonAccount();
	Thread.sleep(3000);
	
}
}

		
	





		  
	  
  

