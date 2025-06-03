package selenium.POM.Pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchResultPage extends BasePage{
    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "header_logo")
    WebElement headerLogo;

    public void verifyHotelsSearch() {
        wait.until(ExpectedConditions.visibilityOf(headerLogo));
        Assertions.assertTrue(headerLogo.isDisplayed(), "User hotels not searched.");
    }
}
