package SeleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicSelenium {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manjula\\Downloads\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		/*  WebElement textBox= driver.findElement(By.name("userName"));  //findElement returns the Web Element and hence we are storing the value in web element 
		
		textBox.sendKeys("manjulaganachari@gmail.com");
		
		WebElement textBox1 = driver.findElement(By.name("password"));
		textBox1.sendKeys("manjula123");
		
		WebElement click=driver.findElement(By.name("login"));
		click.click();

		/* driver.findElement(By.linkText("REGISTER")).click();
		WebElement textbox = driver.findElement((By.name("firstName")));
		textbox.sendKeys("Manjula");
		
		WebElement textbox1 = driver.findElement((By.name("lastName")));
		textbox1.sendKeys("Ganachari");
		
		WebElement textbox2 = driver.findElement((By.name("phone")));
		textbox2.sendKeys("123456789");
		
		WebElement textbox3=driver.findElement(By.id("userName"));
	    textbox3.sendKeys("manjulaganachari@gmail.com");
	    
	    WebElement textbox4=driver.findElement(By.name("address1"));
	    textbox4.sendKeys("Undri");
	    
	    WebElement textbox5=driver.findElement(By.name("city"));
	    textbox5.sendKeys("Pune");
	    
	    WebElement textbox6=driver.findElement(By.name("state"));
	    textbox6.sendKeys("Maharashtra");
	    
	    WebElement textbox7=driver.findElement(By.name("country"));
	    textbox7.sendKeys("India");
	    
	    WebElement textbox8=driver.findElement(By.id("email"));
	    textbox8.sendKeys("manjulaganachari@gmail.com");
	    
	    WebElement textbox9=driver.findElement(By.name("password"));
	    textbox9.sendKeys("manjula123");
	    
	    WebElement textbox10=driver.findElement(By.name("confirmPassword"));
	    textbox10.sendKeys("manjula123");
	    
	    
	    WebElement click=driver.findElement(By.name("register"));
		click.click();*/
		
		/* List<WebElement> radios = driver.findElements(By.name("tripType"));
		
		System.out.println(radios);
		System.out.println(radios.size());
		
		radios.get(1).click();
		
		WebElement dd=driver.findElement(By.name("passCount"));
		Select obj= new Select(dd);
		obj.selectByVisibleText("4");
		

		WebElement dd1=driver.findElement(By.name("fromPort"));
		Select obj1= new Select(dd1);
		obj1.selectByVisibleText("London");
		
		//List<WebElement> dropdown = driver.findElements(By.name("fromMonth"));
		//List<WebElement> dropdown1 = driver.findElements(By.name("fromDay"));
		
		WebElement dd2=driver.findElement(By.name("fromMonth"));
		Select obj2= new Select(dd2);
		obj2.selectByVisibleText("December");
		
		WebElement dd3=driver.findElement(By.name("fromDay"));
		Select obj3= new Select(dd3);
		obj3.selectByVisibleText("20");
		
		WebElement dd4=driver.findElement(By.name("toPort"));
		Select obj4= new Select(dd4);
		obj4.selectByVisibleText("Paris");
		
		
		WebElement dd5=driver.findElement(By.name("toMonth"));
		Select obj5= new Select(dd5);
		obj5.selectByVisibleText("December");
		
		WebElement dd6=driver.findElement(By.name("toDay"));
		Select obj6= new Select(dd6);
		obj6.selectByVisibleText("20");
		
		List<WebElement> radios1= driver.findElements(By.name("servClass"));
		radios1.get(2).click();
		
		WebElement dd7=driver.findElement(By.name("airline"));
		Select obj7= new Select(dd7);
		obj7.selectByVisibleText("Unified Airlines");
		
		
		System.out.println("Title : " +driver.getTitle());  // returns the title of the web page 
		System.out.println("URL :" + driver.getCurrentUrl()); // gives the url of the current web paage which we are into
		
		//driver.close(); // this is used to close the browser after executing the written code
		
		
	
		
		//driver.navigate().back(); */
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		System.out.println(allLinks.size());
		
		for (WebElement link : allLinks) {
			
			String text = link.getText();
			System.out.println("Text is: "+ text);
			
			
			
			
			if(text.equals("Car Rentals"))
			{
				String url = link.getAttribute("href");
				System.out.println("URL is : " + url);
				
				link.click(); //if the break is not added then there will be exception as stale element reference exception --read details in java classes notepad
				break;
			}
			
			String url = link.getAttribute("href");
			System.out.println("URL is : " + url);
			
			
		}
		
		/* driver.navigate().to("http://www.google.co.in");  //navigates to the new window 
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh(); */
		
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
		
		
		
		
		

	}

}
