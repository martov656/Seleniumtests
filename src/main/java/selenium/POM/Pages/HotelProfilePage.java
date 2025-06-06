package selenium.POM.Pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HotelProfilePage extends BasePage {
    public HotelProfilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//p[contains(@class,'alert-success')]")
    WebElement confirmationUserCreate;

    @FindBy(xpath = "//a/span[contains(.,'Home')]")
    WebElement buttonGoHome;

    public void verifyUserCreated() {
        wait.until(ExpectedConditions.visibilityOf(confirmationUserCreate));
        Assertions.assertTrue(confirmationUserCreate.isDisplayed(), "User creation confirmation not registered.");
    }

    public void goHomePage() {
        wait.until(ExpectedConditions.visibilityOf(buttonGoHome));
        buttonGoHome.click();
    }

    public void verifyUserCreate() {
    }
}
