package selenium.POM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class FormPage extends BasePage {
    public FormPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "first-name")
    WebElement firstNameInput;

    @FindBy(id = "last-name")
    WebElement lastNameInput;

    @FindBy(id = "dob")
    WebElement dateOfBirthInput;

    @FindBy(id = "address")
    WebElement addressInput;

    @FindBy(id = "email")
    WebElement emailInput;

    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy(id = "company")
    WebElement companyInput;

    @FindBy(id = "comment")
    WebElement commentInput;

    @FindBy(id="role")
    WebElement selectRole;


    public void fillInName(String name, String surname) {
        wait.until(ExpectedConditions.elementToBeClickable(firstNameInput));
        firstNameInput.clear();
        firstNameInput.sendKeys(name);
        wait.until(ExpectedConditions.elementToBeClickable(lastNameInput));
        lastNameInput.clear();
        lastNameInput.sendKeys(surname);
    }

    public void fillInDateOfBirth(String dateOfBirth) {
        wait.until(ExpectedConditions.elementToBeClickable(dateOfBirthInput));
        dateOfBirthInput.clear();
        dateOfBirthInput.sendKeys(dateOfBirth);
    }

    public void fillInAddress(String address) {
        wait.until(ExpectedConditions.elementToBeClickable(addressInput));
        addressInput.clear();
        addressInput.sendKeys(address);
    }

    public void fillInEmail(String email) {
        wait.until(ExpectedConditions.elementToBeClickable(emailInput));
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    public void fillInPassword(String password) {
        wait.until(ExpectedConditions.elementToBeClickable(passwordInput));
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public void fillInCompany(String company) {
        wait.until(ExpectedConditions.elementToBeClickable(companyInput));
        companyInput.clear();
        companyInput.sendKeys(company);
    }

    public void fillInComments(String comments) {
        wait.until(ExpectedConditions.elementToBeClickable(commentInput));
        commentInput.clear();
        commentInput.sendKeys(comments);
    }

    public void selectRole(String role){
        Select select = new Select(selectRole);
        select.selectByVisibleText(role);
    }
}
