package Homework.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundLink {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Link.html");
		//driver.findElement(By.linkText("Go to Home Page")).click();
		System.out.println(driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Verify am I broken?']")).click();
		String title = driver.getTitle();
		if(title.equals("HTTP Status 404 – Not Found")) 
		{
			System.out.println("Broken Link");
		}
		else 
		{
			System.out.println("Not Borken Link");
		}

		int totalLinks = driver.findElements(By.tagName("a")).size();
		System.out.println(totalLinks);



	}

}

