package com.sgtesting.tests.stepdifinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	public static WebDriver oBrowser=null;
	/**
	 * Step Name: I launch the Chrome Borwser
	 */
	@Given("^I launch the Chrome Borwser$")
	public void I_launch_the_Chrome_Borwser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver",".\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * Step Name: I navigate the Application URL
	 */
	@And("^I navigate the Application URL$")
	public void I_navigate_the_Application_URL()
	{
		try
		{
			oBrowser.navigate().to("http://localhost/login.do");
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * Step Name: I find the Login page
	 */
	@And("^I find the Login page$")
	public void I_find_the_Login_page()
	{
		String expected,actual;
		try
		{
			expected="actiTIME - Login";
			actual=oBrowser.getTitle();
			Assert.assertEquals(expected, actual);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * Step Name:I enter the username in username text field
	 */
	@When("^I enter the username in username text field$")
	public void I_enter_the_username_in_username_text_field()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(1000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * Step Name: I enter the password in password text field
	 */
	@And("^I enter the password in password text field$")
	public void I_enter_the_password_in_password_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * Step Name:I click on login button in login page
	 */
	@And("^I click on login button in login page$")
	public void I_click_on_login_button_in_login_page()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * Step Name:I find the home page
	 */
	@Then("^I find the home page$")
	public void I_find_the_home_page()
	{
		try
		{
			WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * Step Name:I click on minimize flyout window
	 */
	@And("^I click on minimize flyout window$")
	public void I_click_on_minimize_flyout_window()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * Step Name: I click on logout link
	 */
	@When("^I click on logout link$")
	public void I_click_on_logout_link()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * Step Name: I close the application
	 */
	@And("^I close the application$")
	public void I_close_the_application()
	{
		try
		{
			oBrowser.quit();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * Step Name: I click on User Image
	 */
	@When("^I click on User Image$")
	public void I_click_on_User_Image()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * Step Name: I click on add user button
	 */
	@And("^I click on add user button$")
	public void I_click_on_add_user_button()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * Step Name: I find the create user page
	 */
	@Then("^I find the create user page$")
	public void I_find_the_create_user_page()
	{
		try
		{
			WebElement oEle=oBrowser.findElement(By.xpath("//span[text()='Add User']"));
			Assert.assertTrue(oEle.isDisplayed());
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * Step Name: I enter the First Name in First Name text field
	 */
	@When("^I enter the First Name in First Name text field$")
	public void I_enter_the_First_Name_in_First_Name_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("firstName")).sendKeys("syed");
			Thread.sleep(1000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * Step Name: I enter the Last Name in Last Name text field
	 */
	@And("^I enter the Last Name in Last Name text field$")
	public void I_enter_the_Last_Name_in_Last_Name_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("lastName")).sendKeys("mohiuddin");
			Thread.sleep(1000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * Step Name: I enter the email in email text field
	 */
	@And("^I enter the email in email text field$")
	public void I_enter_the_email_in_email_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
			Thread.sleep(1000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * Step Name: I enter the User Name in User Name text field
	 */
	@And("^I enter the User Name in User Name text field$")
	public void I_enter_the_User_Name_in_User_Name_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("demoUser1");
			Thread.sleep(1000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * Step Name: I enter the user password in password text field
	 */
	@And("^I enter the user password in password text field$")
	public void I_enter_the_user_password_in_password_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("password")).sendKeys("welcome123");
			Thread.sleep(1000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * Step Name: I enter the user password in retypepassword text field
	 */
	@And("^I enter the user password in retypepassword text field$")
	public void I_enter_the_user_password_in_retypepassword_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome123");
			Thread.sleep(1000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * Step Name: I click on Create User button
	 */
	@And("^I click on Create User button$")
	public void I_click_on_Create_User_button()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}


	/**
	 * Step Name: I find the created user
	 */
	@Then("^I find the created user$")
	public void I_find_the_created_user()
	{
		try
		{
			WebElement oUser=oBrowser.findElement(By.xpath("//span[text()='mohiuddin, syed']"));
			Assert.assertTrue(oUser.isDisplayed());
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * Step Name: I find the created modify user
	 */
	@Then("^I find the created modify user$")
	public void I_find_the_created_modify_user()
	{
		try
		{
			WebElement oUser=oBrowser.findElement(By.xpath("//span[text()='mohiuddin, mohammmed']"));
			Assert.assertTrue(oUser.isDisplayed());
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * Step Name: I click on the existing user
	 */
	@When("^I click on the existing user$")
	public void I_click_on_the_existing_user()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='mohiuddin, syed']")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
		/**
		 * Step Name: I click on the modify existing user
		 */
		@When("^I click on the modify existing user$")
		public void I_click_on_the_modify_existing_user()
		{
			try
			{
				oBrowser.findElement(By.xpath("//span[text()='mohiuddin, mohammmed']")).click();
				Thread.sleep(2000);
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
	}

	/**
	 * Step Name: I click on delete user button
	 */
	@And("^I click on delete user button$")
	public void I_click_on_delete_user_button()
	{
		try
		{
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * Step Name: I click on OK button in Alert window to delete User
	 */
	@And("^I click on OK button in Alert window to delete User$")
	public void I_click_on_OK_button_in_Alert_window_to_delete_User()
	{
		try
		{
			Alert oAlert=oBrowser.switchTo().alert();
			oAlert.accept();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/*
	 * Step Name:I clear the firstname in firstname text field
	 * 
	 */
	@And("^I clear the firstname in firstname text field$")
	public void I_clear_the_firstname_in_firstname_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("firstName")).clear();
			Thread.sleep(1000);	
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/*
	 * Step Name:I enter the firstname in firstname text field
	 * 
	 */
	@And("^I enter the firstname in firstname text field$")
	public void I_enter_the_firstname_in_firstname_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("firstName")).sendKeys("mohammmed");
			Thread.sleep(4000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/*
	 * Step Name:I click on Save User button
	 * 
	 */
	@And("^I click on Save User button$")
	public void I_click_on_Save_User_button()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(3000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * Step Name: I click on Tasks Image
	 */
	@When("^I click on Tasks Image$")
	public void I_click_on_Tasks_Image()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a/div[2]")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * Step Name:I find Customer and Project Page
	 */
	@Then("^I find Customer and Project Page$")
	public void  I_find_Customer_and_Project_Page()
	{
		try
		{
			WebElement oUser=oBrowser.findElement(By.xpath("//div[text()='Customers & Projects']"));
			Assert.assertTrue(oUser.isDisplayed());
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * Step Name: I click on Add New Customer
	 */
	@When("^I click on Add New Customer$")
	public void I_click_on_Add_New_Customer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
		    Thread.sleep(3000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * Step Name: I click on New Customer
	 */
	@When("^I click on New Customer$")
	public void I_click_on_New_Customer()
	{
		try
		{
			   oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			    Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	/*
	 * Step Name:I enter the customername in customername text field
	 * 
	 */
	@And("^I enter the customername in customername text field$")
	public void I_enter_the_customername_in_customername_text_field()
	{
		try
		{
			 oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("tafe");
			Thread.sleep(1000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/*
	 * Step Name:I enter the description in Description text field
	 * 
	 */
	@And("^I enter the description in Description text field$")
	public void I_enter_the_description_in_Description_text_field()
	{
		try
		{
			oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("manufacturing tafe engineconponent");
		    Thread.sleep(1000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * Step Name: I click on createcustomer
	 */
	@When("^I click on createcustomer$")
	public void I_click_on_createcustomer()
	{
		try
		{
			 oBrowser.findElement(By.xpath("//*[@id=\"customerLightBox_commitBtn\"]/div/span")).click();
			    Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * Step Name: I find the created customer
	 */
	@When("^I find the created customer$")
	public void I_find_the_created_customer()
	{
		try
		{
			WebElement oUser=oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]"));
			Assert.assertTrue(oUser.isDisplayed());
			    Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Step Name: I click on created customer
	 */
	@When("^I click on created customer$")
	public void I_click_on_created_customer()
	{
		try
		{
			 oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]")).click();
			    Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * Step Name: I click on customer setting button
	 */
	@When("^I click on customer setting button$")
	public void I_click_on_customer_setting_button()
	{
		try
		{
			 oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
    		 Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * Step Name: I click on Action operation
	 */
	@When("^I click on Action operation$")
	public void I_click_on_Action_operation()
	{
		try
		{
			 oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div")).click();
	 		    Thread.sleep(4000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * Step Name: I click on delete button 
	 */
	@When("^I click on delete button$")
	public void I_click_on_delete_button()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")).click();
 		    Thread.sleep(4000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * Step Name: I click on delete permanently button
	 */
	@When("^I click on delete permanently button$")
	public void I_click_on_delete_permanently_button()
	{
		try
		{
			 oBrowser.findElement(By.xpath("//*[@id='customerPanel_deleteConfirm_submitTitle']")).click();
	           Thread.sleep(3000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * Step Name: I click on Archive botton
	 */
	@When("^I click on Archive botton$")
	public void I_click_on_Archive_botton()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/div/div[1]")).click();
 		    Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * Step Name: I click on modify Archived button
	 */
	@When("^I click on modify Archived button$")
	public void I_click_on_modify_Archived_button()
	{
		try
		{
			oBrowser.findElement(By.xpath("/html/body/div[23]/div[2]/div")).click();
 		    Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * Step Name: I click on close button 
	 */
	@When("^I click on close button$")
	public void I_click_on_close_button()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[1]")).click();
 		    Thread.sleep(3000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Step Name: I click on closeProject button 
	 */
	@When("^I click on closeProject button$")
	public void I_click_on_closeProject_button()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[1]/div[1]")).click();
 		    Thread.sleep(3000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * Step Name: I click on New Project
	 */
	@When("^I click on New Project$")
	public void I_click_on_New_Project()
	{
		try
		{
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
 		    Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * Step Name: I enter the projectname in projectname text field
	 */
	@When("^I enter the projectname in projectname text field$")
	public void  I_enter_the_projectname_in_projectname_text_field()
	{
		try
		{
			oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("selenium");
 			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * Step Name: I click on createproject
	 */
	@When("^I click on createproject$")
	public void I_click_on_createproject()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='Create Project']")).click();
 			Thread.sleep(3000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	
	/**
	 * Step Name: I click on createdproject
	 */
	@When("^I click on createdproject$")
	public void I_click_on_createdproject()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[2]")).click();
 			Thread.sleep(3000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * Step Name: I find the created project
	 */
	@When("^I find the created project$")
	public void I_find_the_created_project()
	{
		try
		{
			WebElement oUser=oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[2]"));
			Assert.assertTrue(oUser.isDisplayed());
			    Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * Step Name:  I click on Project setting button
	 */
	@When("^I click on Project setting button$")
	public void  I_click_on_Project_setting_button()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(3000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * Step Name: I click on ProjectArchive botton
	 */
	@When("^I click on ProjectArchive botton$")
	public void  I_click_on_ProjectArchive_botton()
	{
		try
		{
			 oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[3]/div/div[1]")).click();
	 		    Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * Step Name: I click on modify ProjectArchived button
	 */
	@When("^I click on modify ProjectArchived button$")
	public void I_click_on_modify_ProjectArchived_button()
	{
		try
		{
			 oBrowser.findElement(By.xpath("//div[text()='Archived']")).click();
	 		    Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * Step Name:  I click on Add Task
	 */
	@When("^I click on Add Task$")
	public void  I_click_on_Add_Task()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[1]/div[1]/div[3]/div/div[2]")).click();
 			Thread.sleep(3000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Step Name:I click on Create New Task
	 */
	@When("^I click on Create New Task$")
	public void  I_click_on_Create_New_Task()
	{
		try
		{
			oBrowser.findElement(By.xpath("/html/body/div[13]/div[1]")).click();
 			Thread.sleep(3000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Step Name:I enter taskname in taskname text field
	 */
	@When("^I enter taskname in taskname text field$")
	public void  I_enter_taskname_in_taskname_text_field()
	{
		try
		{
			 oBrowser.findElement(By.xpath("//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[1]/input")).sendKeys("complete assignment");
				Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * Step Name: I click on CreateTask
	 */
	@When("^I click on CreateTask$")
	public void   I_click_on_CreateTask()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='createTasksPopup_commitBtn']/div/span")).click();
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * Step Name: I click on CreatedTask
	 */
	@When("^I click on CreatedTask$")
	public void   I_click_on_CreatedTask()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div/div[2]")).click();
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * Step Name:I click on ActionTask operation
	 */
	@When("^I click on ActionTask operation$")
	public void  I_click_on_ActionTask_operation()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
 			Thread.sleep(4000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * Step Name:I click on deleteTask button 
	 */
	@When("^I click on deleteTask button$")
	public void  I_click_on_deleteTask_button()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[3]/div[4]/div/div[3]/div")).click();
 			Thread.sleep(4000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * Step Name:I click on deleteTask permanently button 
	 */
	@When("^I click on deleteTask permanently button$")
	public void  I_click_on_deleteTask_permanently_button()
	{
		try
		{
			oBrowser.findElement(By.id("taskPanel_deleteConfirm_submitBtn")).click();
 			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * Step Name: I click on ProjectAction operation
	 */
	@When("^I click on ProjectAction operation$")
	public void   I_click_on_ProjectAction_operation()
	{
		try
		{
			 oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
	 		    Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Step Name:I click on Projectdelete button 
	 */
	@When("^I click on Projectdelete button$")
	public void   I_click_on_Projectdelete_button()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]/div")).click();
 		    Thread.sleep(3000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Step Name:I click on Projectdelete permanently button 
	 */
	@When("^I click on Projectdelete permanently button$")
	public void   I_click_on_Projectdelete_permanently_button()
	{
		try
		{
			 oBrowser.findElement(By.xpath("//*[@id='projectPanel_deleteConfirm_submitTitle']")).click();
	            Thread.sleep(6000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
