package Nov30;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPaste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manjula\\Downloads\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize(); //this is used to maximize the window
		driver.get("http://newtours.demoaut.com/");
		
		WebElement userName = driver.findElement(By.name("userName"));
		userName.sendKeys("manjulaganachari@gmail.com");
		
		userName.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
		driver.findElement(By.name("login")).click();
		
		

	}

}
