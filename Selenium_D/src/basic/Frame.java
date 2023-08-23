package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.get("https://ui.vision/demo/webtest/frames/");
    driver.manage().window().maximize();
    driver.switchTo().frame(0);
    
    By by_frame1 = By.xpath("//input[@name=\"mytext1\"]");
    WebElement ele_frame1=driver.findElement(by_frame1);
    ele_frame1.sendKeys("First frame");
    
    driver.switchTo().defaultContent();
    
    driver.switchTo().frame(1);
    By by_frame2 = By.xpath("//input[@name=\"mytext2\"]");
    WebElement ele_frame2=driver.findElement(by_frame2);
    ele_frame2.sendKeys("second frame");
    
    driver.switchTo().parentFrame();
    driver.switchTo().frame(2);
    By by_frame3 = By.xpath("//input[@name=\"mytext3\"]");
    WebElement ele_frame3=driver.findElement(by_frame3);
    ele_frame3.sendKeys("Third frame");
    
    driver.switchTo().defaultContent();
    driver.switchTo().frame(3);
    By by_frame4 = By.xpath("//input[@name=\"mytext4\"]");
    WebElement ele_frame4=driver.findElement(by_frame4);
    ele_frame4.sendKeys("Fourth frame");
    
    
	}

}
