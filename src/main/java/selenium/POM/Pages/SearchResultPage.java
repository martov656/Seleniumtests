package selenium.POM.Pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchResultPage extends BasePage{
    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div/p[text()='Sort By:']")
    WebElement labelSortBy;

    public void verifyHotelsSearch() {
        wait.until(ExpectedConditions.visibilityOf(labelSortBy));
        Assertions.assertTrue(labelSortBy.isDisplayed(), "User hotels not searched.");
    }


    }

