
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocatorDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // Open website
        driver.get("https://www.saucedemo.com/");

        // Maximize browser
        driver.manage().window().maximize();

        // Locate elements using ID
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        // Click Login button
        driver.findElement(By.id("login-button")).click();
//
        Thread.sleep(3000);

        // Close browser
        driver.quit();
    }
}