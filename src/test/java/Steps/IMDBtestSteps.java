package Steps;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class IMDBtestSteps {

    private WebDriver driver;
    private WebDriverWait wait;

    @Given("the user opens the IMDb homepage")
    public void openIMDbHomepage() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.imdb.com/");
    }

    @When("the user enters {string} into the search field and presses Enter")
    public void enterSearchKeyword(String name) {
        WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
        searchBox.clear();
        searchBox.sendKeys(name);
        searchBox.sendKeys(Keys.ENTER); // simuluje Enter
    }

    @Then("the user should see a link to {string}")
    public void userShouldSeeLink(String name) {
        WebElement result = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[contains(., '" + name + "')]")
        ));
        Assertions.assertTrue(result.isDisplayed(), "Result link for " + name + " was not displayed.");
    }

    @Then("the page should contain {string}")
    public void pageShouldContain(String name) {
        Assertions.assertTrue(driver.getPageSource().contains(name), "Text '" + name + "' not found on page.");
    }

    @And("the browser is closed")
    @Then("the browser is closed") // umožňuje použít oba zápisy v Gherkinu
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    @When("the user searches for the following celebrities:")
    public void userSearchesForCelebrities(DataTable dataTable) {
        List<String> names = dataTable.asList();

        for (String name : names) {
            System.out.println("Searching for: " + name);

            WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
            searchBox.clear();
            searchBox.sendKeys(name);
            searchBox.sendKeys(Keys.ENTER);

            WebElement result = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//a[contains(., '" + name + "')]")
            ));
            Assertions.assertTrue(result.isDisplayed(), "Result not found for: " + name);
            result.click();

            wait.until(ExpectedConditions.titleContains(name));
            Assertions.assertTrue(driver.getPageSource().contains(name), "Name not found on page: " + name);

            driver.get("https://www.imdb.com/");
        }
    }
}






