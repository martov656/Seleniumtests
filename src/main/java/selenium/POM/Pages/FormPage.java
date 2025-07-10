package selenium.POM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.Collection;

public class FormPage extends BasePage {

    public FormPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "first-name")
    private WebElement firstNameInput;

    @FindBy(id = "last-name")
    WebElement lastNameInput;

    @FindBy(xpath = "//label[contains(text(),'Female')]/input")
    private WebElement femaleGenderInput;

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

    @FindBy(id = "role")
    WebElement selectRoleInput;

    @FindBy(id = "expectation")
    WebElement selectExpectation;

    @FindBy(xpath = "//label[contains(text(),'Via discovery and experiment')]/input")
    WebElement contributeCheckbox;

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

    public void selectFemaleGender() {
        wait.until(ExpectedConditions.elementToBeClickable(femaleGenderInput));
        femaleGenderInput.click();
    }


    public void fillInDateOfBirth(int day, int month, int year) {
        wait.until(ExpectedConditions.elementToBeClickable(dateOfBirthInput));
        dateOfBirthInput.clear();

        String formattedDate = String.format("%02d.%02d.%d", day, month, year);
        dateOfBirthInput.sendKeys(formattedDate);
    }

    public void addressOfResidence(int number, String street, String district, String state, int postal, String country) {
        wait.until(ExpectedConditions.elementToBeClickable(addressOfResidenceInput));
        addressOfResidenceInput.clear();
        addressOfResidenceInput.sendKeys(String.valueOf(9500) + " , " + street + " , " + district + " , " + state + " , " + String.valueOf(90212) + " ," + country);

    }

    public void emailAddress(String email) {
        wait.until(ExpectedConditions.elementToBeClickable(emailAddressInput));
        emailAddressInput.clear();
        emailAddressInput.sendKeys(email);

    }

    public void passwordForm(String password) {
        wait.until(ExpectedConditions.elementToBeClickable(passwordInput));
        passwordInput.clear();
        passwordInput.sendKeys(password);

    }

    public void companyName(String company) {
        wait.until(ExpectedConditions.elementToBeClickable(companyNameInput));
        companyNameInput.clear();
        companyNameInput.sendKeys(company);

    }



public void selectRole(String expectation) {
    wait.until(ExpectedConditions.elementToBeClickable(selectRoleInput));
    Select select = new Select(selectRoleInput);
    select.selectByVisibleText(expectation);

    }

    public void selectJobExpectation(String... expectations) {
        wait.until(ExpectedConditions.elementToBeClickable(selectExpectation));
        Select select = new Select(selectExpectation);
        for (String expectation : expectations) {
            select.selectByVisibleText(expectation);
        }


    }


    public void selectContributeCheckbox() {
        if (!contributeCheckbox.isSelected()) {
            contributeCheckbox.click();
        }

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

    public boolean isFormDisplayed() {
        return firstNameInput.isDisplayed();
    }

    public Collection<Object> getValidationMessage() {
        return java.util.List.of();
    }

    public void selectExpectations(String challenging) {
    }

    public void selectGender(String female) {
    }

    public WebElement getFirstNameInput() {
        return firstNameInput;
    }


}