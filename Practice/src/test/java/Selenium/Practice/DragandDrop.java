package Selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		WebElement frame = driver.findElement(By.xpath("//*[@id='post-2669']/div[2]/div/div/div[1]/p/iframe"));
		driver.switchTo().frame(frame);
		
		WebElement image1 =driver.findElement(By.xpath("//*[@id='gallery']/li[1]/img"));
		
		WebElement trash = driver.findElement(By.id("trash"));
		a.dragAndDrop(image1, trash).build().perform();

	}

}
