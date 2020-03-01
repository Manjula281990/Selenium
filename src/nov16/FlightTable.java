package nov16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manjula\\Downloads\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
	driver.get("http://newtours.demoaut.com/");
		
	WebElement textBox= driver.findElement(By.name("userName"));  //findElement returns the Web Element and hence we are storing the value in web element 
		
		textBox.sendKeys("manjulaganachari@gmail.com");
		
		WebElement textBox1 = driver.findElement(By.name("password"));
		textBox1.sendKeys("manjula123");
		
		WebElement click=driver.findElement(By.name("login"));
		click.click();
		
		WebElement clicks=driver.findElement(By.name("findFlights"));
		clicks.click();
		
		List<WebElement> allRows =  driver.findElements(By.xpath("//form[@name='results']/table/tbody/tr")); 
		System.out.println(allRows);
		
		for(WebElement row:allRows )
		{
			List<WebElement> allCells  = row.findElements(By.tagName("td"));
			for(int i=0;i<allCells.size();i++)
			{
				System.out.println(allCells.get(i).getText());
				if(allCells.get(i).getText().contains("Pangea Airlines"))
				{
					allCells.get(i-1).click();
					break;
				}
			}
		}
		
	}
}

