package SeleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSourceCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manjula\\Downloads\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();  //driver is the object of chrome driver , web driver is the interface which will have only methods and not the implementation
	
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		System.out.println(driver.getPageSource());

	}

}
