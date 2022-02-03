package Homework.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcmeSystem {

	public static void main(String[] args) throws InterruptedException 
	{
	  
		WebDriverManager.chromedriver().setup();
	       ChromeDriver driver= new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://acme-test.uipath.com/login");
	       driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
	       driver.findElement(By.id("password")).sendKeys("leaf@12");
	       driver.findElement(By.xpath("//form/button[@class='btn btn-primary']")).click();
	       System.out.println(driver.getTitle());
	       Thread.sleep(5000);
	       driver.findElement(By.linkText("Log Out"));
	       driver.close();
	       
	}

}
