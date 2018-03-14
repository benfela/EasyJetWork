/**
 * 
 */
package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Lanre Fela
 *
 */
public class Test_Steps {
	
	public WebDriver driver;
	

	@Given("^I am on the Homepage$")
	public void i_am_on_the_Homepage() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.navigate().to("https://www.easyjet.com/en/");
	   driver.manage().window().maximize();
	}

	@Given("^I mouse over Flight info$")
	public void i_mouse_over_Flight_info() throws Throwable {
		
	}   

	@Given("^I see a FLIGTS & TRAVEL INFO$")
	public void i_see_a_FLIGTS_TRAVEL_INFO() throws Throwable {
		String ExpectedMessage = "FLIGTS & TRAVEL INFO";
	    String actualMessage = driver.findElement(By.xpath("/html/body/div[3]/div/header/div[1]/div[1]/nav[1]/ul/li[1]/span/a")).getText();
	    Assert.assertEquals(ExpectedMessage,actualMessage);
	 
	}

	@When("^I click on  FLIGHT TRACKER$")
	public void i_click_on_FLIGHT_TRACKER() throws Throwable {
		driver.findElement(By.className("Flight Tracker")).click();
		Thread.sleep(2000);
	   
	}

	@When("^I see an Arrival & Departure Information banner$")
	public void i_see_an_Arrival_Departure_Information_banner() throws Throwable {
		String ExpectedMessage = "I see an Arrival & Departure Information banner";
	    String actualMessage = driver.findElement(By.xpath("/html/body/div[3]/div/header/div[3]/div/div/h2")).getText();
	    Assert.assertEquals(ExpectedMessage,actualMessage);
	 
	}

	@When("^I enter  Amsterdam on the depature text field$")
	public void i_enter_Amsterdam_on_the_depature_text_field() throws Throwable {
	   driver.findElement(By.id("origin-769520")).sendKeys("Amsterdam");
	   
	}

	@When("^I enter London on the arrival text field$")
	public void i_enter_London_on_the_arrival_text_field() throws Throwable {
		driver.findElement(By.id("destination-769520")).sendKeys("London");
	    
	}

	@When("^I click the search button$")
	public void i_click_the_search_button() throws Throwable {
		driver.findElement(By.className("flight-finder-button")).click();
	    
	  
	}

	@Then("^I should see arrivals information for the current day$")
	public void i_should_see_arrivals_information_for_the_current_day() throws Throwable {
		String ExpectedMessage = "I should see arrivals information for the current day";
	    String actualMessage = driver.findElement(By.xpath("/html/body/div[3]/div/header/div[3]/div/div/h2")).getText();
	    Assert.assertEquals(ExpectedMessage,actualMessage); 
	  
	}

}
