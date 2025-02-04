package SeleniumGoal.SeleniumPractiseAndExrecise;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

		public class TwentyThirdTaskOne {
		    public static void main(String[] args) {
		        WebDriverManager.chromedriver().setup();
		        WebDriver driver = new ChromeDriver();
		        driver.get("https://www.facebook.com/");
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Implicit wait
		        if (driver.getTitle().contains("Facebook")) {
		            System.out.println("Navigated to Facebook homepage successfully.");
		        } else {
		            System.out.println("Navigation to Facebook homepage failed.");
		            driver.quit();
		            return;
		        }
		        WebElement createAccountButton = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		        createAccountButton.click();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		        WebElement firstNameField = driver.findElement(By.name("firstname"));
		        firstNameField.sendKeys("Test");
		        WebElement lastNameField = driver.findElement(By.name("lastname"));
		        lastNameField.sendKeys("User");
		        WebElement dayField = driver.findElement(By.name("birthday_day"));
		        dayField.sendKeys("11");
		        WebElement monthField = driver.findElement(By.name("birthday_month"));
		        monthField.sendKeys("May");
		        WebElement yearField = driver.findElement(By.name("birthday_year"));
		        yearField.sendKeys("1985");
		        WebElement genderRadioButton = driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
		        genderRadioButton.click();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                WebElement enterEmailField = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
		        enterEmailField.sendKeys("testuser@test.com");
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		        WebElement passwordField = driver.findElement(By.name("reg_passwd__"));
		        passwordField.sendKeys("StrongPassword123!");
		        if (driver.getTitle().contains("Facebook")) {
		            System.out.println("User registered successfully and redirected to the Facebook homepage.");
		        } else {
		            System.out.println("User registration failed.");
		        }
		        WebElement signUpButton = driver.findElement(By.name("websubmit"));
		        signUpButton.click();
		        driver.quit();

		    }
		}