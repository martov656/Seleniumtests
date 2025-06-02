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

    @FindBy(xpath = "//label[contains(text(),'Male')]/input")
    private WebElement MaleGenderInput;

    @FindBy(id = "dob")
    WebElement dateOfBirthInput;

    @FindBy(id = "address")
    WebElement addressOfResidenceInput;

    @FindBy(id = "email")
    WebElement emailAddressInput;

    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy(id = "company")
    WebElement companyNameInput;

    @FindBy(id = "comment")
    WebElement commentInput;

    @FindBy(id = "submit")
    WebElement submitButton;

    public void fillInName(String name, String surname) {
        wait.until(ExpectedConditions.elementToBeClickable(firstNameInput));
        firstNameInput.clear();
        firstNameInput.sendKeys(name);
        wait.until(ExpectedConditions.elementToBeClickable(lastNameInput));
        lastNameInput.clear();
        lastNameInput.sendKeys(surname);
    }

    public void selectMaleGender() {
        wait.until(ExpectedConditions.elementToBeClickable(MaleGenderInput));
        MaleGenderInput.click();
    }


    public void fillInDateOfBirth(String date) {
        wait.until(ExpectedConditions.elementToBeClickable(dateOfBirthInput));
        dateOfBirthInput.clear();
        dateOfBirthInput.sendKeys(date);
    }

    public void addressOfResidence(int number, String street) {
        wait.until(ExpectedConditions.elementToBeClickable(addressOfResidenceInput));
        addressOfResidenceInput.clear();
        addressOfResidenceInput.sendKeys(String.valueOf(51) + " , " + street);

    }

    public void emailAddress(String email) {
        wait.until(ExpectedConditions.elementToBeClickable(emailAddressInput));
        emailAddressInput.clear();
        emailAddressInput.sendKeys("john.smith@mailinator.com");

    }

    public void passwordForm(String password) {
        wait.until(ExpectedConditions.elementToBeClickable(passwordInput));
        passwordInput.clear();
        passwordInput.sendKeys("Pass123");

    }

    public void companyName(String company) {
        wait.until(ExpectedConditions.elementToBeClickable(companyNameInput));
        companyNameInput.clear();
        companyNameInput.sendKeys("Coders Lab");

    }

    public void fillInComment(String text) {
        wait.until(ExpectedConditions.elementToBeClickable(commentInput));
        commentInput.clear();
        commentInput.sendKeys(text);

    }

    public void clickSubmitButton() {
        wait.until(ExpectedConditions.elementToBeClickable(submitButton));
        submitButton.click();

    }

}