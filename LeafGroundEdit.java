package Homework.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundEdit {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("anu.@gmail.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("ABC");
		Thread.sleep(2000);
		String append = driver.findElement(By.xpath("//input[@value ='TestLeaf']")).getAttribute("value");
		System.out.println(append);
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		Boolean result = driver.findElement(By.xpath("//input[@disabled='true']")).isDisplayed();
		if (result == true)
		{
			System.out.println("Is Disabled");
		} else 
		{
			System.out.println("Is Enabled");
		}
	}
}

