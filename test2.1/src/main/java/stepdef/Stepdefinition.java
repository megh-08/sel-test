package stepdef;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.Testbase;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Home;

public class Stepdefinition extends Testbase {
	
	Home home;
	
	public Stepdefinition() throws Throwable
	{
		super();
	}
	@Before
	public void setup() throws Throwable
	{
		initialization();
		home=new Home();
		
	}
	
	
	@Given("^user is on the homepage$")
	public void user_is_on_the_homepage() throws Throwable {
	  
		System.out.println("1st test case");
	}

	@When("^valid title$")
	public void valid_title() throws Throwable {

		String title=home.validatetitle();
		System.out.println(title);
		
	}

	@Then("^user clicks on groceries$")
	public void user_clicks_on_groceries() throws Throwable {
		
		home.groceries();
		String title=driver.getTitle();
		System.out.println(title);
	    
	}

	@Then("^user clicks on f&f$")
	public void user_clicks_on_f_f() throws Throwable {
		
		driver.navigate().back();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sc=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(sc,new File("./scrnshots/ff.png"));
		String title=driver.getTitle();
		home.fandf();
		
		System.out.println(title);
		
	  
	}

	@Then("^user clicks on clubcard$")
	public void user_clicks_on_clubcard() throws Throwable {
	   
	}

	@Then("^user clicks on tescobank$")
	public void user_clicks_on_tescobank() throws Throwable {
	  
	}

	@Then("^user clicks on tescomobile$")
	public void user_clicks_on_tescomobile() throws Throwable {
	  
	}

	@Then("^user clicks on recipies$")
	public void user_clicks_on_recipies() throws Throwable {
	   
	}

	@Then("^user clicks on tescophoto$")
	public void user_clicks_on_tescophoto() throws Throwable {
	   
	}

	@Then("^user clicks on magasine$")
	public void user_clicks_on_magasine() throws Throwable {
	  
	}

	@After
	public void closetest()
	{
		//home.close();
	}
	
	

}
