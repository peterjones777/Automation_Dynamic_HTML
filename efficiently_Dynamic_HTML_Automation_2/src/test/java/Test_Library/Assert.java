package Test_Library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Assert {
	WebDriver driver;
	public Assert(WebDriver driver) {
		this.driver=driver;
	}
	public String toverify(By xp) {
	WebElement verify=driver.findElement(xp);
	String s;
	if(verify.isDisplayed()){
		s="Success";
		
	}
	else {
		s="Failed";
	}
	return s;

}}
