package SeleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manjula\\Downloads\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();  //driver is the object of chrome driver , web driver is the interface which will have only methods and not the implementation
	
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		Thread.sleep(2000);
	    driver.findElement(By.id("cookie_action_close_header")).click();
		
		
		
		WebElement textbox1 = driver.findElement((By.name("firstname")));
		textbox1.sendKeys("Manjula");
		
		WebElement textbox2 = driver.findElement((By.id("lastname")));
		textbox2.sendKeys("GaNACHARI");
		
		driver.findElement(By.id("sex-1")).click();
		driver.findElement(By.id("exp-5")).click();
		driver.findElement(By.id("profession-0")).click();
		driver.findElement(By.id("profession-1")).click();
		driver.findElement(By.id("tool-2")).click();
		
		Select obj = new Select(driver.findElement(By.id("continents")));
		obj.selectByValue("AN");
		
		Select multi = new Select(driver.findElement(By.id("continentsmultiple")));
		multi.selectByValue("SA");
		multi.selectByVisibleText("North America");
		multi.selectByIndex(0);
		Thread.sleep(2000);
		multi.deselectAll();
		
		
		
	}

}
