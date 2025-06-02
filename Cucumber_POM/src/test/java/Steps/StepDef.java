package Steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	WebDriver driver;

	@Given("User launch Chrome browser")
	public void user_launch_chrome_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@When("User enter URL {string}")
	public void user_enter_url(String TestURL) {
		driver.get(TestURL);

	}

	@When("user enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String USERNAME, String PASSWORD) throws InterruptedException {
		
		driver.findElement(By.name("username")).sendKeys(USERNAME);
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys(PASSWORD);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(3000);

	}

	@Then("Go to skill page")
	public void go_to_skill_page() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button/i")).click();
		Thread.sleep(3000);

	}

	@When("Add skills with skillname as {string} and skilldiscription as {string}")
	public void add_skills_with_skillname_as_and_skilldiscription_as(String SKILLNAME, String SKILLDESC) throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(SKILLNAME);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(SKILLDESC);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
		Thread.sleep(3000);

	}

	@When("click on logout button")
	public void click_on_logout_button() {

	}

	@Then("close the browser")
	public void close_the_browser() {

	}

}
