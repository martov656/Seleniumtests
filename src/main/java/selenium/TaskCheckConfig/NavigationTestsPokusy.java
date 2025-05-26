package selenium.TaskCheckConfig;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NavigationTestsPokusy {

    private WebDriver driver;

    @Test
    public void NavigationExercise2() {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://coderslab.com/en");
        //demo
        this.threadSleep(2000);
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        //demo
        this.threadSleep(2000);
        driver.navigate().to("https://hotel-testlab.coderslab.pl/en/");
        //demo
        this.threadSleep(2000);


        driver.quit();

    }

        @Test
        public void NavigationExercise3() {

            WebDriver driver = new ChromeDriver();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


            driver.get("https://www.google.com");
            //demo
            this.threadSleep(2000);
            driver.get("https://coderslab.com/en");
            //demo
            this.threadSleep(2000);
            driver.navigate().back();
            this.threadSleep(2000);
            driver.navigate().to("https://mystore-testlab.coderslab.pl/index.php");
            //demo
            this.threadSleep(2000);
            driver.navigate().back();
            this.threadSleep(2000);
            driver.navigate().forward();
            this.threadSleep(2000);
            driver.get("https://mystore-testlab.coderslab.pl/index.php");
            this.threadSleep(2000);
            driver.navigate().refresh();
            this.threadSleep(2000);

            driver.quit();

        }

    @Test
    public void NavigationExercise4() {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://www.google.com");
        this.threadSleep(2000);
        driver.get("https://coderslab.com/en");
        this.threadSleep(2000);
        driver.navigate().back();
        this.threadSleep(2000);
        driver.navigate().forward();
        this.threadSleep(2000);
        driver.navigate().refresh();
        this.threadSleep(2000);

        driver.quit();

        }
    //demo
    private void threadSleep(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

