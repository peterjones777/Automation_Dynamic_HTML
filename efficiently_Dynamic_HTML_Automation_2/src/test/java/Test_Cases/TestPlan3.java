package Test_Cases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Test_Library.Exp_wait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPlan3 {
	WebDriver driver;
	Exp_wait wait;
	
	By Schedule=By.xpath("//a[text()='schedules']");
	By rooms=By.xpath("//a[text()='rooms']");
	By Create_room=By.xpath("//button[contains(@class,'mat-focus-indicator mat-menu-trigger slds-m')]");
	By Form_menu=By.xpath("//div[contains(@id,'mat-menu-panel')]");
	By Select_room=By.xpath("//button[text()=' Kitchen - Dining - Living ']");
	By Page_load=By.xpath("(//div[@class='slds-p-bottom--small'])[2]");
	By Kitchen=By.xpath("(//div[@class='ds-project-create-room__list-item' and contains(text(),' Kitchen ')])[2]");
	By Kitchen_vestuble=By.xpath("(//div[text()=' Kitchen - Vestibule '])[2]");
	By Save=By.xpath("(//span[@class='mat-button-wrapper' and text()=' Save '])[2]");
	By Add_finish_area=By.xpath("//div[text()='Kitchen - Vestibule']//following::span[text()=' Add finish area ']");
	By Add_finish_area_menu=By.xpath("//div[@role='menu']");
	By Select_floor=By.xpath("//button[@role='menuitem' and text()=' Floor ']");
	By Finish_item=By.xpath("//div[@class='slds-truncate slds-shrink-none' and text()='Kitchen - Vestibule']//following::div[contains(@class,'slds-truncate ds-schedule-rooms-finish-area-row__finish-id-item-action-l')]");
	By Create_new_proj=By.xpath("//span[text()=' Create new project finish '] ");
	By Wood_floor=By.xpath("//button[text()=' Wood Flooring ']");
	By Select_wood=By.xpath("//div[@class='mat-tooltip-trigger' and text()=' Select an item ']");
	By Placeholder=By.xpath("//input[@placeholder='Type:']");
	By Wood=By.xpath("//span[@class='mat-option-text']//child::div[text()='Wood']");
	By View_all=By.xpath( "//span[text()=' View all items ']");
	By Add_proj=By.xpath("(//span[@class='mat-button-wrapper' and text()=' Add to project '])[1]");
	By Assign_to_finish=By.xpath("//div[text()='Assign to finish area']//parent::span");
	
	public TestPlan3(WebDriver driver) {
		this.driver=driver;
		 wait=new Exp_wait(this.driver);
	}
	
	@Test
	public void Add_room()
	{
		
	 //TEST 3
	 //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='slds-p-right--large ds-subheader']")));
	 driver.findElement(Schedule).click();
	 wait.towait(rooms);
	 driver.findElement(rooms).click();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	 driver.findElement(Create_room).click();
	 wait.towait(Form_menu);
	 driver.findElement(Select_room).click();
	 wait.towait(Page_load);
	}
	public void Kitchen()
	{
	 driver.findElement(Kitchen).click();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	 driver.findElement(Kitchen_vestuble).click();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	 driver.findElement(Save).click();
	}
	public void Add_finish_area()
	{
	 wait.towait(Add_finish_area);
	 driver.findElement(Add_finish_area).click();
	 wait.towait(Add_finish_area_menu);
	 driver.findElement(Select_floor).click();
	 wait.towait(Finish_item);
	driver.findElement(Finish_item).click();
	}
	public void Create_project_finish()
	{
	driver.findElement(Create_new_proj).click();
	wait.towait(Wood_floor);
	driver.findElement(Wood_floor).click();
	wait.towait(Select_wood);
	driver.findElement(Select_wood).click();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	 driver.findElement(Placeholder).click();
	 driver.findElement(Wood).click();

	 wait.towait(View_all);
	 driver.findElement(View_all).click();
	 wait.towait(Add_proj);
	 driver.findElement(Add_proj).click();
	 wait.towait(Assign_to_finish);
	 driver.findElement(Assign_to_finish).click();
	 
	 
	}}
