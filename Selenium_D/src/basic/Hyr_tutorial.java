package basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyr_tutorial {

	public static void main(String[] args) throws InterruptedException {
		{
		    WebDriver driver = new ChromeDriver ();
		    driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		    driver.manage().window().maximize();
		    //singlewindow
		    
		    String parentwindowhandle=driver.getWindowHandle();
		    System.out.println("parent window handle"+parentwindowhandle+driver.getTitle());
		    //driver.findElement(By.xpath("//button[@onclick=\"newBrowserWindow()\"]")
		    By by_search= By.xpath("//button[@onclick=\"newBrowserWindow()\"]");
		    WebElement ele_search=driver.findElement(by_search);
		    ele_search.click();
		    Set <String> windowhandles=driver.getWindowHandles();
		    for(String windowhandle:windowhandles)
		    {
		    	if(!(parentwindowhandle.equals(windowhandles)))
		    	{
		    		driver.switchTo().window(windowhandle);
		    		System.out.println(windowhandle+driver.getTitle());
		    		driver.close();
		    	}
		    }
		    driver.switchTo().window(parentwindowhandle);
		    driver.findElement(By.xpath("//input[@class=\"whTextBox\"]")).sendKeys("dmg");
		    Thread.sleep(2000);
		    
		   
		   
		    
	}

}
}
