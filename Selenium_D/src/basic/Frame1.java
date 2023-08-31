package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	    driver.manage().window().maximize();
	    
	   // driver.switchTo().frame(0);
	    driver.switchTo().frame("packageListFrame");

	    By by_ele=By.xpath("//a[@href=\"org/openqa/selenium/package-frame.html\"]");
	    WebElement ele_click=driver.findElement(by_ele);
	    Thread.sleep(2000);
	    ele_click.click();
	    
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame(1);
	    By by_ele1=By.xpath("//span[text()='WebDriver']");
	    WebElement el_find=driver.findElement(by_ele1);
	    el_find.click();
	    
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame(2);
	    By by_ele2=By.xpath("//a[contains(text(),'Index')][1]");
	    WebElement ele_cli=driver.findElement(by_ele2);
	    ele_cli.click();
	    
	    Thread.sleep(2000);
	    driver.close();
		}
	}


