
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoLoginTest {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();


        driver.manage()
              .window()
              .maximize();


        driver.manage()
              .timeouts()
              .implicitlyWait(Duration.ofSeconds(10));


        // Open application

        driver.get("https://www.saucedemo.com/");


        // Enter username

        driver.findElement(
                By.xpath("//input[@id='user-name']")
        )
        .sendKeys("standard_user");



        // Enter password

        driver.findElement(
                By.xpath("//input[@id='password']")
        )
        .sendKeys("secret_sauce");



        // Click Login

        driver.findElement(
                By.xpath("//input[@id='login-button']")
        )
        .click();



        // Verify login success

        String currentUrl = driver.getCurrentUrl();


        if(currentUrl.contains("inventory"))
        {
            System.out.println("Login Successful");
        }
        else
        {
            System.out.println("Login Failed");
        }



        driver.quit();

    }
}