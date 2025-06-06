package selenium.POM.Pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Date;

public class HotelHomePage extends BasePage {


    public HotelHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='Sign in']")
    WebElement signIn;

    @FindBy(id = "hotel_location")
    WebElement hotelLocation;

    @FindBy(xpath = "//button/span[@id='hotel_cat_name']")
    WebElement hotelCategory;

    @FindBy(id = "check_in_time")
    WebElement checkInDate;

    @FindBy(id = "check_out_time")
    WebElement checkOutDate;

    @FindBy(id = "search_room_submit")
    WebElement searchHotel;

    public void signInButton() {
        wait.until(ExpectedConditions.elementToBeClickable(signIn));
        signIn.click();
    }

    public void verifyHomePageShow() {
        wait.until(ExpectedConditions.visibilityOf(searchHotel));
        Assertions.assertTrue(searchHotel.isDisplayed(), "User creation confirmation not registered.");
    }

    public void searchByButton(String location, String category, String checkIn, String checkOut) {
        wait.until(ExpectedConditions.elementToBeClickable(hotelLocation));
        hotelLocation.sendKeys(location);
        wait.until(ExpectedConditions.elementToBeClickable(hotelCategory));
        hotelCategory.click();
        WebElement element = driver.findElement(By.xpath("//ul[@class='dropdown-menu hotel_dropdown_ul']/li[text()='"+category+"']"));
        element.click();
        wait.until(ExpectedConditions.elementToBeClickable(checkInDate));
        checkInDate.sendKeys(checkIn);
        wait.until(ExpectedConditions.elementToBeClickable(checkOutDate));
        checkOutDate.sendKeys(checkOut);
        wait.until(ExpectedConditions.elementToBeClickable(searchHotel));
        searchHotel.click();
    }
}
