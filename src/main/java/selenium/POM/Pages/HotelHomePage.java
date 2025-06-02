package selenium.POM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HotelHomePage extends BasePage {


    public HotelHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='Sign in']")
    WebElement signIn;




    public void signInButton(){
        wait.until(ExpectedConditions.elementToBeClickable(signIn));
        signIn.click();
    }



}
