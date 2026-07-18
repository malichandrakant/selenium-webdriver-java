
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductPageTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // Open application
        driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();


        // -------------------------------
        // CLASS NAME
        // -------------------------------

        // Example:
        // <input class="Pke_EE" type="text">
        
        WebElement searchBox = driver.findElement(By.className("Pke_EE"));
        searchBox.sendKeys("iPhone 15");


        // -------------------------------
        // TAG NAME 
        // -------------------------------

        // Find all links available on page
        // HTML:
        // <a href="...">Mobile</a>

        List<WebElement> allLinks =
                driver.findElements(By.tagName("a"));

        System.out.println("Total links on page: " + allLinks.size());


        // Find all images on product page
        // HTML:
        // <img src="product.jpg">

        List<WebElement> images =
                driver.findElements(By.tagName("img"));

        System.out.println("Total images: " + images.size());


        // Validate images are displayed

        for(WebElement image : images) {

            if(image.isDisplayed()) {
                System.out.println("Product image displayed");
            }
        }


        // Find buttons using tag name

        List<WebElement> buttons =
                driver.findElements(By.tagName("button"));

        System.out.println("Total buttons: " + buttons.size());


        driver.quit();
    }
}