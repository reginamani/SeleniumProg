package Selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement suggestionCountry = driver.findElement(By.cssSelector("input[id^='auto']"));
		suggestionCountry.sendKeys("Canada");
		
		WebElement dropDown = driver.findElement(By.cssSelector("select[id$='example']"));
		dropDown.sendKeys("Option1");
		
		WebElement switchAlert = driver.findElement(By.cssSelector("input[name*='enter']"));
		switchAlert.sendKeys("Regina");

	}

}
