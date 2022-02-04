package Homework.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException 
	{
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		//driver.findElement(By.id("ext-gen868")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("ANUSHA");
		driver.findElement(By.id("lastNameField")).sendKeys("MUTHUVELRAJA");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("ANU");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Muthu");
		driver.findElement(By.name("departmentName")).sendKeys("MCA");
		driver.findElement(By.name("description")).sendKeys("MASTER OF COMPUTER APPLICATIONS");
		Thread.sleep(3000);
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Anu88@gmail.com");
		WebElement state=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select ss=new Select(state);
		ss.selectByVisibleText("New York");
		Thread.sleep(3000);
		//driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Important");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		System.out.println(driver.getTitle());
		

	}

}
