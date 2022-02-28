package StepDefinitions;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class DemoElement {
	WebDriver driver=null;
	@SuppressWarnings("deprecation")//ask
	@Given("Application is open")
	public void application_is_open() {
		
		String projectPath=System.getProperty("user.dir");
		System.out.print("Project path is"+projectPath);
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);	
	}
	

	@When("user is in home page")
	public void user_is_in_home_page() {
		
		driver.navigate().to("https://demoqa.com/elements");
	}

	@When("click on Demo site")
	public void click_on_demo_site() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"item-0\"]")).click();
		Thread.sleep(2000);
		
	}

	@When("click on Elements")
	public void click_on_elements() throws InterruptedException {
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[1]/div[2]/input")).sendKeys("Rupesh");
		Thread.sleep(2000);
		
	}

	@When("click on testbox")
	public void click_on_testbox() throws InterruptedException {
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[1]")).click();
		Thread.sleep(2000);
		
	}

	@And("user fill the details")
	public void user_fill_the_details() throws InterruptedException {
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[1]/div[2]/input")).sendKeys("Rupesh");
		Thread.sleep(2000);
		
		
		
	}

	@Then("click on submint")
	public void click_on_submint() throws InterruptedException {
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div/button"));
		Thread.sleep(2000);
		
		
	}


}
