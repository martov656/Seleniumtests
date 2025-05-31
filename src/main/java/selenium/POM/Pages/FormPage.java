package selenium.POM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FormPage extends BasePage {

    public FormPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "first-name")
    WebElement firstNameInput;

    @FindBy(id = "last-name")
    WebElement lastNameInput;

    @FindBy(xpath = "//label[contains(text(),'Female')]/input")
    private WebElement femaleGenderInput;

    @FindBy(id = "dob")
    WebElement dateOfBirthInput;

    @FindBy(id = "address")
    WebElement addressOfResidenceInput;


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
        addressOfResidenceInput.sendKeys(String.valueOf(9500) + " , " + street + " , " + district + " , " + state + " , "+ String.valueOf(90212) + " ," + country  );

    }
}



