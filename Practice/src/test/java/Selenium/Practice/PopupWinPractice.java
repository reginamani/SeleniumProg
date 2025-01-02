package Selenium.Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupWinPractice {
	
	public static void main(String args[]) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement newTab = driver.findElement(By.id("opentab"));
		newTab.click();
		
		System.out.println(driver.getWindowHandle());
		
		Set<String> windowsPage = driver.getWindowHandles();
		Iterator<String> it = windowsPage.iterator();
		
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
	}

}
