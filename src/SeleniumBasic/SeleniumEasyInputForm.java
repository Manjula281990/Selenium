package SeleniumBasic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumEasyInputForm {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manjula\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();      //driver is the object of chrome driver , web driver is the interface which will have only methods and not the implementation
		
		//driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		
		//driver.findElement(By.xpath("//input[@placeholder='Please enter your Message']")).sendKeys("Hello");
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		/*driver.findElement(By.xpath("//button[contains(text(),'Click me!')]")).click(); // if the expression contains text then we can use like this to locate the element

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.accept();*/
		
		/*driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
		
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		Thread.sleep(2000); 
		alert1.accept();
		System.out.println(driver.findElement(By.xpath("//p[@id='confirm-demo']")).getText());*/
		
		driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
		Alert alert2=driver.switchTo().alert();
		alert2.sendKeys("Manjula");
		Thread.sleep(2000);
		alert2.accept();
		System.out.println(driver.findElement(By.xpath("//p[@id='prompt-demo']")).getText());
		
		
		
		
		
		
		
		
		
	}

}
