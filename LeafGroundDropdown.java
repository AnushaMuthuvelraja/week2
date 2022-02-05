package Homework.week2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundDropdown {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
	       ChromeDriver driver= new ChromeDriver();
	       driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement dropdown1=driver.findElement(By.id("dropdown1"));
		Select dd=new Select(dropdown1);
		dd.selectByIndex(4);
		WebElement dropdown2= driver.findElement(By.name("dropdown2"));
		Select dd1=new Select(dropdown2);
		dd1.selectByVisibleText("Selenium");
		WebElement dropdown3= driver.findElement(By.name("dropdown3"));
		Select dd2=new Select(dropdown3);
		dd2.selectByValue("2");
		WebElement findElement = driver.findElement(By.xpath("(//option[text()='Select your programs']"));
Select s1=new Select(findElement);
s1.selectByVisibleText("Appium");
s1.selectByIndex(2);
s1.selectByValue("2");
		
		
//driver.findElement(By.xpath("(//button[@id='position']")).getSize());

	
	
	
	
	
	
		
		
		
	}
}
