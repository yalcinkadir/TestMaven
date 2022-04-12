import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickWebsite {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        //launch website
        driver.navigate().to("https://www.ftx.com/");
        //maximize browser
        driver.manage().window().maximize();
        //scroll down the webpage by 5000 pixels
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0, 5000)");
        //click on the search button
        driver.findElement(By.linkText("Core Java")).click();



    }
}
