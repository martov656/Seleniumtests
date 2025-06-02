package selenium.POM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HotelAccountPage extends BasePage{
    public HotelAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElement firstName;

    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement lastName;

    @FindBy(xpath = "//input[@id='passwd']")
    WebElement password;

    @FindBy(xpath = "//button[contains(.,'Register')]")
    WebElement registerButton;

    public void registerUser(String firstName, String lastName, String password){
        wait.until(ExpectedConditions.elementToBeClickable(this.firstName));
        this.firstName.sendKeys(firstName);
        wait.until(ExpectedConditions.elementToBeClickable(this.lastName));
        this.lastName.sendKeys(lastName);
        wait.until(ExpectedConditions.elementToBeClickable(this.password));
        this.password.sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(this.registerButton));
        this.registerButton.click();

    }
}
