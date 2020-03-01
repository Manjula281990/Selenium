package Nov30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manjula\\Downloads\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize(); //this is used to maximize the window
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.findElement(By.id("photo")).sendKeys("M:\\Pics\\Ved\\1.jpg");

	}

}
