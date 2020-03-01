package Nov30;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manjula\\Downloads\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
	/*  	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//--it is used for find element whenevr there is find elemnt it will wait for that much time for which it si defined
		
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("usrnmae")).sendKeys("manjulaganachari@gmail.com");*/
		
		

		driver.get("https://www.seleniumeasy.com/test/dynamic-data-loading-demo.html");
		
		driver.findElement(By.id("save")).click();
		WebDriverWait wait = new WebDriverWait(driver,10);
		Boolean result = wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("loading"), "First Name")); //Explicit Wait
		
		if (result == true)
		{
			String text = driver.findElement(By.id("loading")).getText();
			System.out.println(text);
		}
	
		

	}

}
