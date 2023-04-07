package Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
		 public WebDriver driver;
	
	@Given("open the browser and enter the valid URL")
	public void open_the_browser_and_enter_the_valid_url() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}

	@When("user enters valid username")	
	public void user_enters_valid_username() {
		driver.findElement(By.name("username")).sendKeys("yuvi_220");
	   
	}

	@When("user enters the valid Password")
	public void user_enters_the_valid_password() {
		driver.findElement(By.name("password")).sendKeys("113561");
	 
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("(//div[contains(@class,'ab8w')])[6]")).click();

	}

	@Then("user should in homepage of the application")
	public void user_should_in_homepage_of_the_application() {
		String Title = driver.getTitle();
		System.out.println(Title);
		driver.close();
	   
	}


}
