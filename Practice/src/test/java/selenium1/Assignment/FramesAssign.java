package selenium1.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAssign {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		WebElement nestedFrame = driver.findElement(By.linkText("Nested Frames"));
		nestedFrame.click();
		
		
		
		  WebElement frameTop = driver.findElement(By.name("frame-top"));
		  driver.switchTo().frame(frameTop); 
		  //driver.switchTo().frame("frame-top");
		  //driver.switchTo().frame(0);
		  
		  WebElement frameMiddle = driver.findElement(By.name("frame-middle"));
		  driver.switchTo().frame(frameMiddle);
		  
		  WebElement middle = driver.findElement(By.id("content")); 
		  String txt = middle.getText(); 
		  System.out.println(txt);
		
		  
		  
		
			/*
			 * driver.switchTo().frame("frame-bottom"); WebElement frameBottom =
			 * driver.findElement(By.name("frame-bottom")); String txt2 =
			 * frameBottom.getText(); System.out.println(txt2);
			 */
	}

}
