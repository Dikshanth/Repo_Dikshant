package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic2 {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.get("https://demoapp.skillrary.com/login.php?type=login");
    driver.manage().window().maximize();
    Thread.sleep(2000);
    By by_username=By.id("email");
    WebElement ele_username=driver.findElement(by_username);
    ele_username.sendKeys("user");
    
    By by_password=By.name("password");
    WebElement ele_password=driver.findElement(by_password);
    ele_password.sendKeys("user");
    
    By by_login=By.id("last");
    WebElement ele_loginbutton=driver.findElement(by_login);
    ele_loginbutton.click();
    
    Thread.sleep(3000);
    driver.close();
	}

}
