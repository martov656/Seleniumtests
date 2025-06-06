package Steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BingSearchSteps {

    private WebDriver driver;
    private WebDriverWait wait;

    @Given ("an open browser with bing.com")
    public void openBrowserBingCom() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://bing.com");
    }

    @When("a keyword selenium is entered in input field")
    public void keywordSeleniumSearch(){
        WebElement element = driver.findElement(By.name("q"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.clear();
        element.sendKeys("Selenium");
        element.submit();
    }

    @Then ("user should see results from browser search")
    public void userShouldSeeResults(){
        wait.until(ExpectedConditions.titleContains("Selenium"));
        Assertions.assertTrue(driver.getPageSource().contains("Selenium"),"Searched key not found ...");
    }

    @Then ("close browser")
    public void closeBrowser(){
        driver.quit();
    }
}

