package Selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {

	public static void main(String[] args) {
		
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String title = driver.getTitle();
	System.out.println(title);
	
	//WebElement emailId = driver.findElement(By.id("email"));
	WebElement emailId = driver.findElement(By.xpath("//div[@id='globalContainer']/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
	//WebElement emailId = driver.findElement(By.xpath("//input[@id='email']"));
	emailId.sendKeys("regi_mani@yahoo.in");
	
	//WebElement password = driver.findElement(By.id("pass"));
	WebElement password = driver.findElement(By.xpath("//div[@id='globalContainer']/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input"));
	password.sendKeys("vennilamani");
	
	//WebElement login = driver.findElement(By.name("login"));
	WebElement login = driver.findElement(By.xpath("//button[contains(@name,'log')]"));
	login.click();
	
	WebElement forgotPass = driver.findElement(By.partialLinkText("Forgot pass"));
	//forgotPass.click();
	

	}

}
