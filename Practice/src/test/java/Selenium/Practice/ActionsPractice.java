package Selenium.Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsPractice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/");
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		
		Actions a = new Actions(driver);
		
		WebElement sigin = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		//a.moveToElement(sigin).build().perform();
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		//***keydown allows you to press and hold that key***
		a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("airpods").build().perform();
		
		//a.moveToElement(search).click().sendKeys("Iphone 16").doubleClick().contextClick().build().perform();
		
		
		//**chord allows to press more than 1 key simultaneously 
		a.moveToElement(search).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER)).build().perform();
		
		Set<String> windowHandler = driver.getWindowHandles();
		Iterator<String> it = windowHandler.iterator();
		
		String parentWindowID = it.next();
		System.out.println("Parent windowID:"+parentWindowID);
		
		String childWindowID = it.next();
		System.out.println("Child windowID:"+childWindowID);
		
		driver.switchTo().window(childWindowID);
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		System.out.println(driver.getTitle());
		
		
		

	}

}
