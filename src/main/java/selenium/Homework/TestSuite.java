package selenium.Homework;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import selenium.BasedSharedMethods;

import java.util.Random;

public class TestSuite extends BasedSharedMethods {

    @Test
    public void ex1() {
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        WebElement element = driver.findElement(By.xpath("//span[text()='Sign in']"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();

        element = driver.findElement(By.xpath("//a[contains(.,'No account? Create one here')]"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();

        element = driver.findElement(By.id("_desktop_logo"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();


    }

}


