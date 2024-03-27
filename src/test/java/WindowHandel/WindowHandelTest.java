package WindowHandel;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandelTest {
public static WebDriver driver;
	
	@Test
	
	public void initilize() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Arize\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.salesforce.com/au/");
			driver.manage().window().maximize();
			WebElement button = driver.findElement(By.xpath("(//a[contains(text(),'Start free trial')])[1]"));
			button.click();
			Thread.sleep(3000);
			Set<String>windowHandeles =driver.getWindowHandles();
			System.out.println(windowHandeles);
			Iterator<String>iterator =windowHandeles.iterator();
			String parentwindow = iterator.next();
			
			String childwindow = iterator.next();
			
			driver.switchTo().window(childwindow);
			
			System.out.println(driver.getTitle());
			
			driver.switchTo().window(parentwindow);
			
			System.out.println(driver.getTitle());
			
			
			}
			
			
			
			
			


}
