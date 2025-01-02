package selenium1.Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationAssignment {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");

		WebElement getUserName = driver.findElement(By.xpath("//form[@id='login-form']/div[7]/p/b[1]/i"));
		String userName = getUserName.getText();
		// System.out.println(userName);

		WebElement getPassword = driver.findElement(By.xpath("//form[@id='login-form']/div[7]/p/b[2]/i"));
		String password = getPassword.getText();
		// System.out.println(password);

		WebElement enterName = driver.findElement(By.id("username"));
		enterName.sendKeys(userName);
		WebElement enterPassword = driver.findElement(By.id("password"));
		enterPassword.sendKeys(password);

		WebElement radioButton2 = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/div/label[2]/span[2]"));
		radioButton2.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("modal-content")));

		WebElement okay = driver.findElement(By.id("okayBtn"));
		okay.click();

		/*
		 * WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10)); Alert
		 * alert = wait.until(ExpectedConditions.alertIsPresent());
		 * System.out.println(alert.getText()); driver.switchTo().alert().accept();
		 */

		// WebElement dropDown = driver.findElement(By.className("form-control"));
		WebElement dropDown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[5]/select"));
		Select s = new Select(dropDown);
		s.selectByValue("consult");

		driver.findElement(By.id("terms")).click();

		WebElement submit = driver.findElement(By.id("signInBtn"));
		submit.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("iphone X")));

		List<WebElement> products = driver.findElements(By.cssSelector(".btn.btn-info"));
		int count = products.size();

		for (int i = 0; i < count; i++) {
			driver.findElements(By.cssSelector(".btn.btn-info")).get(i).click();
		}

		/*
		 * WebElement iphone = driver.findElement(By.xpath(
		 * "//div[@class='container']/div/div[2]/app-card-list/app-card[1]/div/div[2]/button"
		 * )); iphone.click();
		 * 
		 * WebElement sumsung = driver.findElement(By.xpath(
		 * "//div[@class='container']/div/div[2]/app-card-list/app-card[2]/div/div[2]/button"
		 * )); sumsung.click();
		 * 
		 * WebElement nokia = driver.findElement(By.xpath(
		 * "//div[@class='container']/div/div[2]/app-card-list/app-card[3]/div/div[2]/button"
		 * )); nokia.click();
		 * 
		 * WebElement blackberry = driver.findElement(By.xpath(
		 * "//div[@class='container']/div/div[2]/app-card-list/app-card[4]/div/div[2]/button"
		 * )); blackberry.click();
		 */

		js.executeScript("window.scrollBy(0,-300)");

		Thread.sleep(3000);
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement checkOut = driver.findElement(By.partialLinkText("Checkout"));
		checkOut.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn.btn-success")));
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);

		WebElement finalCheckout = driver.findElement(By.cssSelector(".btn.btn-success"));
		finalCheckout.click();

		WebElement country = driver.findElement(By.id("country"));
		country.sendKeys("France");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='checkbox2']")));

		Actions action = new Actions(driver);
		
		WebElement suggestion = driver.findElement(By.className("suggestions"));
		action.moveToElement(suggestion).click().build().perform();

		WebElement agreeTerms = driver.findElement(By.id("checkbox2"));
		// agreeTerms.click();
		action.moveToElement(agreeTerms).click().build().perform();

		WebElement finalSubmit = driver.findElement(By.cssSelector(".btn.btn-success.btn-lg"));
		finalSubmit.click();

	}

}
