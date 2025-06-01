package Pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillsPage {

	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")
	WebElement ADMIN;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")
	WebElement QUALIFICATIONS;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]")
	WebElement SKILLS;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button/i")
	WebElement ADDBTN;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")
	WebElement SKILLNAME;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")
	WebElement SKILLDESC;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")
	WebElement SAVEBTN;
	
	
	

	public void SkillsPageDriver(WebDriver driver1) {

		this.driver = driver1;
		PageFactory.initElements(driver, this);

	}

	public void GotoSkillsPage() throws InterruptedException {

		ADMIN.click();
		Thread.sleep(2000);

		QUALIFICATIONS.click();
		Thread.sleep(2000);

		SKILLS.click();
		Thread.sleep(2000);
	}

	public void SkillRecord(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {

		List<Map<String, String>> SkillRecord = dataTable.asMaps(String.class, String.class);

		for (int i = 0; i < SkillRecord.size(); i++) {

			String skillname = SkillRecord.get(i).get("SKILLNAME");
			String skilldesc = SkillRecord.get(i).get("SKILLDESCRIPTION");

			ADDBTN.click();
			Thread.sleep(2000);

			SKILLNAME.sendKeys(skillname);
			Thread.sleep(2000);

			
			SKILLDESC.sendKeys(skilldesc);
			Thread.sleep(2000);

			SAVEBTN.click();

		}
	}

}
