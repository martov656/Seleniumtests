package selenium.Elements;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import selenium.BasedSharedMethods;

public class ElementsTests extends BasedSharedMethods {

    @Test
    public void ex1ElementsById () {

        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement element = driver.findElement(By.id("hotel_location"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.sendKeys("Barcelona");

        element = driver.findElement(By.id("search_room_submit"));
        wait.until(ExpectedConditions.visibilityOf(element));

        element = driver.findElement(By.id("newsletter-input"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.sendKeys("test@test.com");
    }


    @Test
    public void ex2ElementsByName () {

        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement element = driver.findElement(By.name("hotel_location"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.sendKeys("Barcelona");

        element = driver.findElement(By.name("search_room_submit"));
        wait.until(ExpectedConditions.visibilityOf(element));

        element = driver.findElement(By.name("email"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.sendKeys("test@test.com");

        element = driver.findElement(By.name("submitNewsletter"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.submit();


    }


}
