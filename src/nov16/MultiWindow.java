package nov16;
 
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindow {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manjula\\Downloads\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		driver.findElement(By.id("followall")).click();
		
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);   //gets the parent window id
		
		Set<String> allWindows = driver.getWindowHandles();   //gives the id of the window
		
		System.out.println(allWindows);
		for (String window:allWindows)
		{
			if(! window.equals(parentwindow)) {
				driver.switchTo().window(window);
				String title = driver.getTitle();
				System.out.println("Title is" + title);
				if(title.contains("Twitter")) {
					driver.findElement(By.id("username_or_email")).sendKeys("123456977889");
					break;
				
				
				
				
				
			}
		}
		
		

	}
		driver.switchTo().window(parentwindow);

}
}