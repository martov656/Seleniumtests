package selenium.TaskCheckConfig;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchTests {

    private WebDriver driver;

    @Test
    public void bingSearchTest(){

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));

        // for lecturer demo purpose only
        showOnSecondScreen();

        driver.manage().window().maximize();
        driver.get("https://bing.com");
        WebElement element = driver.findElement(By.name("q"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.clear();
        element.sendKeys("Coderslab");
        element.submit();
        wait.until(ExpectedConditions.titleContains("Coderslab"));
        Assertions.assertTrue(driver.getPageSource().contains("Coderslab"),"Searched key not found ...");

        // for lecturer demo purpose only
        threadSleep(5000);
        driver.quit();
    }



    private void showOnSecondScreen() {
        Point point = new Point(-2000, 0);
        driver.manage().window().setPosition(point);
    }

    private void threadSleep(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;
    }

}
