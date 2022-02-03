package Homework.week2;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSignupPage {

	// @SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();

		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("Anusha");

		driver.findElement(By.name("lastname")).sendKeys("Muthu");

		driver.findElement(By.name("reg_email__")).sendKeys("anusha@gmail.com");

		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("anusha@gmail.com");

		driver.findElement(By.id("password_step_input")).sendKeys("Test");

		WebElement day = driver.findElement(By.id("day"));
		Select ss = new Select(day);
		ss.selectByVisibleText("11");

		WebElement month = driver.findElement(By.id("month"));
		Select ss1 = new Select(month);
		ss1.selectByValue("2");

		WebElement year = driver.findElement(By.id("year"));
		Select ss2 = new Select(year);
		ss2.selectByValue("1988");

		driver.findElement(By.xpath("//label[text()='Female']")).click();

	}

}
