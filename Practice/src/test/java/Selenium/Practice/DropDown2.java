package Selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		
		//WebElement dropDown = driver.findElement(By.className("form-control"));
		WebElement dropDown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[5]/select"));
		Select s = new Select(dropDown);
		s.selectByIndex(2);
		

	}

}
