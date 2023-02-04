package mainClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass.Base;

public class Main extends Base {
	
	@Test(groups = "first",priority = 1)
	public void testCase1() throws Exception {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//input[@name='username']"))));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
//		validating search box is there
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//input[@placeholder='Search']"))));

		 WebElement element = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		 
		 presentOrNot(element,"Search");
		 
		 
		 //Try to put this components in a method 
		
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Admin");
		
		  element =   driver.findElement(By.xpath("//*[text()='Admin']"));
		 
		 presentOrNot(element,"Admin");
		 
		 
		 driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("PIM");
		 
 element =   driver.findElement(By.xpath("//*[text()='PIM']"));
		 
		 presentOrNot(element,"PIM");
		 
		 
		 driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Leave");
		 
		 element =   driver.findElement(By.xpath("//*[text()='Leave']"));
				 
				 presentOrNot(element,"Leave");
				 
				
				 driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Time");
				 
				 element =   driver.findElement(By.xpath("//*[text()='Time']"));
						 
						 presentOrNot(element,"Time");
						 
			
			 driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Recruitment");
						 
				 element =   driver.findElement(By.xpath("//*[text()='Recruitment']"));
								 
					 presentOrNot(element,"Recruitment");
							
								 
								 
		 driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("My Info");
								 
			 element =   driver.findElement(By.xpath("//*[text()='My Info']"));
										 
				 presentOrNot(element,"My Info");	
										 
										 
				 driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Performance");
										 
				 element =   driver.findElement(By.xpath("//*[text()='Performance']"));
												 
					 presentOrNot(element,"Performance");	
												 
												
					 driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Dashboard");
												 
					 element =   driver.findElement(By.xpath("//*[text()='Dashboard']"));
														 
						 presentOrNot(element,"Dashboard");						 
												 
														 
		 driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Directory");
														 
			 element =   driver.findElement(By.xpath("//*[text()='Directory']"));
																 
					 presentOrNot(element,"Directory");	
													
																 
																 
		 driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Maintenance");
																 
					 element =   driver.findElement(By.xpath("//*[text()='Maintenance']"));
																	 
					 presentOrNot(element,"Maintenance");	
																		 
																		 
																		 
					 driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Buzz");
																		 
					 element =   driver.findElement(By.xpath("//*[text()='Buzz']"));
					 
					 
					 presentOrNot(element,"Buzz");	
															 
								 
																				 
																				 
				 
	}
	public void  presentOrNot(WebElement element, String name) throws InterruptedException {
//		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//input[@placeholder='Search']"))));
		if(element.isDisplayed()) {
			System.out.println(name +" is present");
		}else System.out.println(name+"is not present");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(Keys.CONTROL +"a" +Keys.DELETE);
	}
	
//	public void componentsToSearch(String component) throws InterruptedException {
//		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(component);
//		
//	WebElement	  element =   driver.findElement(By.xpath("//*[text()='component']"));
//		 
//		 presentOrNot(element,"Admin");
//	}
	@Test(groups = "smoke",priority = 2)
	public void testCase2() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//input[@name='username']"))));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//input[@placeholder='Search']"))));
		
		driver.findElement(By.xpath("//*[text()='Admin']")).click();
		
//		driver.findElement(By.xpath("//span[text()='User Management']")).click();
//		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='oxd-topbar-body-nav-tab --parent --visited']")));
		
		driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav-tab --parent --visited']")).click();
		
		driver.findElement(By.xpath("//a[text()='Users']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']")));
		
		driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']")).click();
		
//		driver.findElement(By.xpath("//label[text()='User Role']//following::div")).click();
		
		
		 WebElement element2 = driver.findElement(By.xpath("//*[text()='Admin']"));
		 
		 presentOrNot(element2, "Admin");
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']")).click();
		 
	  element2 = driver.findElement(By.xpath("//*[text()='ESS']"));
		 
		 presentOrNot(element2, "ESS");
		 
		 
		 driver.findElement(By.xpath("//*[text()='Status']//following::div//*[@class='oxd-select-text oxd-select-text--active']")).click();
		 
element2 = driver.findElement(By.xpath("//*[text()='Enabled']"));
		 
		 presentOrNot(element2, "Enabled");
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//*[text()='Status']//following::div//*[@class='oxd-select-text oxd-select-text--active']")).click();
		 
		 element2 = driver.findElement(By.xpath("//*[text()='Disabled']"));
		 		 
		 		 presentOrNot(element2, "Disabled");
		 
		 
	}
	
	@Test(priority = 3)
	public void testCase3() {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//input[@name='username']"))));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//input[@placeholder='Search']"))));
		
		driver.findElement(By.xpath("//*[text()='PIM']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")));

	    driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
	    
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='oxd-text oxd-text--h6 orangehrm-main-title']")));
	    
	    driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("testFirst");
	    
	    driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("testMiddle");
	
	    driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("testLast");
	    
	    driver.findElement(By.xpath("//*[@class='oxd-switch-input oxd-switch-input--active --label-right']")).click();
	    
	    driver.findElement(By.xpath("//*[text()='Username']//following::div//input[@class='oxd-input oxd-input--active']")).sendKeys("testUserName");
	    
	    
//	    if(driver.findElement(By.xpath("//input[@type='radio']")).isEnabled()) {
//	    	System.out.println("button is enabled");
//	    }else {
//	    	System.out.println("button is not enabled");
//	    }
//	    
//	    driver.findElement(By.xpath("//input[@type='radio']")).click();
	    
	    driver.findElement(By.xpath("//*[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input']")).click();
	    
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Password@1234");
	    
	    driver.findElement(By.xpath("//*[text()='Confirm Password']//following::div//input[@type='password']")).sendKeys("Password@1234");
	    
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test(priority = 4)
	public void testCase4() throws InterruptedException {
WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//input[@name='username']"))));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//input[@placeholder='Search']"))));
		
		driver.findElement(By.xpath("//*[text()='PIM']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']//input")));
		
		driver.findElement(By.xpath("//*[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']//input")).sendKeys("testFirst testMiddle testLast");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][9]//div[@class='oxd-table-cell-actions']//button[@type='button'][2]")));
		
		driver.findElement(By.xpath("//*[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][9]//div[@class='oxd-table-cell-actions']//button[@type='button'][2]")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='orangehrm-tabs']//div[@class='orangehrm-tabs-wrapper']//*[text()='Personal Details']")));
		
		WebElement element2 =    driver.findElement(By.xpath("//div[@class='orangehrm-tabs']//div[@class='orangehrm-tabs-wrapper']//*[text()='Personal Details']"));
	
	    presentOrNot(element2, "Personal Details");
	    
	    element2 = driver.findElement(By.xpath("//div[@class='orangehrm-tabs']//div[@class='orangehrm-tabs-wrapper'][2]//*[text()='Contact Details']"));
	    
	    presentOrNot(element2, "Contact Details");
	    
	    
	   element2 =  driver.findElement(By.xpath("//div[@class='orangehrm-tabs']//div[@class='orangehrm-tabs-wrapper'][3]//*[text()='Emergency Contacts']"));
	
       presentOrNot(element2, "Emergency contact");
       
       element2 = driver.findElement(By.xpath("//div[@class='orangehrm-tabs']//div[@class='orangehrm-tabs-wrapper'][4]//*[text()='Dependents']"));
       
       presentOrNot(element2, "Dependents");
       
       
       element2 = driver.findElement(By.xpath("//div[@class='orangehrm-tabs']//div[@class='orangehrm-tabs-wrapper'][5]//*[text()='Immigration']"));
       
       presentOrNot(element2, "Immigration");
       
       element2 = driver.findElement(By.xpath("//div[@class='orangehrm-tabs']//div[@class='orangehrm-tabs-wrapper'][6]//*[text()='Job']"));
       
       presentOrNot(element2, "Job");
       
       
       element2 = driver.findElement(By.xpath("//div[@class='orangehrm-tabs']//div[@class='orangehrm-tabs-wrapper'][7]//*[text()='Salary']"));
       presentOrNot(element2, "Salary");
       
       element2 = driver.findElement(By.xpath("//div[@class='orangehrm-tabs']//div[@class='orangehrm-tabs-wrapper'][8]//*[text()='Tax Exemptions']"));
       presentOrNot(element2, "Tax Exemptions");
       
       element2 = driver.findElement(By.xpath("//div[@class='orangehrm-tabs']//div[@class='orangehrm-tabs-wrapper'][9]//*[text()='Report-to']"));
       presentOrNot(element2, "Report To");
       
       element2 = driver.findElement(By.xpath("//div[@class='orangehrm-tabs']//div[@class='orangehrm-tabs-wrapper'][10]//*[text()='Qualifications']"));
       presentOrNot(element2, "Qualifications");
       
       element2 = driver.findElement(By.xpath("//div[@class='orangehrm-tabs']//div[@class='orangehrm-tabs-wrapper'][11]//*[text()='Memberships']"));
       presentOrNot(element2, "Memberships");
	}
	
	@Test(priority = 5)
	public void testCase5() throws InterruptedException {

	WebDriverWait wait = new WebDriverWait(driver, 20);
			
			wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//input[@name='username']"))));
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//input[@placeholder='Search']"))));
			
			driver.findElement(By.xpath("//*[text()='PIM']")).click();
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']//input")));
			
			driver.findElement(By.xpath("//*[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']//input")).sendKeys("testFirst testMiddle testLast");
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][3]")));
		
		 wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][3]"), "testFirst testMiddle"));
		
		String text1 =    driver.findElement(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][3]")).getText();
	
	    String text2 = driver.findElement(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][4]")).getText();
		  
		  if(text1.equals("testFirst testMiddle") && text2.equals("testLast")) {
			  System.out.println("match found executing next steps");
			  
			  driver.findElement(By.xpath("//*[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][9]//div[@class='oxd-table-cell-actions']//button[@type='button'][2]")).click();
				
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='orangehrm-tabs']//div[@class='orangehrm-tabs-wrapper']//*[text()='Personal Details']")));
				
				
			
				
				driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active'][1]")).click();
				
				driver.findElement(By.xpath("//*[@class='oxd-select-wrapper']//*[text()='Indian']")).click();
				
				
				
				
				driver.findElement(By.xpath("//*[text()='Nickname']//following::div//input")).sendKeys("testNickName");
				
				driver.findElement(By.xpath("//*[text()='Marital Status']//following::div")).click();
				
				driver.findElement(By.xpath("//*[text()='Single']")).click();
				
				
				driver.findElement(By.xpath("//*[text()='Date of Birth']//following::input")).sendKeys("2023-02-01");
				
				driver.findElement(By.xpath("//div[@class='oxd-radio-wrapper']//*[text()='Male']")).click();
				
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//label[text()='Blood Type']//following::div")).click();
				
				driver.findElement(By.xpath("//label[text()='Blood Type']//following::div//*[text()='O+']")).click();
				
				driver.findElement(By.xpath("//div[@class='oxd-form-actions']//button")).click();
				
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Nickname']//following::div//input")));
				
//	Validating the entered details after save
				
				//nickname
				String		str = driver.findElement(By.xpath("//*[text()='Nickname']//following::div//input")).getAttribute("value");
				System.out.println(str +" found");
				Thread.sleep(2000);
				
				//nationality
				 str = driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active'][1]")).getText();
				
				System.out.println(str +" found");
				
				
				
				
				Thread.sleep(2000);
				//marital status
				str = driver.findElement(By.xpath("//*[text()='Marital Status']//following::div")).getText();
				System.out.println(str +" found");
				
				Thread.sleep(2000);
				//Date of birth
				str= 	driver.findElement(By.xpath("//*[text()='Date of Birth']//following::input")).getAttribute("value");
				System.out.println(str +" found");
				
				Thread.sleep(2000);
				//gender
				if(driver.findElement(By.xpath("//div[@class='oxd-radio-wrapper']//input")).isSelected()) {
					System.out.println("Male is selected");
				}else {
					System.out.println("Male is not selected");
				}
				Thread.sleep(2000);
				//blood type
				str= driver.findElement(By.xpath("//label[text()='Blood Type']//following::div")).getText();
				System.out.println(str +" found");
		  }else {
			  System.out.println("match not found ");
		  }
	
	}
	
	@Test(priority = 6)
	public void testCase6() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//input[@name='username']"))));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//input[@placeholder='Search']"))));
		
		driver.findElement(By.xpath("//*[text()='PIM']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']//input")));
		
		driver.findElement(By.xpath("//*[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']//input")).sendKeys("testFirst testMiddle testLast");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
//	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][3]")));
	
	wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][3]"), "testFirst testMiddle"));
	
	
	  String text1 =    driver.findElement(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][3]")).getText();

    String text2 = driver.findElement(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][4]")).getText();
	  
	  if(text1.equals("testFirst testMiddle") && text2.equals("testLast")) {
		  System.out.println("match found executing next steps");
		  
		  driver.findElement(By.xpath("//*[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][9]//div[@class='oxd-table-cell-actions']//button[@type='button'][2]")).click();
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='orangehrm-tabs']//div[@class='orangehrm-tabs-wrapper']//*[text()='Personal Details']")));
			
			driver.findElement(By.xpath("//div[@class='orangehrm-edit-employee-navigation']//div[@class='orangehrm-tabs-wrapper'][2]")).click();
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[text()='Street 1']")));
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//label[text()='Street 1']//following::input")).sendKeys("first street");
			
			driver.findElement(By.xpath("//label[text()='Street 2']//following::input")).sendKeys("second main lane");
			
			driver.findElement(By.xpath("//label[text()='City']//following::input")).sendKeys("Chennai");
			
			driver.findElement(By.xpath("//label[text()='State/Province']//following::input")).sendKeys("TamilNadu");
			
			driver.findElement(By.xpath("//label[text()='Zip/Postal Code']//following::input")).sendKeys("600001");
			
			driver.findElement(By.xpath("//label[text()='Country']//following::div")).click();
			
			driver.findElement(By.xpath("//label[text()='Country']//following::div//*[text()='India']")).click();
			
			
			driver.findElement(By.xpath("//label[text()='Home']//following::input")).sendKeys("9999999999");
			
			driver.findElement(By.xpath("//label[text()='Mobile']//following::input")).sendKeys("8888888888");
			
			driver.findElement(By.xpath("//label[text()='Work']//following::input")).sendKeys("7777777777");
			
			driver.findElement(By.xpath("//label[text()='Work Email']//following::input")).sendKeys("work@gmail.com");
			
			driver.findElement(By.xpath("//label[text()='Other Email']//following::input")).sendKeys("other@gmail.com");
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[text()='Street 1']")));
			
//			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//*[text()='Contact Details']")));
			
			  String validate = driver.findElement(By.xpath("//label[text()='Street 1']//following::input")).getAttribute("value");
				System.out.println(validate + "print");
				
				validate = driver.findElement(By.xpath("//label[text()='Street 2']//following::input")).getAttribute("value");
				System.out.println(validate + "print");
				
				
			//Validating details 
			//first street
			
			Assert.assertEquals(driver.findElement(By.xpath("//label[text()='Street 1']//following::input")).getAttribute("value"),"first street");
	
			//second street
			Assert.assertEquals(driver.findElement(By.xpath("//label[text()='Street 2']//following::input")).getAttribute("value"), "second main lane");
			
			
			//city
			Assert.assertEquals(driver.findElement(By.xpath("//label[text()='City']//following::input")).getAttribute("value"),"Chennai");
			
			//state
			Assert.assertEquals(driver.findElement(By.xpath("//label[text()='State/Province']//following::input")).getAttribute("value"),"TamilNadu");
			
			
			//pincode
			
			Assert.assertEquals(driver.findElement(By.xpath("//label[text()='Zip/Postal Code']//following::input")).getAttribute("value"),"600001");
			
			//country
			Assert.assertEquals(driver.findElement(By.xpath("//label[text()='Country']//following::div")).getText(),"India");
			
			//home number
			Assert.assertEquals(driver.findElement(By.xpath("//label[text()='Home']//following::input")).getAttribute("value"),"9999999999");
			
			//mobile number
			Assert.assertEquals(driver.findElement(By.xpath("//label[text()='Mobile']//following::input")).getAttribute("value"),"8888888888");
			
			
			//work number
			Assert.assertEquals(driver.findElement(By.xpath("//label[text()='Work']//following::input")).getAttribute("value"),"7777777777");
			
			//work mail
			Assert.assertEquals(driver.findElement(By.xpath("//label[text()='Work Email']//following::input")).getAttribute("value"),"work@gmail.com");
			
			//other mail
			Assert.assertEquals(driver.findElement(By.xpath("//label[text()='Other Email']//following::input")).getAttribute("value"),"other@gmail.com");
			
			
			
	}else {
		System.out.println("match not found in results");
	}
}
	
	@Test(priority = 7)
	public void testCase7() throws InterruptedException {
WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//input[@name='username']"))));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//input[@placeholder='Search']"))));
		
		driver.findElement(By.xpath("//*[text()='PIM']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']//input")));
		
		driver.findElement(By.xpath("//*[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']//input")).sendKeys("testFirst testMiddle testLast");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
//	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][3]")));
	
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][3]"), "testFirst testMiddle"));
	
	  String text1 =    driver.findElement(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][3]")).getText();

    String text2 = driver.findElement(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][4]")).getText();
	  
	  if(text1.equals("testFirst testMiddle") && text2.equals("testLast")) {
		  System.out.println("match found executing next steps");
		  
		  driver.findElement(By.xpath("//*[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][9]//div[@class='oxd-table-cell-actions']//button[@type='button'][2]")).click();
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='orangehrm-tabs']//div[@class='orangehrm-tabs-wrapper']//*[text()='Personal Details']")));
		
			driver.findElement(By.xpath("//div[@class='orangehrm-edit-employee-navigation']//div[@class='orangehrm-tabs-wrapper'][3]")).click();
			
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='orangehrm-action-header']//*[text()='Assigned Emergency Contacts']")));
		  
		  driver.findElement(By.xpath("//div[@class='orangehrm-action-header']//button")).click();
		  
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//h6[text()='Save Emergency Contact']")));
		  
		  driver.findElement(By.xpath("//label[text()='Name']//following::input")).sendKeys("Tom Cruise");
		  
		  driver.findElement(By.xpath("//label[text()='Relationship']//following::input")).sendKeys("Friend");
		  
		  driver.findElement(By.xpath("//label[text()='Mobile']//following::input")).sendKeys("6666666666");
		  
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='orangehrm-action-header']//*[text()='Assigned Emergency Contacts']")));
		  
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='oxd-table']//div[@class='oxd-table-body']//div[@class='oxd-table-row oxd-table-row--with-border']//div[@class='oxd-table-cell oxd-padding-cell'][2]")));
		  
		 Thread.sleep(3000);
		 
//		  if(driver.findElement(By.xpath("//div[@class='oxd-table']//div[@class='oxd-table-body']//div[@class='oxd-table-row oxd-table-row--with-border']//div[@class='oxd-table-cell oxd-padding-cell'][2]")).getAttribute("value").equals("Tom Cruise")) {
			
			  String text = driver.findElement(By.xpath("//div[@class='oxd-table']//div[@class='oxd-table-body']//div[@class='oxd-table-row oxd-table-row--with-border']//div[@class='oxd-table-cell oxd-padding-cell'][2]")).getText();
			  
			  if(text.equalsIgnoreCase("Tom Cruise")) {
			  
			  driver.findElement(By.xpath("//div[@class='oxd-table']//div[@class='oxd-table-body']//div[@class='oxd-table-row oxd-table-row--with-border']//div[@class='oxd-table-cell oxd-padding-cell'][7]//button[2]")).click();
			  
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h6[text()='Edit Emergency Contact']")));
			
			//validation
			Thread.sleep(3000);
			//name
			Assert.assertEquals( driver.findElement(By.xpath("//label[text()='Name']//following::input")).getAttribute("value"),"Tom Cruise" );
			System.out.println(driver.findElement(By.xpath("//label[text()='Name']//following::input")).getAttribute("value"));
			
			
			//relationship
			Assert.assertEquals(driver.findElement(By.xpath("//label[text()='Relationship']//following::input")).getAttribute("value"),"Friend");
			System.out.println(driver.findElement(By.xpath("//label[text()='Relationship']//following::input")).getAttribute("value"));
			
			//number
			Assert.assertEquals(driver.findElement(By.xpath("//label[text()='Mobile']//following::input")).getAttribute("value"),"6666666666");
			
			System.out.println(driver.findElement(By.xpath("//label[text()='Mobile']//following::input")).getAttribute("value"));
			
		  }else {
			  System.out.println("contact not found");
		  }
		  
		  
		  
	  }else {
		  System.out.println("match not found");
	  }
	}
	
	@Test(priority = 8)
	public void testCase8() throws InterruptedException {

WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//input[@name='username']"))));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//input[@placeholder='Search']"))));
		
		driver.findElement(By.xpath("//*[text()='PIM']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']//input")));
		
		driver.findElement(By.xpath("//*[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']//input")).sendKeys("testFirst testMiddle testLast");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
//	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][3]")));
	
	wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][3]"), "testFirst testMiddle"));
	
	
	  String text1 =    driver.findElement(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][3]")).getText();

    String text2 = driver.findElement(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][4]")).getText();
	  
	  if(text1.equals("testFirst testMiddle") && text2.equals("testLast")) {
		  System.out.println("match found executing next steps");
		  
		  driver.findElement(By.xpath("//*[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][9]//div[@class='oxd-table-cell-actions']//button[@type='button'][2]")).click();
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='orangehrm-tabs']//div[@class='orangehrm-tabs-wrapper']//*[text()='Personal Details']")));
	  

			driver.findElement(By.xpath("//div[@class='orangehrm-edit-employee-navigation']//div[@class='orangehrm-tabs-wrapper'][4]")).click();
		
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h6[text()='Assigned Dependents']")));
	  
	  driver.findElement(By.xpath("//h6[text()='Assigned Dependents']//following::button")).click();
	  
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[text()='Name']//following::input")));
	  
	  driver.findElement(By.xpath("//label[text()='Name']//following::input")).sendKeys("Will Smith");
	  
	  driver.findElement(By.xpath("//label[text()='Relationship']//following::div")).click();
	  
	  driver.findElement(By.xpath("//label[text()='Relationship']//following::div//*[text()='Other']")).click();
	  
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[text()='Please Specify']//following::input")));
	  
	  driver.findElement(By.xpath("//label[text()='Please Specify']//following::input")).sendKeys("Friend");
	  
	  driver.findElement(By.xpath("//label[text()='Date of Birth']//following::input")).sendKeys("2023-02-02");
	  
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
//	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='oxd-table-body']//div[@class='oxd-table-cell oxd-padding-cell'][2]")));
	  
	  wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@class='oxd-table-body']//div[@class='oxd-table-cell oxd-padding-cell'][2]"), "Will Smith"));
	  
	  driver.findElement(By.xpath("//div[@class='oxd-table-body']//div[@class='oxd-table-cell oxd-padding-cell'][5]//button[2]")).click();
	  
	  Thread.sleep(3000);
	  
//	  wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//label[text()='Name']//following::input"), "Will Smith"));
	  wait.until(ExpectedConditions.textToBePresentInElementValue(By.xpath("//label[text()='Name']//following::input"), "Will Smith"));
	  
	 
	  
	  //validating
	  //name
	  Assert.assertEquals(driver.findElement(By.xpath("//label[text()='Name']//following::input")).getAttribute("value"),"Will Smith" );
	  System.out.println(driver.findElement(By.xpath("//label[text()='Name']//following::input")).getAttribute("value"));
	  
	  //relationship
	  Assert.assertEquals( driver.findElement(By.xpath("//label[text()='Relationship']//following::div")).getText(),"Other");
	  System.out.println( driver.findElement(By.xpath("//label[text()='Relationship']//following::div")).getText());
	  
	  //specify
	  Assert.assertEquals( driver.findElement(By.xpath("//label[text()='Please Specify']//following::input")).getAttribute("value"),"Friend");
	  System.out.println( driver.findElement(By.xpath("//label[text()='Please Specify']//following::input")).getAttribute("value"));
	  Thread.sleep(3000);
	  //date of birth
	  Assert.assertEquals( driver.findElement(By.xpath("//label[text()='Date of Birth']//following::input")).getAttribute("value"),"2023-02-02");
	  System.out.println( driver.findElement(By.xpath("//label[text()='Date of Birth']//following::input")).getAttribute("value"));
	  
	  
	  
	  
	  }
	}
	@Test(priority = 9)
	public void testCase9() throws InterruptedException {


WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//input[@name='username']"))));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//input[@placeholder='Search']"))));
		
		driver.findElement(By.xpath("//*[text()='PIM']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']//input")));
		
		driver.findElement(By.xpath("//*[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']//input")).sendKeys("testFirst testMiddle testLast");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
//	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][3]")));
	
	wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][3]"), "testFirst testMiddle"));
	
	
	  String text1 =    driver.findElement(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][3]")).getText();

    String text2 = driver.findElement(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][4]")).getText();
	  
	  if(text1.equals("testFirst testMiddle") && text2.equals("testLast")) {
		  System.out.println("match found executing next steps");
		  
		  driver.findElement(By.xpath("//*[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][9]//div[@class='oxd-table-cell-actions']//button[@type='button'][2]")).click();
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='orangehrm-tabs']//div[@class='orangehrm-tabs-wrapper']//*[text()='Personal Details']")));
	  
			driver.findElement(By.xpath("//div[@class='orangehrm-edit-employee-navigation']//div[@class='orangehrm-tabs-wrapper'][6]")).click();
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[text()='Joined Date']//following::div")));
			
//			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//label[text()='Joined Date']//following::input")).sendKeys("2023-02-02");
			
			driver.findElement(By.xpath("//label[text()='Job Title']//following::div")).click();
			
			   driver.findElement(By.xpath("//label[text()='Job Title']//following::div//*[text()='QA Engineer']")).click();
			   
			   
			   driver.findElement(By.xpath("//label[text()='Job Category']//following::div")).click();
			   
			   driver.findElement(By.xpath("//label[text()='Job Category']//following::div//*[text()='Professionals']")).click();
			   
			   
			   driver.findElement(By.xpath("//label[text()='Sub Unit']//following::div")).click();
			   
			   driver.findElement(By.xpath("//label[text()='Sub Unit']//following::div//*[text()='Quality Assurance']")).click();
			   
			   driver.findElement(By.xpath("//label[text()='Location']//following::div")).click();
			   
			   driver.findElement(By.xpath("//label[text()='Location']//following::div//*[text()='New York Sales Office']")).click();
			   
			   
			   driver.findElement(By.xpath("//label[text()='Employment Status']//following::div")).click();
			   
			   driver.findElement(By.xpath("//label[text()='Employment Status']//following::div//*[text()='Full-Time Contract']")).click();
			   
			   
			   driver.findElement(By.xpath("//*[text()='Include Employment Contract Details']//following::div")).click();
			   
			   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[text()='Contract Start Date']//following::input")));
			   
			   driver.findElement(By.xpath("//label[text()='Contract Start Date']//following::input")).sendKeys("2023-02-02");
			   
			   driver.findElement(By.xpath("//label[text()='Contract End Date']//following::input")).sendKeys("2025-02-02");
			   
			   driver.findElement(By.xpath("//button[@type='submit']")).click();
			   
			   
			   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[text()='Joined Date']//following::div")));
			   
			   //validating
			   
			   //joined date
			   Assert.assertEquals(driver.findElement(By.xpath("//label[text()='Joined Date']//following::input")).getAttribute("value"),"2023-02-02" );
			   System.out.println(driver.findElement(By.xpath("//label[text()='Joined Date']//following::input")).getAttribute("value"));
			
			
			   //job title
			   Assert.assertEquals( driver.findElement(By.xpath("//label[text()='Job Title']//following::div//*[text()='QA Engineer']")).getText(),"QA Engineer");
			   System.out.println(driver.findElement(By.xpath("//label[text()='Job Title']//following::div//*[text()='QA Engineer']")).getText());
			
			   //job category
			   Assert.assertEquals( driver.findElement(By.xpath("//label[text()='Job Category']//following::div//*[text()='Professionals']")).getText(),"Professionals");
			   System.out.println(driver.findElement(By.xpath("//label[text()='Job Category']//following::div//*[text()='Professionals']")).getText());
			   
			   //sub unit
			   Assert.assertEquals(driver.findElement(By.xpath("//label[text()='Sub Unit']//following::div//*[text()='Quality Assurance']")).getText(),"Quality Assurance");
	            System.out.println(driver.findElement(By.xpath("//label[text()='Sub Unit']//following::div//*[text()='Quality Assurance']")).getText());
	            
	            //location
	            Assert.assertEquals( driver.findElement(By.xpath("//label[text()='Location']//following::div//*[text()='New York Sales Office']")).getText(),"New York Sales Office");
	            System.out.println(driver.findElement(By.xpath("//label[text()='Location']//following::div//*[text()='New York Sales Office']")).getText());
	       
	             //Employment Status
	            Assert.assertEquals( driver.findElement(By.xpath("//label[text()='Employment Status']//following::div//*[text()='Full-Time Contract']")).getText(),"Full-Time Contract");
	            System.out.println(driver.findElement(By.xpath("//label[text()='Employment Status']//following::div//*[text()='Full-Time Contract']")).getText());
	            
	            
	  
	  }else {
		  System.out.println("match not found");
	  }
	}
	
	@Test(priority = 10)
	public void testCase10() throws InterruptedException {


WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//input[@name='username']"))));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//input[@placeholder='Search']"))));
		
		driver.findElement(By.xpath("//*[text()='PIM']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']//input")));
		
		driver.findElement(By.xpath("//*[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']//input")).sendKeys("testFirst testMiddle testLast");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
//	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][3]")));
	
	wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][3]"), "testFirst testMiddle"));
	  
	
	String text1 =    driver.findElement(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][3]")).getText();

    String text2 = driver.findElement(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][4]")).getText();
	  
	  if(text1.equals("testFirst testMiddle") && text2.equals("testLast")) {
		  System.out.println("match found executing next steps");
		  
		  driver.findElement(By.xpath("//*[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][9]//div[@class='oxd-table-cell-actions']//button[@type='button'][2]")).click();
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='orangehrm-tabs']//div[@class='orangehrm-tabs-wrapper']//*[text()='Personal Details']")));
	  
			driver.findElement(By.xpath("//div[@class='orangehrm-edit-employee-navigation']//div[@class='orangehrm-tabs-wrapper'][6]")).click();
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[text()='Joined Date']//following::div")));
			
			driver.findElement(By.xpath("//h6[text()='Employee Termination / Activiation']//following::button")).click();
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[text()='Termination Date']//following::input")));
			
			driver.findElement(By.xpath("//label[text()='Termination Date']//following::input")).sendKeys("2023-02-02");
			
			driver.findElement(By.xpath("//label[text()='Termination Reason']//following::div")).click();
			
			driver.findElement(By.xpath("//label[text()='Termination Reason']//following::div//*[text()='Resigned']")).click();
			
			driver.findElement(By.xpath("//label[text()='Note']//following::textarea")).sendKeys("Another job offer received");
			
			driver.findElement(By.xpath("//textarea//following::button[@type='submit']")).click();
			
			wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h6[text()='Employee Termination / Activiation']//following::button"), "Activate Employment"));

			//validation button is visible
		
			
			Assert.assertEquals(driver.findElement(By.xpath("//h6[text()='Employee Termination / Activiation']//following::button")).getText(), "Activate Employment");
			System.out.println(driver.findElement(By.xpath("//h6[text()='Employee Termination / Activiation']//following::button")).getText());
			
			
			
driver.findElement(By.xpath("//h6[text()='Employee Termination / Activiation']//following::button")).click();
			
			wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h6[text()='Employee Termination / Activiation']//following::button"), "Terminate Employment"));
			
			//validation
			
			Assert.assertEquals(driver.findElement(By.xpath("//h6[text()='Employee Termination / Activiation']//following::button")).getText(), "Terminate Employment");
			System.out.println(driver.findElement(By.xpath("//h6[text()='Employee Termination / Activiation']//following::button")).getText());
	
	  }else {
		  System.out.println("match not found");
	  }
		
	}
	//test case 10 and 11 combined because once terminated cannot found in search employee 
//	@Test
	public void testCase11() {


WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//input[@name='username']"))));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//input[@placeholder='Search']"))));
		
		driver.findElement(By.xpath("//*[text()='PIM']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']//input")));
		
		driver.findElement(By.xpath("//*[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']//input")).sendKeys("testFirst testMiddle testLast");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
//	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][3]")));
	
	wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][3]"), "testFirst testMiddle"));
	
	
	  String text1 =    driver.findElement(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][3]")).getText();

    String text2 = driver.findElement(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][4]")).getText();
	  
	  if(text1.equals("testFirst testMiddle") && text2.equals("testLast")) {
		  System.out.println("match found executing next steps");
		  
		  driver.findElement(By.xpath("//*[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][9]//div[@class='oxd-table-cell-actions']//button[@type='button'][2]")).click();
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='orangehrm-tabs']//div[@class='orangehrm-tabs-wrapper']//*[text()='Personal Details']")));
	  
			driver.findElement(By.xpath("//div[@class='orangehrm-edit-employee-navigation']//div[@class='orangehrm-tabs-wrapper'][6]")).click();
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[text()='Joined Date']//following::div")));
		
			driver.findElement(By.xpath("//h6[text()='Employee Termination / Activiation']//following::button")).click();
			
			wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h6[text()='Employee Termination / Activiation']//following::button"), "Terminate Employment"));
			
			//validation
			
			Assert.assertEquals(driver.findElement(By.xpath("//h6[text()='Employee Termination / Activiation']//following::button")).getText(), "Terminate Employment");
			System.out.println(driver.findElement(By.xpath("//h6[text()='Employee Termination / Activiation']//following::button")).getText());
	}else {
		System.out.println("match not found");
	}
	}
	
	
	@Test(priority = 12)
	public void testCase12() throws InterruptedException {


WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//input[@name='username']"))));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//input[@placeholder='Search']"))));
		
		driver.findElement(By.xpath("//*[text()='PIM']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']//input")));
		
		driver.findElement(By.xpath("//*[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']//input")).sendKeys("testFirst testMiddle testLast");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
//	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][3]")));
	
	wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][3]"), "testFirst testMiddle"));
	 
	
	String text1 =    driver.findElement(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][3]")).getText();

    String text2 = driver.findElement(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][4]")).getText();
	  
	  if(text1.equals("testFirst testMiddle") && text2.equals("testLast")) {
		  System.out.println("match found executing next steps");
		  
		  driver.findElement(By.xpath("//*[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][9]//div[@class='oxd-table-cell-actions']//button[@type='button'][2]")).click();
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='orangehrm-tabs']//div[@class='orangehrm-tabs-wrapper']//*[text()='Personal Details']")));
	  
			driver.findElement(By.xpath("//div[@class='orangehrm-edit-employee-navigation']//div[@class='orangehrm-tabs-wrapper'][7]")).click();
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h6[text()='Assigned Salary Components']//following::button")));
			
			driver.findElement(By.xpath("//h6[text()='Assigned Salary Components']//following::button")).click();
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[text()='Salary Component']//following::input")));
			
			driver.findElement(By.xpath("//label[text()='Salary Component']//following::input")).sendKeys("1000000");
			
			driver.findElement(By.xpath("//label[text()='Pay Grade']//following::div")).click();
			
			driver.findElement(By.xpath("//label[text()='Pay Grade']//following::div//*[text()='Grade 3']")).click();
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[text()='Pay Frequency']//following::div")));
			
			driver.findElement(By.xpath("//label[text()='Pay Frequency']//following::div")).click();
			
			driver.findElement(By.xpath("//label[text()='Pay Frequency']//following::div//*[text()='Monthly']")).click();
			
			driver.findElement(By.xpath("//label[text()='Currency']//following::div")).click();
			
			driver.findElement(By.xpath("//label[text()='Currency']//following::div//*[text()='United States Dollar']")).click();
			
			driver.findElement(By.xpath("//label[text()='Amount']//following::input")).sendKeys("40000");
			
			driver.findElement(By.xpath("//p[text()='Include Direct Deposit Details']//following::span")).click();
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[text()='Account Number']//following::input")));
			
			driver.findElement(By.xpath("//label[text()='Account Number']//following::input")).sendKeys("123456");
			
			driver.findElement(By.xpath("//label[text()='Account Type']//following::div")).click();
			
			driver.findElement(By.xpath("//label[text()='Account Type']//following::div//*[text()='Savings']")).click();
			
			driver.findElement(By.xpath("//label[text()='Routing Number']//following::input")).sendKeys("987654");
			
			driver.findElement(By.xpath("//label[text()='Routing Number']//following::label[text()='Amount']//following::input")).sendKeys("50000");
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			
			wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@class='oxd-table-body']//div[@class='oxd-table-cell oxd-padding-cell'][2]"), "1000000"));
			
			driver.findElement(By.xpath("//div[@class='oxd-table-body']//div[@class='oxd-table-cell oxd-padding-cell'][7]//button[2]")).click();
			
//			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[text()='Salary Component']//following::input")));
			
//			wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//label[text()='Salary Component']//following::input"), "1000000"));
			wait.until(ExpectedConditions.textToBePresentInElementValue(By.xpath("//label[text()='Salary Component']//following::input"), "1000000"));
//			Thread.sleep(3000);
			//validation
			
			//salary component 
			Assert.assertEquals(driver.findElement(By.xpath("//label[text()='Salary Component']//following::input")).getAttribute("value"),"1000000" );
			System.out.println(driver.findElement(By.xpath("//label[text()='Salary Component']//following::input")).getAttribute("value"));
			
			//pay grade
			Assert.assertEquals(driver.findElement(By.xpath("//label[text()='Pay Grade']//following::div")).getText(),"Grade 3");
			System.out.println(driver.findElement(By.xpath("//label[text()='Pay Grade']//following::div")).getText());
			
			//pay frequency
			Assert.assertEquals(driver.findElement(By.xpath("//label[text()='Pay Frequency']//following::div")).getText(),"Monthly");
			System.out.println(driver.findElement(By.xpath("//label[text()='Pay Frequency']//following::div")).getText());
			
			//currency
			Assert.assertEquals(driver.findElement(By.xpath("//label[text()='Currency']//following::div")).getText(),"United States Dollar");
			System.out.println(driver.findElement(By.xpath("//label[text()='Currency']//following::div")).getText());
			
			//amount
			Assert.assertEquals(driver.findElement(By.xpath("//label[text()='Amount']//following::input")).getAttribute("value"),"40000");
			System.out.println(driver.findElement(By.xpath("//label[text()='Amount']//following::input")).getAttribute("value"));
			
			//account number
			Assert.assertEquals(driver.findElement(By.xpath("//label[text()='Account Number']//following::input")).getAttribute("value"),"123456");
			System.out.println(driver.findElement(By.xpath("//label[text()='Account Number']//following::input")).getAttribute("value"));
			
			//account type
			Assert.assertEquals(driver.findElement(By.xpath("//label[text()='Account Type']//following::div")).getText(), "Savings");
			System.out.println(driver.findElement(By.xpath("//label[text()='Account Type']//following::div")).getText());
			
			//routing number
			Assert.assertEquals(driver.findElement(By.xpath("//label[text()='Routing Number']//following::input")).getAttribute("value"),"987654");
			System.out.println(driver.findElement(By.xpath("//label[text()='Routing Number']//following::input")).getAttribute("value"));
			
			//amount
			Assert.assertEquals(driver.findElement(By.xpath("//label[text()='Routing Number']//following::label[text()='Amount']//following::input")).getAttribute("value"),"50000.00");
			System.out.println(driver.findElement(By.xpath("//label[text()='Routing Number']//following::label[text()='Amount']//following::input")).getAttribute("value"));
			
			
			
	  }else {
		  System.out.println("match not found");
	  }
	}
	
	@Test(priority = 13)
	public void testCase13() {
		


WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//input[@name='username']"))));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//input[@placeholder='Search']"))));
		
		driver.findElement(By.xpath("//*[text()='PIM']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']//input")));
		
		driver.findElement(By.xpath("//*[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']//input")).sendKeys("testFirst testMiddle testLast");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
//	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][3]")));
	
	 
	wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][3]"), "testFirst testMiddle"));
	
	
	String text1 =    driver.findElement(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][3]")).getText();

    String text2 = driver.findElement(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][4]")).getText();
	  
	  if(text1.equals("testFirst testMiddle") && text2.equals("testLast")) {
		  System.out.println("match found executing next steps");
		  
		  driver.findElement(By.xpath("//*[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[@class='oxd-table-cell oxd-padding-cell'][9]//div[@class='oxd-table-cell-actions']//button[@type='button'][2]")).click();
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='orangehrm-tabs']//div[@class='orangehrm-tabs-wrapper']//*[text()='Personal Details']")));
	  
			driver.findElement(By.xpath("//div[@class='orangehrm-edit-employee-navigation']//div[@class='orangehrm-tabs-wrapper'][8]")).click();
		
			
			wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//label[text()='Status']//following::div//*[text()='-- Select --']"), "-- Select --"));
			
			driver.findElement(By.xpath("//label[text()='Status']//following::div")).click();
			
			driver.findElement(By.xpath("//label[text()='Status']//following::div//*[text()='Single']")).click();
			
			driver.findElement(By.xpath("//label[text()='State']//following::div")).click();
			
			driver.findElement(By.xpath("//label[text()='State']//following::div//*[text()='California']")).click();
			
			driver.findElement(By.xpath("//label[text()='State']//following::label[text()='Status']//following::div")).click();
			
			driver.findElement(By.xpath("//label[text()='State']//following::label[text()='Status']//following::div//*[text()='Single']")).click();
			
			driver.findElement(By.xpath("//label[text()='Unemployment State']//following::div")).click();
			
			driver.findElement(By.xpath("//label[text()='Unemployment State']//following::div//*[text()='California']")).click();
			
			driver.findElement(By.xpath("//label[text()='Work State']//following::div")).click();
			
			driver.findElement(By.xpath("//label[text()='Work State']//following::div//*[text()='California']")).click();
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//label[text()='Status']//following::div//*[text()='Single']"), "Single"));
			
			//validation
			
			//status
			Assert.assertEquals(driver.findElement(By.xpath("//label[text()='Status']//following::div//*[text()='Single']")).getText(), "Single");
			System.out.println(driver.findElement(By.xpath("//label[text()='Status']//following::div//*[text()='Single']")).getText());
			
			
			//state
			Assert.assertEquals(driver.findElement(By.xpath("//label[text()='State']//following::div//*[text()='California']")).getText(),"California");
			System.out.println(driver.findElement(By.xpath("//label[text()='State']//following::div//*[text()='California']")).getText());
		
			
			//status
			Assert.assertEquals(driver.findElement(By.xpath("//label[text()='State']//following::label[text()='Status']//following::div//*[text()='Single']")).getText(),"Single");
			System.out.println(driver.findElement(By.xpath("//label[text()='State']//following::label[text()='Status']//following::div//*[text()='Single']")).getText());
			
			//unemployed state
			Assert.assertEquals(driver.findElement(By.xpath("//label[text()='Unemployment State']//following::div//*[text()='California']")).getText(),"California");
			System.out.println(driver.findElement(By.xpath("//label[text()='Unemployment State']//following::div//*[text()='California']")).getText());
			
			//work state
			Assert.assertEquals(driver.findElement(By.xpath("//label[text()='Work State']//following::div//*[text()='California']")).getText(),"California");
			System.out.println(driver.findElement(By.xpath("//label[text()='Work State']//following::div//*[text()='California']")).getText());
			
			
	  }else {
		  System.out.println("match not found");
	  }
	}

}
