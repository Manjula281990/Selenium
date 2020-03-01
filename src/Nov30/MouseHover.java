package Nov30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manjula\\Downloads\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement to = driver.findElement(By.id("nav-link-accountList"));
		Actions action = new Actions(driver); //actions is the class used for mouse actions
		action.moveToElement(to).build().perform();
		
		
		

	}

}
