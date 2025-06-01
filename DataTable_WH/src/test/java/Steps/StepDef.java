package Steps;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.SkillsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	WebDriver driver;
	
	LoginPage LP;
	SkillsPage SP;
	HomePage HP;

	@Given("User launch Chrome browser")
	public void user_launch_chrome_browser() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		

	}

	@When("User enter URL {string}")
	public void user_enter_url(String TestURL) {
		
		LP = new LoginPage();
		LP.LoginPageDriver(driver);
		LP.OpensURL(TestURL);
		
		
		

	}

	@When("user login into the below credentials")
	public void user_login_into_the_below_credentials(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		
		LP.LoginCredentials(dataTable);

	}
	
	
	@Then("go to skills page")
	public void go_to_skills_page() throws InterruptedException {
		
		SP = new SkillsPage();
		SP.SkillsPageDriver(driver);
		SP.GotoSkillsPage();
	    
		  
	}

	@When("Creating skills record")
	public void creating_skills_record(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		
		SP.SkillRecord(dataTable);
		
	}
		

	@When("click on logout button")
	public void click_on_logout_button() {
		HP = new HomePage();
		HP.HomePageDriver(driver);

	}

	@Then("close the browser")
	public void close_the_browser() {

	}

}
