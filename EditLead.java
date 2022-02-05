package Homework.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException 
	{
		
	
      
		WebDriverManager.chromedriver().setup();
	       ChromeDriver driver= new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("http://leaftaps.com/opentaps/control/main");
	       driver.findElement(By.id("username")).sendKeys("DemoCSR");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.partialLinkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Hari");
	      driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
	       String title = driver.getTitle();
	        System.out.println(title);
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//a[text()='Edit']")).click();
	       // driver.findElement(By.xpath("(//a[@class='subMenuButton'])[1]")).click();
	        if(title.equals("Duplicate Lead | opentaps CRM"))
	        {
	        	System.out.println("Verified");
	        }
	        
	        driver.findElement(By.id("updateLeadForm_companyName")).clear();
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("(//input[@id='updateLeadForm_companyName'])")).sendKeys("TCS");
	        driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
	        String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	        
	        if(text.contains("TCS"))
	        {
	        	System.out.println("Company name changed");
	        }
	        driver.close();
	}
	
	

}
