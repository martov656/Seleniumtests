package selenium.TaskCheckConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationExample {
    public static void main(String[] args) {

        // Initialize the driver
        WebDriver driver = new ChromeDriver();

        // 1. Go to Google
        driver.get("https://www.google.com");

        // 2. Go to CodersLab
        driver.get("https://coderslab.com/en");

        // 3. Go back to Google
        driver.navigate().back();

        // 4. Go to MyStore testlab
        driver.get("https://mystore-testlab.coderslab.pl/index.php");

        // 5. Go back to Google
        driver.navigate().back();

        // 6. Go forward to MyStore testlab
        driver.navigate().forward();

        // 7. Refresh the MyStore testlab page
        driver.navigate().refresh();

        // Close the browser
        driver.quit();
    }

}