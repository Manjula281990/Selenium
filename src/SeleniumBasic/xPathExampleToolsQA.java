package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathExampleToolsQA {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manjula\\Downloads\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();      //driver is the object of chrome driver , web driver is the interface which will have only methods and not the implementation
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		Thread.sleep(2000);
	    driver.findElement(By.id("cookie_action_close_header")).click();
		
		
		
		WebElement textbox1 = driver.findElement(By.xpath("//*[@name='firstname']"));
		textbox1.sendKeys("Manjula");
		
		//WebElement textbox2 = driver.findElement((By.id("lastname")));
		//textbox2.sendKeys("GaNACHARI");
		

	}

}
