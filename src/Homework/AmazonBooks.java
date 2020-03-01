package Homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBooks {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manjula\\Downloads\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver(); 
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("books");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		//System.out.println(driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).getText());
		
		File file=new File("C:\\Users\\Manjula\\Documents\\Books.xls");
		FileInputStream inputStream=new FileInputStream(file);
		HSSFWorkbook workbook=new HSSFWorkbook(inputStream);
		HSSFSheet sheet = workbook.getSheet("Sheet1");
			
		
		
		List<WebElement> allBooks = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        System.out.println(allBooks.size());
		
		for (WebElement link : allBooks) {
			
			String text = link.getText();
			ArrayList<String> aList=new ArrayList<>();
			aList.add(text);
			System.out.println("Text is  :" + text );
			
			/* int maxRows = sheet.getLastRowNum();
	         HSSFRow row=sheet.createRow(maxRows+1);
		     int maxCells = row.getLastCellNum();
		      HSSFCell cell=row.createCell(maxCells);
		      row.createCell(maxCells).setCellValue(text);
		
		FileOutputStream out=new FileOutputStream(file);
		workbook.write(out);
		out.close(); */
		}
		}
}

	


	
	

