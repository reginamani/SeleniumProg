package selenium1.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CheckboxAssign {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		WebElement checkBox2 = driver.findElement(By.id("checkBoxOption2"));
		checkBox2.click();
		WebElement checkBox2Val = driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/fieldset/label[2]"));
		
		  String cbValue = checkBox2Val.getText(); 
		  System.out.println(cbValue);
		  
		  WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
		  Select ss = new Select(dropDown); 
		  ss.selectByVisibleText(cbValue);
		 
		  WebElement name = driver.findElement(By.id("name"));
		  name.sendKeys(cbValue);
		  driver.findElement(By.id("alertbtn")).click();
		  
		  System.out.println(driver.switchTo().alert().getText().contains(cbValue));
		  
		  

	}

}
