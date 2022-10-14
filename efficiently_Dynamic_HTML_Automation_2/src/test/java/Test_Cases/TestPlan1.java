package Test_Cases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Test_Library.Exp_wait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPlan1 {
	
	WebDriver driver;
	Exp_wait wait;
	
	By id=By.xpath("//input[@type='email']");
	By pass=By.xpath("//input[@ng-reflect-name='password']");
	By submit=By.xpath("//button[@type=\'submit\']");
	By Create_project=By.xpath("//span[text()=' Create new project ']");
	By Dialog_box=By.xpath("//*[@class='mat-dialog-container mat-dialog-container-theme--light']");
	By Proj_name=By.xpath("(//*[text()=' Project Name ']//ancestor::div//child::input)[1]");
	By City=By.xpath("(//*[text()=' Project Name ']//ancestor::div//child::input)[3]");
	By Street=By.xpath("(//*[text()=' Project Name ']//ancestor::div//child::input)[2]");
	By Form=By.xpath("(//*[text()=' Project Name ']//ancestor::div//child::input)[4]");
	By Form_dropdown=By.xpath("//div[@role='listbox']/mat-option/span/div[text()='NY']");
	By Pincode=By.xpath("(//*[text()=' Project Name ']//ancestor::div//child::input)[5]");
	By Proj_type=By.xpath("(//*[text()=' Project Name ']//ancestor::div//child::input)[6]");
	By list=By.xpath("//div[@role='listbox']/mat-option/span/div");
	By Get_list=By.xpath("//div[@role='listbox']/mat-option/span/div");
	By radio=By.xpath("//input[@type='radio' and @value='New']//parent::span");
	By Save=By.xpath("//span[text()='Save']");
	By Skip_step=By.xpath("//span[text()=' Skip this step ']");
	
	
	public TestPlan1(WebDriver driver) {
		this.driver=driver;
		 wait=new Exp_wait(this.driver);
	
	}
	

	@Test
	public void login() //logging in 
	{
		
		 driver.findElement(id).sendKeys("peterguduri777@gmail.com");
		 driver.findElement(pass).sendKeys("apple1000");
		 driver.findElement(submit).click();
		
	}
		 //Create New Project
	@Test
	public void Create_Project() {
		 wait.towait(Create_project);
		 driver.findElement(Create_project).click();
		 wait.towait(Dialog_box);
	}
		//Filling the form
	@Test
	public void Fill_form() {
		
		 driver.findElement(Proj_name).sendKeys("Automation_Testing");
		driver.findElement(City).sendKeys("Newyork");
		driver.findElement(Street).sendKeys("James Street");
		driver.findElement(Form).click();
		 wait.towait(Form_dropdown);
		driver.findElement(Form_dropdown).click();
		driver.findElement(Pincode).sendKeys("644655");
		driver.findElement(Proj_type).click();
		 wait.towait(list);
		List<WebElement> projtype=driver.findElements(Get_list);
		projtype.get(0).click();
		driver.findElement(radio).click();
		driver.findElement(Save).click();
		wait.towait(Skip_step);
		driver.findElement(Skip_step).click();
	}
	
	
}
