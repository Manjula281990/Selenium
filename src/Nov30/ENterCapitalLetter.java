package Nov30;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ENterCapitalLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manjula\\Downloads\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize(); //this is used to maximize the window
		driver.get("http://newtours.demoaut.com/");
		
		WebElement userName = driver.findElement(By.name("userName"));
		
		Actions action= new Actions(driver);
		action.keyDown(userName,Keys.SHIFT).sendKeys("batman").keyUp(userName,Keys.SHIFT).build().perform();

	}

}
