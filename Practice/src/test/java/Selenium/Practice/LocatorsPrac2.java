package Selenium.Practice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorsPrac2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement selectCountries = driver.findElement(By.cssSelector("input[id='autocomplete']"));
		selectCountries.sendKeys("Canada");
		
		WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
		Select selectDrop = new Select(dropDown);
		selectDrop.selectByVisibleText("Option2");
			
		
		WebElement alertName = driver.findElement(By.cssSelector("input#name"));
		alertName.sendKeys("Regina");
		
		WebElement confirm = driver.findElement(By.xpath("//input[@id='confirmbtn']"));
		confirm.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		WebElement openTab = driver.findElement(By.id("opentab"));
		openTab.click();
		

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		

	}

}
