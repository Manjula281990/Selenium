package Dec01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedXpath {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manjula\\Downloads\\chromedriver.exe");
		
		/*WebDriver driver =new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		
		WebElement textBox1 = driver.findElement(By.xpath(".//input[@name='userName']")); //absolute type of expression
		textBox1.sendKeys("manjulaganachari@gmail.com");
		
		WebElement textBox2 = driver.findElement(By.xpath(".//input[@name='password']"));
		textBox2.sendKeys("manjula123");
		
		
		WebElement click=driver.findElement(By.xpath("//input[@name='login']"));
		click.click();
		
		
		driver.findElement(By.xpath("//input[@name='tripType' and @value = 'oneway']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@name='tripType' and @value,'roundtrip')]")).click();*/ // using conditional operator for the xpath

		
      /* WebDriver driver =new ChromeDriver();
       driver.get("https://www.amazon.in");
       
       driver.findElement(By.xpath("//a[starts-with(@id,'nav-link-ac')]")).click();*/  //using starts with operator where in if the id or something is very big


/*WebDriver driver =new ChromeDriver();
driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

driver.findElement(By.id("user-message")).sendKeys("Hello");
driver.findElement(By.xpath("//button[text()='Show Message']")).click();*/


//following is used in xpath where we locate the first and then the next which ever is with the given criteraia it will locate though at same level or under that

WebDriver driver =new ChromeDriver();
driver.get("http://newtours.demoaut.com/");

//driver.findElement(By.name("userName")).sendKeys("manjulaganachari@gmail.com");
//driver.findElement(By.xpath("//input[@name ='userName']//following::input")).sendKeys("manjula123");
//driver.findElement(By.xpath("//input[@name ='userName']//following::input[2]")).click();


//ancestor is used in xpath to locate the element and then its above element will be located



		
				
		

	}

}
