package actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Actii_homepage extends Actitime_Base_Class{
	//x-paths
	static By by_task = By.xpath("//input[@placeholder=\"Add task by name\"]");
	
	//Web-Element
	static WebElement ele_task=driver.findElement(by_task);
	
	//Actions
	public static void username()
	{
		ele_task.sendKeys("calls");
	}
}
