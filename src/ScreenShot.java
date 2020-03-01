import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manjula\\Downloads\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
	driver.get("https://www.toolsqa.com/automation-practice-table/");
	
	TakesScreenshot ss =(TakesScreenshot) driver;       //TakeScreenShot is the interface which we are using as the type for driver
	File src = ss.getScreenshotAs(OutputType.FILE);
	File desc = new File("ScreenShot.jpg");
	FileUtils.copyFile(src, desc);
	

	}

}
