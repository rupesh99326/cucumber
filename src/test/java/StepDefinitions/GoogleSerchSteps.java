package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSerchSteps {

	WebDriver driver=null;
	@SuppressWarnings("deprecation")
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println(" user is in browser");
		String projectPath=System.getProperty("user.dir");
		System.out.print("Project path is"+projectPath);
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	}

	@And("user is on google serch page")
	public void user_is_on_google_serch_page() {
		System.out.println("User is on google");
		
		driver.navigate().to("https://google.com");
		
		
	}

	@When("user enters a text in serch box")
	public void user_enters_a_text_in_serch_box() throws InterruptedException {
		
		System.out.println("user is in serch box");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		Thread.sleep(3000);
	}

	@When("hits enter")
	public void hits_enter() {
		
		System.out.println("user enter the hits button");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to serch results")
	public void user_is_navigated_to_serch_results() {
		System.out.println("User navigate to result page");
		driver.getPageSource().contains("Online Courses");
		
		driver.close();
		driver.quit();
		
	}
}
