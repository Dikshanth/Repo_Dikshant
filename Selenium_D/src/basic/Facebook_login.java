package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
    By by_username = By.xpath("//input[@type=\"text\"]");
    WebElement ele_username=driver.findElement(by_username);
    ele_username.sendKeys("dikshant");
    By by_password = By.xpath("//input[@type=\"password\"]");
    WebElement ele_password=driver.findElement(by_password);
    ele_password.sendKeys("ddddd");
    By by_loginbutton = By.xpath("//button[@type=\"submit\"]");
    WebElement ele_loginbutton=driver.findElement(by_loginbutton);
    ele_loginbutton.click();
    
    Thread.sleep(2000);
    driver.close();
    
	}

}
