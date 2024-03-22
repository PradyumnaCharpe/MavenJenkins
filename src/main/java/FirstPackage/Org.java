package FirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Org {

    @Test
    public void loginTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8888/"); // Replace "your_website_url" with the actual URL
        
        // Login to the application
        driver.findElement(By.name("user_name")).sendKeys("admin");
        driver.findElement(By.name("user_password")).sendKeys("admin");
        driver.findElement(By.id("submitButton")).click();

        // Add assertions or further test steps as needed
        
       
    }
}
