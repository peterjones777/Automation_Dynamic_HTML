package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Test_Library.Exp_wait;
import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class TestPlan2 {
	
	By Plans=By.xpath("//a[text()='plans']");
	By Upload_box=By.xpath("//div[@class='ds-file-uploader__container']");
	By Upload_pdf=By.xpath("//input[@class='ds-file-uploader__file-input']");
	By Skip=By.xpath("//span[@class='mat-button-wrapper' and text()=' Skip auto naming ']");
	
	WebDriver driver;
	Exp_wait wait;
	public TestPlan2(WebDriver driver) {
		this.driver=driver;
		wait=new Exp_wait(this.driver);
	}
	@Test
	public void Upload_file()
	{	
	 wait.towait(Plans);
	 driver.findElement(Plans).click();
	 wait.towait(Upload_box);
	 WebElement upload=driver.findElement(Upload_pdf);
	 upload.sendKeys("C:\\Users\\p\\Downloads\\yes.pdf");
	}
	public void Skip()
	{
	 wait.towait(Skip);
	driver.findElement(Skip).click();
	}
}