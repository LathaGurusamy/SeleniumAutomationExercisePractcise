package SeleniumGoal.SeleniumPractiseAndExrecise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TwentyFifthTaskTwo {

    public static void main(String[] args) {
        // Set up the ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Perform registration
        performRegistration(driver);

        // Perform login
        performLogin(driver);

        // Close the browser window and quit the WebDriver instance
        driver.quit();
    }

    public static void performRegistration(WebDriver driver) {
        // Open GUVI registration page
        driver.get("https://www.guvi.in/register");
        
        

        // Maximize the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Implicit wait
        driver.manage().window().maximize();
        
        System.out.println("\033 Guvi Sign Up Page");


        // Entering Full Name
        WebElement fullNameField = driver.findElement(By.id("name"));
        fullNameField.sendKeys("Latha.G");
        System.out.println("Full Name: Latha.G");

        // Entering Email Address
        WebElement emailAddress = driver.findElement(By.xpath("//div[@class='form-group']//input[@type='email']"));
        emailAddress.sendKeys("Lathaguvitarget1994@gmail.com");
        System.out.println("Email Address: Lathaguvitarget1994@gmail.com");

        // Entering Password
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("Jayram@123");
        System.out.println("Password: Jayram@123");

        // Entering Mobile Number
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement mobileNumber = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='form-control countrycode-left']")));
        String mobile = "8971833474";
        mobileNumber.sendKeys(mobile);
        System.out.println("Mobile Number: " + mobile);

        // Click on Signup Button
        WebElement signUp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='signup-btn']")));
        signUp.click();
        System.out.println("Signup Button has been clicked successfully.");

        // Selecting dropdown
        driver.findElement(By.xpath("(//select)[1]")).click();
        System.out.println("Dropdown selected.");

        // Selecting particular current profile
        List<WebElement> currentProfile = driver.findElements(By.xpath("//select/option"));
        for (WebElement profile : currentProfile) {
            if (profile.getText().contains("Working professional in IT")) {
                String selectedOption = profile.getText();
                System.out.println("Your current profile: " + selectedOption);
                profile.click();
                break; // If you want to click only the first match and then exit the loop
            }
        }

        // Selecting particular degree
        List<WebElement> degree = driver.findElements(By.xpath("//select/option"));
        for (WebElement deg : degree) {
            if (deg.getText().contains("B.E. / B.Tech. ECE")) {
                String selectedOption = deg.getText();
                System.out.println("Your degree is: " + selectedOption);
                deg.click();
                break; // If you want to click only the first match and then exit the loop
            }
        }

        // Entering year
        WebElement givingYear = driver.findElement(By.xpath("//input[@id='year']"));
        String year = "2015";
        givingYear.sendKeys(year);
        System.out.println("Year is: " + year);

        // Clicking on Submit Button
        WebElement submitButton = driver.findElement(By.xpath("//a[@id='details-btn']"));
        submitButton.click();
        System.out.println("Submit button has been clicked successfully");

        // Landed page
        WebElement landedPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(), 'Almost Done! Check Your Inbox!')]")));
        String pageText = landedPage.getText();
        System.out.println("Landed page is: " + pageText);
        
        
        
    }

    public static void performLogin(WebDriver driver) {
        // Open GUVI login page
        driver.get("https://www.guvi.in/sign-in/");

        // Maximize the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Implicit wait
        driver.manage().window().maximize();
        
      
        System.out.println("\033 Guvi Sign In Page");


        // Entering Email ID
        WebElement emailId = driver.findElement(By.id("email"));
        emailId.sendKeys("lathadummyid@gmail.com");
        System.out.println("Email ID is: lathadummyid@gmail.com");

        // Entering Password
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("Dummyid@123");
        System.out.println("Password is: Dummyid@123");

        // Click on Login Button
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='login-btn']")));
        login.click();
        System.out.println("Login button clicked.");

        // Get the title of the page
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
    }
}
