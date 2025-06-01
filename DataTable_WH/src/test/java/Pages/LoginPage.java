package Pages;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	@FindBy(name="username")
	WebElement USERNAME;
	
	@FindBy(name="password")
	WebElement PASSWORD;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	WebElement LOGINBTN;
	

	public void LoginPageDriver(WebDriver driver1) {

		this.driver = driver1;
		PageFactory.initElements(driver, this);

	}

	public void OpensURL(String TestURL) {

		driver.get(TestURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	public void LoginCredentials(io.cucumber.datatable.DataTable dataTable)
			throws InterruptedException {

		List<Map<String, String>> Login = dataTable.asMaps(String.class, String.class);

		String username = Login.get(0).get("USERNAME");
		String password = Login.get(0).get("PASSWORD");

		USERNAME.sendKeys(username);
		Thread.sleep(2000);
		PASSWORD.sendKeys(password);
		Thread.sleep(2000);

		LOGINBTN.click();
		Thread.sleep(2000);

	}

}
