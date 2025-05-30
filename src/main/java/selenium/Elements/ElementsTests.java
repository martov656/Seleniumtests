package selenium.Elements;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import selenium.BasedSharedMethods;

import java.util.Random;

public class ElementsTests extends BasedSharedMethods {

    @Test
    public void ex1ElementsById() {

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
    public void ex2ElementsByName() {

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

    @Test
    public void ex3ElementsByClassName() {
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
    }

    @Test
    public void ex3ElementsByXPath() {
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement element = driver.findElement(By.xpath("//span[text()='Sign in']"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();

        element = driver.findElement(By.xpath("//input[@id='email_create']"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        Random r = new Random();
        int counter = r.nextInt(987654321);
        element.sendKeys("test" + counter + "@test.com");

        element = driver.findElement(By.xpath("//button[contains(.,'Create an account')]"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    @Test
    public void ex4ElementsByXPath() {

        this.ex3ElementsByXPath();

        String title = "Mr.";
        WebElement element = driver.findElement(By.xpath("//label[contains(., '" + title + "')]"));
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
        element.click();
    }

    @Test
    public void ex5ElementsByCSS() {

        this.ex4ElementsByXPath();
        WebElement element = driver.findElement(By.cssSelector("i.icon-user"));
        wait.until(ExpectedConditions.visibilityOf(element));

        element = driver.findElement(By.cssSelector("i.icon-building"));
        wait.until(ExpectedConditions.visibilityOf(element));

        element = driver.findElement(By.cssSelector("a[title='Home'] > span > i.icon-chevron-left"));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
