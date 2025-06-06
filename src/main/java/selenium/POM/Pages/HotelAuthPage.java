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

    @FindBy(id = "email")
    WebElement email;

    @FindBy(id = "passwd")
    WebElement password;

    @FindBy(id = "SubmitLogin")
    WebElement submitLogin;

    public void submit() {
        wait.until(ExpectedConditions.elementToBeClickable(submitButton));

        Random r = new Random();
        int counter = r.nextInt(987654321);
        emailCreate.sendKeys("test" + counter + "@test.com");
        submitButton.click();
    }

    public void login(String email, String password) {
        wait.until(ExpectedConditions.elementToBeClickable(this.email));
        this.email.sendKeys(email);
        wait.until(ExpectedConditions.elementToBeClickable(this.password));
        this.password.sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(submitLogin));
        submitLogin.click();
    }
}

