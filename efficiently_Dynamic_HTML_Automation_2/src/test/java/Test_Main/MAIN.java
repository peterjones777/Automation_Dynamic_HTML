package Test_Main;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Test_Cases.TestPlan1;
import Test_Cases.TestPlan2;
import Test_Cases.TestPlan3;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MAIN {

	WebDriver driver;
	@BeforeTest
	public void signin() {
		WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver(); 
		driver.get("https://login.efficiently.com/login");
		driver.manage().window().setSize(new Dimension(1024,768));

		
	}
	@Test(priority=1)
	public void test1() {
		TestPlan1 test1=new TestPlan1(driver);
		test1.login();
		test1.Create_Project();
		test1.Fill_form();
	}
	@Test(priority=2)
	public void test2() {
		TestPlan2 test2=new TestPlan2(driver);
		test2.Upload_file();
		test2.Skip();
	}
	@Test(priority=3)
	public void test3() {
		TestPlan3 test3=new TestPlan3(driver);
		test3.Add_room();
		test3.Kitchen();
		test3.Add_finish_area();
		test3.Create_project_finish();

}}
