package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_login {

	public static void main(String[] args) throws InterruptedException 
	{
    WebDriver driver = new ChromeDriver ();
    driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();
   
    By by_search= By.xpath("//input[@type=\"text\"]");
    WebElement ele_search=driver.findElement(by_search);
    ele_search.sendKeys("mobile");
    
    By by_clicksearch =By.xpath("//input[@type=\"submit\"]");
    WebElement ele_clicksearch=driver.findElement(by_clicksearch);
    ele_clicksearch.click();
    
    Thread.sleep(1000);
    driver.close();
	}

}
