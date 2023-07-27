package paraBank_Project;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class ParaBankProject {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		Select s;
		System.setProperty("webdriver.chrome.driver", "D:\\Edubridge\\Automation Testing\\Browser Extension\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//URL
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		Thread.sleep(2000);
		
		//Registration
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/p[2]/a")).click();
		Thread.sleep(2000);
		
		//First Name
		driver.findElement(By.id("customer.firstName")).sendKeys("Samwi");
		Thread.sleep(2000);
		
		//LastName
		driver.findElement(By.id("customer.lastName")).sendKeys("K");
		Thread.sleep(2000);
		
		//Address
		driver.findElement(By.id("customer.address.street")).sendKeys("F.no 503");
		Thread.sleep(2000);
		
		//City
		driver.findElement(By.id("customer.address.city")).sendKeys("Pune");
		Thread.sleep(2000);
		
		//State
		driver.findElement(By.id("customer.address.state")).sendKeys("Maharastra");
		Thread.sleep(2000);
		
		//Zip code
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("412587");
		Thread.sleep(2000);
		
		//Phone
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("9676476947");
		Thread.sleep(2000);
		
		//SSN
		driver.findElement(By.id("customer.ssn")).sendKeys("5548");
		Thread.sleep(2000);
		
		//UserName
		driver.findElement(By.id("customer.username")).sendKeys("Samwi28");
		Thread.sleep(2000);
		
		//Password
		driver.findElement(By.id("customer.password")).sendKeys("Samwi@1200");
		Thread.sleep(2000);
		
		//Confirm Password
		driver.findElement(By.id("repeatedPassword")).sendKeys("Samwi@1200");
		Thread.sleep(2000);
		
		//Register Button
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[13]/td[2]/input")).click();
		Thread.sleep(2000);
		
		//Login
		//Username
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[1]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[1]/input")).sendKeys("Samwi9");
		Thread.sleep(2000);
		
		//Password
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[2]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[2]/input")).sendKeys("Samwi@1200");
		Thread.sleep(2000);
		
		//Login Button
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[3]/input")).click();
		Thread.sleep(2000);
		
		//Open New Account
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		
			//Select Account Type-Current
			s = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/select[1]")));
			s.selectByValue("0");
			Thread.sleep(2000);
			
			//Select Account number
			s = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/select[2]")));
			s.selectByIndex(0);
			Thread.sleep(2000);
			
			//click on open new account
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div/input")).click();
			
		//Open New Account
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[1]/a")).click();
		Thread.sleep(2000);
			
			//Select Account Type-Savings
			s = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/select[1]")));
			s.selectByValue("1");
			Thread.sleep(2000);
			
			//Select Account number
			s = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/select[2]")));
			s.selectByIndex(1);
			Thread.sleep(2000);
			
			//click on open new account
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div/input")).click();
			
		//Accounts Overview
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[2]/a")).click();
		Thread.sleep(2000);
			
			//Click on account number
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/table/tbody/tr[1]/td[1]/a")).click();
			Thread.sleep(2000);
			
			//Select Activity Period All
			s = new Select(driver.findElement(By.id("month")));
			s.selectByValue("All");
			Thread.sleep(2000);
			
			//Select Type All
			s = new Select(driver.findElement(By.id("transactionType")));
			s.selectByValue("All");
			Thread.sleep(2000);
			
			//click on fund transfer send
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[2]/table/tbody/tr/td[2]/a")).click();
			Thread.sleep(2000);
			
			//ScreenShot
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Thread.sleep(2000);
			
			//To paste
			Files.copy(f, new File("D:\\Edubridge\\Automation Testing\\ScreenShot\\AccountOverview.jpg"));
			
		//Trasfer Funds
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[3]/a")).click();
		Thread.sleep(2000);
	

			
		//Bill Pay
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[4]/a")).click();
		Thread.sleep(2000);
		
			//PayeeName
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[1]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("Sampath");
			Thread.sleep(2000);
			
			//Address
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[1]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("Hadapsar");
			Thread.sleep(2000);
			
			//City
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[1]/form/table/tbody/tr[3]/td[2]/input")).sendKeys("Pune");
			Thread.sleep(2000);
			
			//State
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[1]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("Pune");
			Thread.sleep(2000);
			
			//Zipcode
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[1]/form/table/tbody/tr[5]/td[2]/input")).sendKeys("412589");
			Thread.sleep(2000);

			//Phone
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[1]/form/table/tbody/tr[6]/td[2]/input")).sendKeys("9647854796");
			Thread.sleep(2000);
			
			//Account no.
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[1]/form/table/tbody/tr[8]/td[2]/input")).sendKeys("13455");
			Thread.sleep(2000);
			
			//Verify Account no.
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[1]/form/table/tbody/tr[9]/td[2]/input")).sendKeys("13455");
			Thread.sleep(2000);
			
			//Amount
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[1]/form/table/tbody/tr[11]/td[2]/input")).sendKeys("5000");
			Thread.sleep(2000);
			
			//Select To Account
			s = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[1]/form/table/tbody/tr[13]/td[2]/select")));
			s.selectByIndex(1);
			Thread.sleep(2000);
			
			
			//Click on Send Payment
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[1]/form/table/tbody/tr[14]/td[2]/input")).click();
			
		//Find Transaction
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[5]/a")).click();
			Thread.sleep(2000);
			
			//Select To Account
			s = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select")));
			s.selectByIndex(1);
			Thread.sleep(2000);
			
			//Find by Transaction ID
			driver.findElement(By.id("criteria.transactionId")).sendKeys("12345");
			Thread.sleep(2000);
			
			//Find Transaction
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[5]/a")).click();
			Thread.sleep(2000);
			
			//Select To Account
			s = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select")));
			s.selectByIndex(1);
			Thread.sleep(2000);
			
			//Find by Date
			driver.findElement(By.id("criteria.onDate")).sendKeys("05-03-2023");
			Thread.sleep(2000);
			
			//Find Transaction
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[5]/a")).click();
			Thread.sleep(2000);
			
			//Select To Account
			s = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select")));
			s.selectByIndex(1);
			Thread.sleep(2000);
			
			//Find by Date Range
			driver.findElement(By.id("criteria.fromDate")).sendKeys("01-03-2023");
			Thread.sleep(2000);
			//Find by Date Range
			driver.findElement(By.id("criteria.toDate")).sendKeys("30-03-2023");
			Thread.sleep(2000);
			
			//Find Transaction
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[5]/a")).click();
			Thread.sleep(2000);
			
			//Select To Account
			s = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select")));
			s.selectByIndex(1);
			Thread.sleep(2000);
			
			//Find by Amount
			driver.findElement(By.id("criteria.amount")).sendKeys("01-03-2023");
			Thread.sleep(2000);
		
		//Update Contact info
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[6]/a")).click();
			//First Name
			driver.findElement(By.id("customer.firstName")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("customer.firstName")).sendKeys("Samwidha");
			Thread.sleep(2000);
			
			//Last Name
			driver.findElement(By.id("customer.lastName")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("customer.lastName")).sendKeys("Kandi");
			Thread.sleep(2000);
			
			//Phone
			//Last Name
			driver.findElement(By.id("customer.phoneNumber")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("customer.phoneNumber")).sendKeys("9676476947");
			Thread.sleep(2000);
			
			//Click on Update Profile
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/table/tbody/tr[8]/td[2]/input")).click();
			Thread.sleep(2000);
			
		//Request Loan
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[7]/a")).click();
			
			//Loan Amount
			driver.findElement(By.id("amount")).sendKeys("5000");
			Thread.sleep(2000);
			
			//Down Payment
			driver.findElement(By.id("downPayment")).sendKeys("500");
			Thread.sleep(2000);
			
			//Select Account
			s = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/table/tbody/tr[3]/td[2]/select")));
			s.selectByIndex(1);
			Thread.sleep(2000);
			
			//Click on ApplyNow
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/table/tbody/tr[4]/td[2]/input")).click();
			
		//About us
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul[1]/li[2]/a")).click();
			Thread.sleep(3000);
			
			driver.navigate().back();
			
		//Services
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul[1]/li[3]/a")).click();
			Thread.sleep(3000);
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			Thread.sleep(2000);
			
			WebElement course=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/span[2]"));
			js.executeScript("arguments[0].scrollIntoView", course);
			Thread.sleep(2000);
			
			WebElement course1=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/span[5]"));
			js.executeScript("arguments[0].scrollIntoView", course1);
			Thread.sleep(2000);
			
			js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
			
			driver.navigate().back();
			
		//Products
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul[1]/li[5]/a")).click();
			Thread.sleep(2000);
			
			driver.navigate().back();
			
		//Location
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul[1]/li[5]/a")).click();
			Thread.sleep(2000);
			
			driver.navigate().back();
			
		//Admin Page
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul[1]/li[6]/a")).click();
			Thread.sleep(2000);
			
			driver.navigate().back();
			
		//Welcome to Account Services
			//Home Page
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul[2]/li[1]/a")).click();
			Thread.sleep(2000);
			
			//Para soft demo website
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul[2]/li[2]/a")).click();
			Thread.sleep(2000);
			
			//Customer care
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul[2]/li[3]/a")).click();
			Thread.sleep(2000);
				
				//Name
				driver.findElement(By.id("name")).sendKeys("Samwidha");
				Thread.sleep(2000);
				
				//Email
				driver.findElement(By.id("email")).sendKeys("samwi@gmail.com");
				Thread.sleep(2000);
			
				//Phone
				driver.findElement(By.id("phone")).sendKeys("9676476947");
				Thread.sleep(2000);
				
				//Message
				driver.findElement(By.id("message")).sendKeys("Hi Iam unable to transfer amount.");
				Thread.sleep(2000);
				
				//send to Customer Care
				driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[5]/td[2]/input")).click();
				
		//Logout
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[8]/a")).click();
			Thread.sleep(2000);
			
			driver.close();
		

	}

}
