package SeleniumGoal.SeleniumPractiseAndExrecise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class TwentyFourthTaskOne {
		    public static void main(String[] args) {
		        // Set up the ChromeDriver using WebDriverManager
		        WebDriverManager.chromedriver().setup();

		        // Initialize WebDriver
		        WebDriver driver = new ChromeDriver();

		        // Open GUVI registration page
		        driver.get("https://www.guvi.in/register");

		        // Maximize the window
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Implicit wait

		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Implicit wait

		        // Entering Full Name
		        WebElement fullNameField = driver.findElement(By. id("name"));;
		        fullNameField.sendKeys("Latha.G");
		        System.out.println("Full Name: " + "Latha.G");
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Implicit wait

		        
		        //Entering Email Address
		        
		        WebElement EmailAddress = driver.findElement(By.xpath("//div[@class='form-group']//input[@type='email']"));
		        EmailAddress.sendKeys("Lathaguvitarget1994@gmail.com");
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Implicit wait
		        System.out.println("Email Address: " +"Lathaguvitarget1994@gmail.com");
		        
		        //Entering Password
		        WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));;
		        Password.sendKeys("Jayram@123");
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Implicit wait
		        System.out.println("Password: " +"Jayram@123");

		        
		        //Entering MobileNumber
			   //System.out.println("Pls enter valid mobile number");
               //WebElement mobileNumber = driver.findElement(By.xpath("//div[contains(text(),'Please Enter a valid Mobile number')]"));
		       //mobileNumber.sendKeys("8971833474");
		       //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Implicit wait
		       //System.out.println("mobileNumber: " +"8971833474");
		        
		        //Explicity Wait
		        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		       
		       
		       WebElement mobileNumber = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='form-control countrycode-left']"))); 
		       String mobile = "8971833474"; 
		       mobileNumber.sendKeys(mobile);
		       System.out.println("Mobile Number: " + mobile);
		       
		       //Click on Signup Button
               WebElement signUp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='signup-btn']"))); 
		       signUp.click();
		       System.out.println("SingnUp Button has been clicked successfuly.");
		       
		       //selecting dropdown
		       driver.findElement(By.xpath("(//select)[1]")).click();
		       System.out.println("Dropdown selected.");
		       
		       //selecting particular current profile
		       
		       List<WebElement> currentProfile = driver.findElements(By.xpath("//select/option"));
		       for (int i = 0; i < currentProfile.size(); i++)
		       {
		           if (currentProfile.get(i).getText().contains("Working professional in IT"))
		           {
		               String selectedOption = currentProfile.get(i).getText();
		               System.out.println("Your current profile :" + selectedOption);
		               currentProfile.get(i).click();
		               break; // If you want to click only the first match and then exit the loop
		           }
		       }
		       //selecting particular degree

		       
		       List<WebElement> degree = driver.findElements(By.xpath("//select/option"));
		       for (int i = 0; i < degree.size(); i++)
		       {
		           if (degree.get(i).getText().contains("B.E. / B.Tech. ECE"))
		           {
		               String selectedOption = degree.get(i).getText();
		               System.out.println("Your degree is :" + selectedOption);
		               degree.get(i).click();
		               break; // If you want to click only the first match and then exit the loop
		           }
		       }
		       
		       //Entering year
		       
		       WebElement givingYear=driver.findElement(By.xpath("//input[@id='year']"));
		       String year = "2015"; 
		       givingYear.sendKeys(year);
		       System.out.println("Year is : " + year);
		       
		       
		       //Clicking on Submit Button
		       
		       WebElement submitButton=driver.findElement(By.xpath("//a[@id='details-btn']"));
		       submitButton.click();
		       System.out.println("Submit button has been clicked succesfully");
		       
		       //Landed page
		       
		       WebElement landedPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(), 'Almost Done! Check Your Inbox!')]")));
		       String pageText = landedPage.getText(); 
		       System.out.println("Landed page is : " + pageText);
		       
		       
		 
		   
		    }
}
		       


		      

		       

		       
		       





		        
		       
		  
		        
		       
