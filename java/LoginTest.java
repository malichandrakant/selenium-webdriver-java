import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement usernameBox =
                driver.findElement(By.id("username"));

        usernameBox.sendKeys("student");

        WebElement passwordBox =
                driver.findElement(By.id("password"));

        passwordBox.sendKeys("Password123");

        WebElement loginButton =
                driver.findElement(By.id("submit"));

        loginButton.click();

        String title = driver.getTitle();

        System.out.println("Page title = " + title);

        driver.quit();
    }
}