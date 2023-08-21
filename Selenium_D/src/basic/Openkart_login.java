package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openkart_login {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.opencart.com/index.php?route=account/login");
    driver.manage().window().maximize();
    By by_login=By.xpath("//a[@class=\"btn btn-link navbar-btn\"]");
    WebElement ele_login=driver.findElement(by_login);
    ele_login.click();
    
    By by_username=By.xpath("//input[@id='input-email']");
    WebElement ele_username=driver.findElement(by_username);
    ele_username.sendKeys("dmg@gmail.com");
    
    By by_password=By.xpath("//input[@fdprocessedid=\"8hrwh\"]");
    WebElement ele_password=driver.findElement(by_password);
    ele_password.sendKeys("999999");
    
    By by_loginbutton=By.xpath("//button[@fdprocessedid=\"gngi0r\"]");
    WebElement ele_loginbutton=driver.findElement(by_loginbutton);
    ele_loginbutton.click();
    
    Thread.sleep(20000);
    driver.close();
	}

}
