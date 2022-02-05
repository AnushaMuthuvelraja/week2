package Homework.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundLink {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Link.html");

		 driver.findElement(By.xpath("//a[text()='Verify am I broken?']")).click();
		// driver.findElement(By.xpath("(//div[@class='large-6 small-12columns']/preceding ::a)[4]")).click();
		String attribute = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
		System.out.println(attribute);
		java.util.List<WebElement> numberOfLinks = driver.findElements(By.tagName("a"));
		System.out.println(numberOfLinks.size());
        driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[2]")).click();
	}

}
