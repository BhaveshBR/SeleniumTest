package com.herokuapp.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;
import org.testng.Assert;

public class PositiveTest {
	
	/*@Test
	public void LoginTest() {
		// Open the Web Driver (Chrome)
		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		
		// Navigate to Facebook.com
	    driver.get("https://the-internet.herokuapp.com/login");
	    sleep(3000);
	    
		// Provide the input to User Name
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
		
		// Provide the Input to Password
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
		
		// Click on Login Button
	    driver.findElement(By.xpath("//button[1]")).click();
		
		// Validate
	    WebElement successMessage = driver.findElement(By.xpath("//div[@id='flash']"));
	    String expectedMessage = "You logged into a secure area!";
	    String actualMessage = successMessage.getText();
	    
	    //Assert.assertEquals(actualMessage, expectedMessage, "Actual message is not the same as expected");
	    Assert.assertTrue(actualMessage.contains(expectedMessage), "Actual message does not contain expected message");
		// Close the Browser
	    driver.quit();
	}*/
	
	/*@Test
	public void RadioAndCheckboxTest()
	{
		// Open the Web Driver (Chrome)
		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    // Navigate to URL
	    driver.get("https://demo.guru99.com/test/radio.html");
	    
	    // Maximize Windows
	    driver.manage().window().maximize();
	    
	    sleep(3000);
	    
	    // Select the Radio Option 1
	    driver.findElement(By.xpath("//input[@type='radio' and @value='Option 1']")).click();
	    
	    // Select the Checkbox 1 and 2
	    driver.findElement(By.xpath("//input[@type='checkbox' and @value='checkbox1']")).click();
	    driver.findElement(By.xpath("//input[@type='checkbox' and @value='checkbox2']")).click();
	    
	    sleep(3000);
	    
	    driver.quit();
	}*/
	
	/*@Test
	public void DropDownTest()
	{
		// Open the Web Driver (Chrome)
		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    // Navigate to the URL
	    driver.get("https://the-internet.herokuapp.com/dropdown");
	    // Maximize Windows
	    driver.manage().window().maximize();
	    
	    sleep(3000);
	    
	    // Select the Option2 in Drop Down
	    Select options = new Select(driver.findElement(By.id("dropdown")));
	    options.selectByIndex(2);
	    sleep(3000);
	    
	    // Close the browser
	    driver.quit();
	}*/
	
	/*@Test
	public void TableLinkTest() {
		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();	
	    
	    String baseUrl = "https://the-internet.herokuapp.com/tables";
        driver.get(baseUrl);
        
        String innerText = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[2]/td[3]")).getText(); 	
        System.out.println(innerText); 
        String priceText = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[2]/td[4]")).getText(); 	
        System.out.println(priceText); 
        driver.quit();
	}*/
	
	/*@Test
	public void AlertTest() {
		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();	
	    
	    String baseUrl = "https://demo.guru99.com/test/delete_customer.php";
        driver.get(baseUrl);
        
        sleep(3000);
        
        driver.findElement(By.name("cusid")).sendKeys("53920");					
        driver.findElement(By.name("submit")).submit();	
        
        Alert alt = driver.switchTo().alert();
        
        String txt = alt.getText();
        System.out.println(txt);
        
        sleep(3000);
        
        alt.accept();
        
        sleep(3000);
        
        driver.quit();
	}*/
	
	/*@Test
	public void ScreenShotTest()
	{
		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    // Navigate to Website
	    driver.get("https://flipkart.com");
	    
	    sleep(3000);
	    
	    // Take the screen shot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        
        //Copy the file to a location and use try catch block to handle exception
        try {
            FileUtils.copyFile(screenshot, new File("C:\\Screenshot\\Test.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
	   
	    // Close the broswer
        driver.quit();
	}*/
	
	/*@Test
	public void UploadFileTest() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    // Navigate to Website
	    driver.get("http://demoqa.com/automation-practice-form");
	    
	    sleep(3000);
	    
	    // Get Upload File Element
	    driver.findElement(By.id("photo")).click();
	    
	    // Upload File from local drive
	    Runtime.getRuntime().exec("C:\\Screenshot\\upload.exe");
	    //uploadElement.sendKeys("C:\\Screenshot\\test.csv");
	    sleep(3000);
	    
	    // check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();

        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();
        
        sleep(3000);
        
        driver.quit();
	}*/
	
	@Test
	public void FirefoxTest()
	{
		System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://flipkart.com");
		
		sleep(3000);
		
		driver.close();
	}
	
	
	private void sleep(long m)
	{
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
