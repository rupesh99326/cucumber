package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=null;
		driver=new ChromeDriver();
		driver.navigate().to("https://demoqa.com/elements");
		driver.findElement(By.id("//*[@id=\"item-2\"]")).click();
		
		// WebElement radio = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/ol/li/span/label/span[1]/svg/path"));
	     //   radio.click();
	        driver.close();
		
	}

}
