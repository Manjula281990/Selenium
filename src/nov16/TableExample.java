package nov16;

import java.util.List;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manjula\\Downloads\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		
		/*String val = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[2]/td[2]")).getText(); -- to get the data of the single column
		System.out.println(val);
		
		System.out.println(driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr/td")).getText());
		
		System.out.println(driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[4]/th")).getText());*/
		
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr"));   //using loop to fetch the entire table
		for (WebElement row: allRows)
		{
			List<WebElement> cells = row.findElements(By.tagName("td"));
			WebElement th=row.findElement(By.tagName("th"));
			
			if(th.getText().equals("Financial Center"))
			{
				System.out.println(th.getText());
				for (WebElement cell:cells)
				{
					System.out.println(cell.getText());
					}
				}
			
			System.out.println();
			
		}
			

	}

}
