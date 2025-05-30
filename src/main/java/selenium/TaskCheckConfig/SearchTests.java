package selenium.TaskCheckConfig;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import selenium.BasedSharedMethods;

public class SearchTests extends BasedSharedMethods {

    @Test
    public void bingSearchTest(){

        driver.get("https://bing.com");
        WebElement element = driver.findElement(By.name("q"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.clear();
        element.sendKeys("Coderslab");
        element.submit();
        wait.until(ExpectedConditions.titleContains("Coderslab"));
        Assertions.assertTrue(driver.getPageSource().contains("Coderslab"),"Searched key not found ...");

    }

    @Test
    public void seznamSearchTests(){
        driver.manage().window().maximize();
        driver.get("https://search.seznam.cz/");
        WebElement element = driver.findElement(By.name("q"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.clear();
        element.sendKeys("Coderslab");
        element.submit();
        wait.until(ExpectedConditions.titleContains("Coderslab"));
        Assertions.assertTrue(driver.getPageSource().contains("Coderslab"),"Searched key not found ...");

    }
}
