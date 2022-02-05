package Homework.week2;

import org.openqa.selenium.By;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class check {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.findElement(By.xpath("(//div[@class='example']//input[@type='checkbox'])[5]")).click();
		System.out.println(driver.findElement(By.xpath("(//div[@class='example']//input[@type='checkbox'])[6]")).isSelected());
		 WebElement c1 = driver.findElement(By.xpath("(//div[@class='example']//input[@type='checkbox'])[6]"));
		boolean a=c1.isSelected();
		 if (a == true)
		{
			driver.findElement(By.xpath("(//div[@class='example']//input[@type='checkbox'])[6]")).click();

		}
		
		
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).isSelected();

	}

}
	
		
		
		
