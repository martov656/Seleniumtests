package selenium.Functions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import selenium.BasedSharedMethods;
import selenium.Elements.ElementsTests;

import java.util.Random;

public class TestFunctions extends BasedSharedMethods {


    @Test
    public void ex1Functions() {

        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement element = driver.findElement(By.className("user_login"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();

        element = driver.findElement(By.className("account_input"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        Random r = new Random();
        int counter = r.nextInt(987654321);
        element.sendKeys("test" + counter + "@test.com");

        element = driver.findElement(By.className("icon-user"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();

        String title = "Mr.";
        element = driver.findElement(By.xpath("//label[contains(., '" + title + "')]"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();

        element = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.sendKeys("Petr");

        element = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.sendKeys("Pollak");

        element = driver.findElement(By.xpath("//input[@id='passwd']"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.sendKeys("Heslo12345");

        element = driver.findElement(By.xpath("//button[contains(.,'Register')]"));
        wait.until(ExpectedConditions.elementToBeClickable(element));

        Assertions.assertTrue(element.isDisplayed(), "Register button is not visible!");
        element.click();
        element = driver.findElement(By.xpath("//p[contains(@class,'alert-success') and contains(.,'Your account has been created.')]"));
        wait.until(ExpectedConditions.visibilityOf(element));
        Assertions.assertTrue(element.isDisplayed(), "User not registered.");

    }

}
