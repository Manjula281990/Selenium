package SeleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class xPathexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manjula\\Downloads\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		WebElement textBox1 = driver.findElement(By.xpath(".//input[@name='userName']")); //absolute type of expression
		textBox1.sendKeys("manjulaganachari@gmail.com");
		
		WebElement textBox2 = driver.findElement(By.xpath(".//input[@name='password']"));
		textBox2.sendKeys("manjula123");
		
	
		
		
		
		WebElement click=driver.findElement(By.xpath("//input[@name='login']"));
		click.click();
		
      /*  List<WebElement> radios = driver.findElements(By.xpath("//input[@name='tripType']"));
		
		System.out.println(radios);
		System.out.println(radios.size());
		
		radios.get(1).click();
		
		WebElement dd=driver.findElement(By.xpath("//select[@name='passCount']"));
		Select obj= new Select(dd);
		obj.selectByVisibleText("4");
		

		WebElement dd1=driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select obj1= new Select(dd1);
		obj1.selectByVisibleText("London");
		
		WebElement dd2=driver.findElement(By.xpath("//select[@name='fromMonth']"));
		Select obj2= new Select(dd2);
		obj2.selectByVisibleText("December");
		
		WebElement dd3=driver.findElement(By.xpath("//select[@name='fromDay']"));
		Select obj3= new Select(dd3);
		obj3.selectByVisibleText("20");
		
		WebElement dd4=driver.findElement(By.xpath("//select[@name='toPort']"));
		Select obj4= new Select(dd4);
		obj4.selectByVisibleText("Paris");
		
		
		WebElement dd5=driver.findElement(By.xpath("//select[@name='toMonth']"));
		Select obj5= new Select(dd5);
		obj5.selectByVisibleText("December");
		
		WebElement dd6=driver.findElement(By.xpath("//select[@name='toDay']"));
		Select obj6= new Select(dd6);
		obj6.selectByVisibleText("20");
		
		List<WebElement> radios1= driver.findElements(By.xpath("//input[@name='servClass']"));
		radios1.get(2).click();
		
		WebElement dd7=driver.findElement(By.xpath("//select[@name='airline']"));
		Select obj7= new Select(dd7);
		obj7.selectByVisibleText("Unified Airlines"); */
		
		
		

	}

}
