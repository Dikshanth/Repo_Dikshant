package actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Actitme_Login_page extends Actitime_Base_Class
{
	// X- Path

	static By by_username=By.name("username");
	static By by_password=By.name("pwd");
	static By by_login=By.xpath("//a[@class=\"initial\"]");

	// Web-elements

	static WebElement ele_username = driver.findElement(by_username);
	static WebElement ele_password=driver.findElement(by_password);
	static WebElement ele_loginbutton=driver.findElement(by_login);

	// Actions

	public static void username()
	{
		ele_username.sendKeys("admin");
	}

    public static void password()
    {
    	ele_password.sendKeys("manager");
    }

    public static void login_Button() 
    {
    	ele_loginbutton.click();
    }	
}
