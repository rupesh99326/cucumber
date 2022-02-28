package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;

public class Demosite2 {
	
	
	@Given("user is in Test box")
	public void user_is_in_test_box() throws InterruptedException {
	    
		WebDriver driver=null;
			
			String projectPath=System.getProperty("user.dir");
			System.out.print("Project path is"+projectPath);
			System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.navigate().to("https://demoqa.com/elements");
			driver.findElement(By.xpath("//*[@id=\"item-0\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[1]/div[2]/input")).sendKeys("Rupesh");
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[2]/div[2]/input")).sendKeys("rupesh99326@gmail.com");
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[3]/div[2]/textarea")).sendKeys("Kolkata new");
			driver.findElement(By.id("permanentAddress")).sendKeys("Kolkata new2");
			driver.findElement(By.id("submit")).submit();
			Thread.sleep(5000);
			driver.close();
			
			
	}

	@When("user is in check box")
	public void user_is_in_check_box() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WebDriver driver=null;
		driver=new ChromeDriver();
		driver.navigate().to("https://demoqa.com/elements");
		driver.findElement(By.xpath("//*[@id=\"item-1\"]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/ol/li/span/label/span[1]/svg/path")).click();
		Thread.sleep(4000);
	        driver.close();
	        
	}
	
	

	@When("user is in radio botton")
	public void user_is_in_radio_botton() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WebDriver driver=null;
		driver=new ChromeDriver();
		driver.navigate().to("https://demoqa.com/elements");
		driver.findElement(By.xpath("//*[@id=\"item-2\"]")).click();
		Thread.sleep(5000);
		
		// driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/ol/li/span/label/span[1]/svg/path")).click();
	     //   radio.click();
	        driver.close();
	}
	        
	 @When("user is in button")
	 public void user_is_in_button()
	 {
		 WebDriver driver=null;
			driver=new ChromeDriver();
			driver.navigate().to("https://demoqa.com/elements");
			driver.findElement(By.xpath("//*[@id=\"item-3\"]")).click();
			//driver.findElement(By.id("addNewRecordButton")).click();
			
		 
	 }
	 
	 @When("user is in table")
	 public void user_is_in_table() throws InterruptedException {
		 String projectPath=System.getProperty("user.dir");
		System.out.print("Project path is"+projectPath);
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
		 WebDriver driver=null;
		driver=new ChromeDriver();
		
		driver.navigate().to("https://demoqa.com/elements");
		
			
			driver.navigate().to("https://demoqa.com/elements");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"item-4\"]")).click();
			Thread.sleep(3000);
			Actions act = new Actions(driver);
			WebElement ele = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/button")); 
			act.doubleClick(ele).perform();
			WebElement elementLocator = driver.findElement(By.id("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/button"));
			act.contextClick(elementLocator).perform();
			Thread.sleep(4000);	
			driver.findElement("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button").click();//Question
			
	 }
	 @When("user is in Links")
	 public void user_is_in_links() throws InterruptedException {
		 
		 	WebDriver driver=null;
			driver=new ChromeDriver();
			driver.navigate().to("https://demoqa.com/elements");
			driver.findElement(By.xpath("//*[@id=\"item-5\"]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/p[1]/a")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/p[2]/a")).click();
	 }
			@When("user is in broken")
			public void user_is_in_broken() throws InterruptedException 
			{
				WebDriver driver=null;
				driver=new ChromeDriver();
				driver.navigate().to("https://demoqa.com/elements");
				driver.findElement(By.xpath("//*[@id=\"item-6\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/a[1]"));
				Thread.sleep(5000);
				
			}

			@When("user is in upload")
			public void user_is_in_upload() throws InterruptedException {
			    // Write code here that turns the phrase above into concrete actions
				WebDriver driver=null;
				driver=new ChromeDriver();
				driver.navigate().to("https://demoqa.com/elements");
				driver.findElement(By.xpath("//*[@id=\"item-7\"]")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@id=\"downloadButton\"]")).submit();
				Thread.sleep(5000);
				WebElement chooseFile = driver.findElement(By.xpath("//*[@id=\"uploadFile\"]"));
				chooseFile.sendKeys("C:\\Users\\RUPJHA\\Downloads\\Zomato(Sprint2)\\ZOMATO(RUPESH KUMAR JHA)\\ZOMATO(RUPESH KUMAR JHA)\\ZomCucumber\\src\\test\\java\\StepDefinition59");
				
			}

			@When("user is in dynamic property")
			public void user_is_in_dynamic_property() throws InterruptedException {
				WebDriver driver=null;
				driver=new ChromeDriver();
				driver.navigate().to("https://demoqa.com/elements");
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@id=\"item-8\"]")).click();
				
				Thread.sleep(5000);
			}
		 
	 }
	 
		
