package SeleniumGoal.SeleniumPractiseAndExrecise;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TwentyFifthTaskOne {

			    public static void main(String[] args) {
		        // Set up the ChromeDriver using WebDriverManager
		        WebDriverManager.chromedriver().setup();

		        // Initialize WebDriver
		        WebDriver driver = new ChromeDriver();

		            // Maximize the window
		            driver.manage().window().maximize();

		            // Navigate to the URL
		            driver.get("https://jqueryui.com/datepicker/");
			        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));


		            // Switch to the iframe that contains the datepicker
		            driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));

		            // Open the datepicker
		            WebElement datePicker = driver.findElement(By.id("datepicker"));
		            datePicker.click();
		            System.out.println("DatePicker opened.");


		            // Select the Feb 2025 from datepicker
		            WebElement yearToSelect = driver.findElement(By.xpath("//a[@data-handler='next']"));
		            yearToSelect.click();
		            System.out.println("Feb 2025 selected.");


		            
		            // Select the date "1" from the datepicker
		            WebElement dateToSelect = driver.findElement(By.xpath("(//a[contains(text(),'22')])[1]"));
		            dateToSelect.click();
		            System.out.println("Day '22' selected.");


		            //datepicker
		            WebElement selectedYearMonthDateElement = driver.findElement(By.id("datepicker")); 
		            String datepicker = selectedYearMonthDateElement.getAttribute("value");
		            System.out.println("Selected datepicker: " + datepicker);

		         
		       
		    }
		}
