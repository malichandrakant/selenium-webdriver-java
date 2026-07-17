import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMPartialLinkDemo {

    public static void main(String[] args) throws InterruptedException {

        // Launch browser
        WebDriver driver = new ChromeDriver();

        // Open application
        driver.get("https://opensource-demo.orangehrmlive.com/");

        // Maximize window
        driver.manage().window().maximize();

        Thread.sleep(3000);

        // Click Forgot Password link using partialLinkText
        driver.findElement(By.partialLinkText("Forgot")).click();

        Thread.sleep(3000);

        // Close browser
        driver.quit();
    }
}