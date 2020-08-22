package Base.HomeDepot;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Base_Class {
	
	public WebDriver driver;
	
	@Parameters({"browser", "url"})
	  @BeforeClass
	 
	  public void browser(String browser,String url) throws InterruptedException {
		  if(browser.equalsIgnoreCase("Chrome")) {
				
			  System.setProperty("webdriver.chrome.driver", "/Users/rashidaislam/git/mac-backup1/HomeDepot/Driver/chromedriver 8");
				driver = new ChromeDriver();
				driver.navigate().to(url);
				
			driver.manage().window().maximize();
			
			} else if(browser.equalsIgnoreCase("Firefox")) {
				
				System.setProperty("webdriver.gecko.driver", "/Users/rashidaislam/Downloads/geckodriver");
				
				driver = new FirefoxDriver();
				driver.navigate().to(url);
				driver.manage().window().maximize(); 
			}else {
				System.out.println("Wrong browser name");
		}
	}

  @AfterClass
  	 
	  public void afterClass() throws IOException, InterruptedException {
		
	
  }
}
	  

  


