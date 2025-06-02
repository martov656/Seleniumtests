package selenium.POM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Random;

public class HotelAuthPage extends BasePage {

    public HotelAuthPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email_create")
    WebElement emailCreate;

    @FindBy(name = "SubmitCreate")
    WebElement submitButton;

    public void submit(){
    wait.until(ExpectedConditions.elementToBeClickable(submitButton));

    Random r = new Random();
    int counter = r.nextInt(987654321);
        emailCreate.sendKeys("test"+counter +"@test.com");
        submitButton.click();
}

}

