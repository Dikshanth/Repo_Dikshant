package test;

import page.Login_page;
import page.Logout_page;
import selenium_utility.Basic_operations;

public class Logintest extends Login_page {
	public static void validcrenditional() throws InterruptedException
	{
		Basic_operations.browser();
		Basic_operations.explicity();
		Login_page.user_action("standard_user");
		Thread.sleep(3000);
		Login_page.password_action("secret_sauce");
		Thread.sleep(3000);
		Login_page.Logn_action();
		Thread.sleep(3000);
		Logout_page.action_btn();
	    Logout_page.action_logout();
		drv.quit();
//		Basic_operation.windowhandle();
//		Thread.sleep(4000);
//		facebook.action_email();
	}
	
	public static void invalid_username() throws InterruptedException 
	{
		Basic_operations.browser();
		Basic_operations.explicity();
		Login_page.user_action("standard");
		Thread.sleep(3000);
		Login_page.password_action("secret_sauce");
		Thread.sleep(3000);
		Login_page.Logn_action();
		Thread.sleep(3000);
		//Logout_page.action_btn();
		drv.close();
		
	}
	public static void invalid_password() throws InterruptedException 
	{
		Basic_operations.browser();
		Basic_operations.explicity();
		Login_page.user_action("standard_user");
		Thread.sleep(3000);
		Login_page.password_action("secret");
		Thread.sleep(3000);
		Login_page.Logn_action();
		Thread.sleep(3000);
		//Logout_page.action_btn();
		drv.close();
	}
	public static void empty_unmae_empty_pwd() throws InterruptedException 
	{
		Basic_operations.browser();
		Basic_operations.explicity();
		Login_page.user_action("");
		Thread.sleep(3000);
		Login_page.password_action("");
		Thread.sleep(3000);
		Login_page.Logn_action();
		Thread.sleep(3000);
		//Logout_page.action_btn();
		drv.close();
	}

}
