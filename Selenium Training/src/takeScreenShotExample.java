import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


// http://seleniumeasy.com/selenium-tutorials/take-screenshot-with-selenium-webdriver
// test modify 07/07/2014
 

    public class takeScreenShotExample{
    	public WebDriver driver;

         
      @Test
      public void openBrowser() throws Exception {
    	  driver = new FirefoxDriver();
    	  driver.manage().window().maximize();
    	  driver.get("http://www.google.com");
    	  
    	  
    	  try{
                //the below statement will throw an exception as the element is not found, Catch block will get executed and takes the screenshot.
    		  driver.findElement(By.id("testing")).sendKeys("test");
                   //if we remove the below comment, it will not return exception and screen shot method will not get executed.
    		  //driver.findElement(By.id("gbqfq")).sendKeys("test");
    	  }
    	  catch (Exception e){
    		  System.out.println("I'm in exception");
    		  getscreenshot();
//calls the method to take the screenshot.
    		  
     	  }
      }

      public void getscreenshot() throws Exception 
      {
            File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(srcFile, new File("D:\\screenshot.png"));
           //The below method will save the screen shot in d drive with name "screenshot.png"
             
      }
   }
