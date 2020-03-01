package Nov30;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkInNewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manjula\\Downloads\\chromedriver.exe");
				
				WebDriver driver =new ChromeDriver();
				
				driver.manage().window().maximize(); //this is used to maximize the window
				driver.get("http://newtours.demoaut.com/");
				
				WebElement link = driver.findElement(By.linkText("SIGN-ON"));
				link.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
				
				
				

	}

}
