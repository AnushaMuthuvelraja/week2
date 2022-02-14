package Homework.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundImage {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//img[@src='../images/testleaf_logo.png']")).click();
		String image = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']")).getAttribute("naturalWidth");
		System.out.println(image);
		if(image.equals("0")) 
		{
			System.out.println("Its Broken Image");
		}
		else 
		{
			System.out.println("Not Broken Image");
		}
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).sendKeys(Keys.ENTER);

	}

}
