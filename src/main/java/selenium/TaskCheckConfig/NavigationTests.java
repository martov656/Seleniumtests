package selenium.TaskCheckConfig;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.BasedSharedMethods;

import java.time.Duration;

public class NavigationTests extends BasedSharedMethods {


    @Test
    public void NavigationExercise2() {
        driver.get("https://coderslab.com/en");
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        driver.navigate().to("https://hotel-testlab.coderslab.pl/en/");
    }

    @Test
    public void NavigationExercise3() {
        driver.get("https://www.google.com");
        wait.until(ExpectedConditions.titleContains("Google"));
        driver.get("https://coderslab.com/en");
        wait.until(ExpectedConditions.titleContains("Online programming courses"));
        driver.navigate().back();
        wait.until(ExpectedConditions.titleContains("Google"));
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        wait.until(ExpectedConditions.titleContains("testlab"));
        driver.navigate().back();
        wait.until(ExpectedConditions.titleContains("Google"));
        driver.navigate().forward();
        wait.until(ExpectedConditions.titleContains("testlab"));
        driver.navigate().refresh();
        wait.until(ExpectedConditions.titleContains("testlab"));
    }
}
