package selenium.POM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FormPage extends BasePage{
    public FormPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "first-name")
    WebElement firstNameInput;

    @FindBy(id = "last-name")
    WebElement lastNameInput;


    public void fillInName(String name, String surname){
        wait.until(ExpectedConditions.elementToBeClickable(firstNameInput));
        firstNameInput.clear();
        firstNameInput.sendKeys(name);
        wait.until(ExpectedConditions.elementToBeClickable(lastNameInput));
        lastNameInput.clear();
        lastNameInput.sendKeys(surname);
    }

}
