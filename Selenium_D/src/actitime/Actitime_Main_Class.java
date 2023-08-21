package actitime;

import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_Main_Class extends Actitime_Base_Class
{

	public static void main(String[] args) 
	{
      driver = new ChromeDriver();
      driver.get("https://demo.actitime.com/login.do");
      driver.manage().window().maximize();
      
      Actitme_Login_page.username();
      Actitme_Login_page.password();
      Actitme_Login_page.login_Button();
	}

}