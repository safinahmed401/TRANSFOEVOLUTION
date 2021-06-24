package step_defination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookAppointmentProcessTest {

	public static final String url ="https://transfotechacademy.com/";
	public static WebDriver driver;
	
	@Before
	public void loadBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Safin\\Desktop\\Drivers"
    		+ "\\ChromeDriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(url);
	}
	@After
	public void closeBrowser() {
	driver.close();
	}
	
	@Given("user is in home page")
	public void user_is_in_home_page() {
	   Assert.assertEquals(driver.getCurrentUrl(), url);
	}
}

	
