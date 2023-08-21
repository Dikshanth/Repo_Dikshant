package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic1 {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.get("https://demo.actitime.com/login.do");
    driver.manage().window().maximize();
    By by_username=By.name("username");
    WebElement ele_username = driver.findElement(by_username);
    ele_username.sendKeys("admin");
    
    By by_password=By.name("pwd");
    WebElement ele_password=driver.findElement(by_password);
    ele_password.sendKeys("manager");
    
    By by_login=By.xpath("//a[@class=\"initial\"]");
    WebElement ele_loginbutton=driver.findElement(by_login);
    ele_loginbutton.click();
    Thread.sleep(3000);
    
    driver.close();
	}

}
