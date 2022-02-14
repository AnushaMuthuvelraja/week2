package Homework.week2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select dIndex = new Select(dropdown1);
		dIndex.selectByIndex(2);

		WebElement dropdown2 = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select dtext = new Select(dropdown2);
		dtext.selectByVisibleText("Loadrunner");

		Thread.sleep(2000);
		WebElement dropdown3 = driver.findElement(By.xpath("//select[@id='dropdown3']"));
		Select dvalue = new Select(dropdown3);
		dvalue.selectByValue("2");

		Select ds = new Select(driver.findElement(By.xpath("//select[@class='dropdown']")));
		List<WebElement> l = ds.getOptions();
		System.out.println("No of options in Dropdown="+ " " +l.size());

		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='You can also use sendKeys to select']/..")).sendKeys("Appium");
		driver.findElement(By.xpath("(//option[@value='4'])[6]")).click();

	}




}


