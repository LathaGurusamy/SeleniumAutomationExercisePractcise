package SeleniumGoal.SeleniumPractiseAndExrecise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;

public class TwentySeventhTaskOne {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Set up ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        // Open the form page
        driver.get("https://phptravels.com/demo/");

        System.out.println("Page loaded.");

        // Entering Firstname details
        WebElement firstName = wait.until(ExpectedConditions.elementToBeClickable(By.name("first_name")));
        firstName.sendKeys("Latha");
        System.out.println("First name: Latha");

        // Entering LastName details
        WebElement lastName = driver.findElement(By.name("last_name"));
        lastName.sendKeys("Gurusamy");
        System.out.println("Last name: Gurusamy");

        // Selecting country number details
        WebElement countryNumber = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[@data-country-phonecode='91']")));
        countryNumber.click();
        System.out.println("Country number selected.");

        // Entering WhatsApp Number
        WebElement whatsappNumber = driver.findElement(By.name("whatsapp"));
        whatsappNumber.sendKeys("8971833474");
        System.out.println("WhatsApp number: 8971833474");

        // Entering Business Name
        WebElement businessName = driver.findElement(By.name("business_name"));
        businessName.sendKeys("Latha's Business");
        System.out.println("Business name: Latha's Business");

        // Entering Email
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("Lathagurusamy1994@gmail.com");
        System.out.println("Email: Lathagurusamy1994@gmail.com");

        // Add the logic for sum verification
        WebElement number1 = driver.findElement(By.id("numb1"));
        WebElement number2 = driver.findElement(By.id("numb2"));
        int sum = Integer.parseInt(number1.getText()) + Integer.parseInt(number2.getText());

        WebElement sumField = driver.findElement(By.id("number"));
        sumField.sendKeys(String.valueOf(sum));
        System.out.println("Sum verification completed. Sum: " + sum);

        // Submit the form using JavaScript to avoid ElementClickInterceptedException
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("demo")));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", submitButton);
        System.out.println("Submit button clicked.");

        Thread.sleep(4000);
    
       
    
       WebElement landedPage= driver.findElement(By.xpath("//h2"));
       System.out.println("Landed Page."+ landedPage.getText());
       
     //Take a screenshot of the page after form submission
       File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
         Files.copy(screenshot.toPath(), Paths.get("C:\\Users\\Latha G\\Documents\\Screenshots\\form_submission_screenshot.png"));
        System.out.println("Screenshot taken: C:\\Users\\Latha G\\Documents\\Screenshots\\form_submission_screenshot.png");


       
  
    }
}
