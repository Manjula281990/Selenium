package Nov30;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickRightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manjula\\Downloads\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/tooltip-and-double-click/");
		
		WebElement button = driver.findElement(By.id("doubleClickBtn"));
		Actions action = new Actions(driver);
		action.doubleClick(button).build().perform();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
		WebElement rclick = driver.findElement(By.id("rightClickBtn"));
		action.contextClick(rclick).build().perform();
		
		

	}

}
