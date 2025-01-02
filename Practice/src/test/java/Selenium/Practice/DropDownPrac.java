package Selenium.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		WebElement staticDD = driver.findElement(By.id("dropdown-class-example"));
		Select ss = new Select(staticDD);
		
		//ss.selectByVisibleText("Option3");
		//ss.selectByValue("option2");
		ss.selectByIndex(3);
		List<WebElement> elementCount=ss.getOptions();
		System.out.println(elementCount.size());
		//driver.close();
		
	}

}
