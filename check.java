package Homework.week2;

import org.openqa.selenium.By;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class check {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
		Thread.sleep(2000);

		WebElement chk = driver.findElement(By.xpath("(//input[@type='checkbox'])[6]"));
		if (chk.isSelected()) 
		{ 
			System.out.println("Is selected");
		}
		else 
		{
			System.out.println("Not Selected");
		}

		WebElement deselect = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]/input"));
		if(deselect.isSelected());
		{
			deselect.click();
		}
		WebElement deselect1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input"));
		if(deselect1.isSelected());
		{
			deselect1.click();
		}
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[1]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[3]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[4]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[5]/input")).click();


	}

}


