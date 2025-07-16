package selenium.TaskCheckConfig;

import com.google.common.base.Predicate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.BasedSharedMethods;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.Duration;
import java.nio.file.Files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.io.File;
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static com.google.common.base.Predicates.equalTo;

public class SearchTests extends BasedSharedMethods {

    @Test
    public void bingSearchTest() {

        driver.get("https://bing.com");
        WebElement element = driver.findElement(By.name("q"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.clear();
        element.sendKeys("Coderslab");
        element.submit();
        wait.until(ExpectedConditions.titleContains("Coderslab"));
        Assertions.assertTrue(driver.getPageSource().contains("Coderslab"), "Searched key not found ...");

    }

    @Test
    public void seznamSearchTests() {
        driver.manage().window().maximize();
        driver.get("https://search.seznam.cz/");
        WebElement element = driver.findElement(By.name("q"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.clear();
        element.sendKeys("Coderslab");
        element.submit();
        wait.until(ExpectedConditions.titleContains("Coderslab"));
        Assertions.assertTrue(driver.getPageSource().contains("Coderslab"), "Searched key not found ...");

    }

    @Test
    public void bingSearchTestBara() throws InterruptedException {

        driver.get("https://bing.com");
        WebElement element = driver.findElement(By.name("q"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        Thread.sleep(5000);
        element.clear();
        element.sendKeys("Bára Pešková");
        Thread.sleep(5000);
        element.submit();
        wait.until(ExpectedConditions.titleContains("Bára Pešková"));
        Assertions.assertTrue(driver.getPageSource().contains("Bára Pešková"), "Searched key not found ...");
        Thread.sleep(5000);

    }

    @Test
    public void bingSearchTestBara2() throws InterruptedException {

        driver.get("https://www.bing.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
        searchBox.clear();
        searchBox.sendKeys("Bára Pešková Instagram");
        searchBox.submit();
        Thread.sleep(5000);

        // Vyčkej na načtení výsledků, můžeš zvýšit timeout pokud je notebook pomalejší
        wait.until(ExpectedConditions.titleContains("Bára Pešková"));

        // Najdi a klikni na odkaz na Instagram
        WebElement instaLink = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(@href, 'instagram.com/barapeskova')]")
        ));
        instaLink.click();
        Thread.sleep(5000);
        // Přepnout na novou záložku (Instagram se často otevře v nové)
        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
        }

        // Počkej, než se načte Instagram
        wait.until(ExpectedConditions.urlContains("instagram.com/barapeskova"));
        Assertions.assertTrue(driver.getCurrentUrl().contains("barapeskova"),
                "Nepodařilo se přejít na Instagram profil.");
        Thread.sleep(5000);

    }


    @Test
    public void googleTests() {
        driver.manage().window().maximize();
        driver.get("https://google.com/");
        WebElement element = driver.findElement(By.name("q"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.clear();
        element.sendKeys("Coderslab");
        element.submit();
        wait.until(ExpectedConditions.titleContains("Coderslab"));
        Assertions.assertTrue(driver.getPageSource().contains("Coderslab"), "Searched key not found ...");

    }

    @Test
    public void googleTests2() {
        WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
        searchBox.clear();
        searchBox.sendKeys("Coderslab");
        searchBox.submit();

        wait.until(ExpectedConditions.titleContains("Coderslab"));
        Assertions.assertTrue(driver.getPageSource().contains("Coderslab"), "Searched key not found ...");
    }

    @Test
    public void seznamSearchTests2() {
        driver.manage().window().maximize();
        driver.get("https://search.seznam.cz/");
        WebElement element = driver.findElement(By.name("q"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.clear();
        element.sendKeys("Reese Witherspoon");
        element.submit();
        wait.until(ExpectedConditions.titleContains("Reese Witherspoon"));
        Assertions.assertTrue(driver.getPageSource().contains("Reese Witherspoon"), "Searched key not found ...");

    }


    @Test
    public void bingSearchTest2() {

        driver.get("https://bing.com");
        WebElement element = driver.findElement(By.name("q"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.clear();
        element.sendKeys("Reese Witherspoon");
        element.submit();
        wait.until(ExpectedConditions.titleContains("Reese Witherspoon"));
        Assertions.assertTrue(driver.getPageSource().contains("Reese Witherspoon"), "Searched key not found ...");


    }

    @Test
    public void bingSearchTest3() {

        driver.get("https://www.csfd.cz/");
        WebElement element = driver.findElement(By.name("q"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.clear();
        element.sendKeys("Reese Witherspoon");
        element.submit();
        wait.until(ExpectedConditions.titleContains("Reese Witherspoon"));
        Assertions.assertTrue(driver.getPageSource().contains("Reese Witherspoon"), "Searched key not found ...");

    }

    @Test
    public void bingSearchTest4() {

        driver.get("https://www.csfd.cz/");
        WebElement element = driver.findElement(By.name("q"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.clear();
        element.sendKeys("Jason Robards");
        element.submit();
        wait.until(ExpectedConditions.titleContains("Jason Robards"));
        Assertions.assertTrue(driver.getPageSource().contains("Jason Robards"), "Searched key not found ...");


    }

    @Test
    public void googleSearchWithCookieAccept() throws InterruptedException {
        driver.get("https://www.bing.com/");

        // počkej, a skryj případné overlaye
        Thread.sleep(1000);
        ((JavascriptExecutor) driver).executeScript(
                "const el = document.querySelector('div[role=dialog], iframe'); if(el) el.style.display='none';"
        );

        try {
            WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(8));
            WebElement cookieButton = shortWait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//div[contains(text(), 'Souhlasím')] | //button[contains(text(), 'Accept all')] | //button[contains(text(), 'Přijmout vše')]")
            ));
            cookieButton.click();
            System.out.println("Cookie lišta byla odkliknuta.");
        } catch (TimeoutException | NoSuchElementException e) {
            System.out.println("Cookie lišta nebyla nalezena nebo je jiná varianta.");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement searchInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
        wait.until(ExpectedConditions.elementToBeClickable(searchInput));

        System.out.println("Search input displayed: " + searchInput.isDisplayed());
        System.out.println("Search input enabled: " + searchInput.isEnabled());

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", searchInput);
        searchInput.click();
        searchInput.clear();
        searchInput.sendKeys("Jason Robards");


        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));
        searchButton.click();

        wait.until(ExpectedConditions.titleContains("Jason Robards"));
        Assertions.assertTrue(driver.getPageSource().contains("Jason Robards"), "Search result doesn't contain the keyword.");
    }


    @Test
    public void divSearchTest5() {

        driver.get("https://div.cz/");
        WebElement element = driver.findElement(By.name("q"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.clear();
        element.sendKeys("Prolhané krásky: Prvotní hřích");
        element.submit();
        wait.until(ExpectedConditions.titleContains("Prolhané krásky: Prvotní hřích"));
        Assertions.assertTrue(driver.getPageSource().contains("Prolhané krásky: Prvotní hřích"), "Searched key not found ...");


    }

    @Test
    public void divSearchTest6() {

        driver.get("https://div.cz/");
        WebElement element = driver.findElement(By.name("q"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.clear();
        element.sendKeys("Scarlett Johansson");
        element.submit();
        wait.until(ExpectedConditions.titleContains("Scarlett Johansson"));
        Assertions.assertTrue(driver.getPageSource().contains("Scarlett Johansson"), "Searched key not found ...");


    }

    @Test
    public void divSearchTest7() {

        driver.get("https://div.cz/");
        WebElement element = driver.findElement(By.name("q"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.clear();
        element.sendKeys("Stephen King");
        element.submit();
        wait.until(ExpectedConditions.titleContains("Stephen King"));
        Assertions.assertTrue(driver.getPageSource().contains("Stephen King"), "Searched key not found ...");


    }

    @Test
    public void allSearchTest9() {

        driver.get("https://bing.com");
        WebElement element = driver.findElement(By.name("q"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.clear();
        element.sendKeys("Judas Priest");
        element.submit();
        wait.until(ExpectedConditions.titleContains("Judas Priest"));
        Assertions.assertTrue(driver.getPageSource().contains("Judas Priest"), "Searched key not found ...");


    }

    @Test
    public void imdbSearchTestReese() throws InterruptedException {
        driver.get("https://www.imdb.com/");
        Thread.sleep(5000);
        ((JavascriptExecutor) driver).executeScript(
                "const el = document.querySelector('div[role=dialog], iframe'); if(el) el.style.display='none';"
        );
        WebElement searchBox = driver.findElement(By.name("q"));
        wait.until(ExpectedConditions.elementToBeClickable(searchBox));
        searchBox.clear();
        searchBox.sendKeys("Reese Witherspoon");
        Thread.sleep(5000);
        searchBox.submit();
        Thread.sleep(5000);
        // počkej, až se výsledky načtou (hledání přes selector nebo text)
        WebElement result = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[contains(text(), 'Reese Witherspoon')]")
        ));

        Assertions.assertTrue(result.isDisplayed(), "Reese Witherspoon nebyla nalezena ve výsledcích hledání.");
    }


    @Test
    public void imdbSearchTestElvis() {
        driver.get("https://www.imdb.com/");

        WebElement searchBox = driver.findElement(By.name("q"));
        wait.until(ExpectedConditions.elementToBeClickable(searchBox));
        searchBox.clear();
        searchBox.sendKeys("Elvis Presley");
        searchBox.submit();

        // počkej, až se výsledky načtou (hledání přes selector nebo text)
        WebElement result = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[contains(text(), 'Elvis Presley')]")
        ));

        Assertions.assertTrue(result.isDisplayed(), "Elvis Presley nebyl nalezen ve výsledcích hledání.");
    }

    @Test
    public void fdbSearchTestElvis() {
        driver.get("https://www.fdb.cz/");
        WebElement searchBox = driver.findElement(By.name("q"));
        wait.until(ExpectedConditions.elementToBeClickable(searchBox));
        searchBox.clear();
        searchBox.sendKeys("Elvis Presley");
        searchBox.submit();

        // počkej, až se výsledky načtou (hledání přes selector nebo text)
        WebElement result = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[contains(text(), 'Elvis Presley')]")
        ));

        Assertions.assertTrue(result.isDisplayed(), "Elvis Presley nebyl nalezen ve výsledcích hledání.");
    }

    @Test
    public void fdbSearchTestElvis2() {
        driver.get("https://www.fdb.cz/");

        try {
            WebElement cookieBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Souhlasím')]")));
            cookieBtn.click();
        } catch (Exception e) {
            System.out.println("Cookie lišta se nezobrazila nebo už byla skrytá.");
        }

        WebElement searchBox = driver.findElement(By.name("search_text"));
        wait.until(ExpectedConditions.elementToBeClickable(searchBox));
        searchBox.clear();
        searchBox.sendKeys("Elvis Presley");
        searchBox.submit();

        // čekej na výsledek, například že stránka obsahuje "Elvis Presley"
        wait.until(ExpectedConditions.titleContains("Elvis Presley"));

        Assertions.assertTrue(driver.getPageSource().contains("Elvis Presley"), "Elvis Presley nebyl nalezen.");
    }

    @Test
    public void imdbSearchTestKate() throws InterruptedException {
        driver.get("https://www.imdb.com/");
        Thread.sleep(5000);
        ((JavascriptExecutor) driver).executeScript(
                "const el = document.querySelector('div[role=dialog], iframe'); if(el) el.style.display='none';"
        );
        WebElement searchBox = driver.findElement(By.name("q"));
        wait.until(ExpectedConditions.elementToBeClickable(searchBox));
        searchBox.clear();
        searchBox.sendKeys("Kate Beckinsale");
        Thread.sleep(5000);
        searchBox.submit();
        Thread.sleep(5000);
        // počkej, až se výsledky načtou (hledání přes selector nebo text)
        WebElement result = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[contains(text(), 'Kate Beckinsale')]")
        ));

        Assertions.assertTrue(result.isDisplayed(), "Kate Beckinsale nebyla nalezena ve výsledcích hledání.");
    }

    @Test
    public void imdbSearchTestKateProfileClick() throws InterruptedException {
        driver.get("https://www.imdb.com/");

        // Odstraní modální dialog, pokud se objeví (např. GDPR, cookies)
        Thread.sleep(5000);
        ((JavascriptExecutor) driver).executeScript(
                "const el = document.querySelector('div[role=dialog], iframe'); if(el) el.style.display='none';"
        );

        // Najdi vyhledávací pole a zadej hledaný výraz
        WebElement searchBox = driver.findElement(By.name("q"));
        wait.until(ExpectedConditions.elementToBeClickable(searchBox));
        searchBox.clear();
        searchBox.sendKeys("Kate Beckinsale");
        Thread.sleep(5000);
        searchBox.submit();
        Thread.sleep(5000);
        // Počkej, než se zobrazí odkaz s herečkou
        WebElement result = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[contains(text(), 'Kate Beckinsale')]")
        ));

        Assertions.assertTrue(result.isDisplayed(), "Kate Beckinsale nebyla nalezena ve výsledcích hledání.");

        // Klikni na odkaz
        result.click();
        Thread.sleep(5000);
        // Počkej, až se načte profil herečky
        wait.until(ExpectedConditions.titleContains("Kate Beckinsale"));
        Thread.sleep(5000);
        // Ověř, že stránka profilu obsahuje jméno herečky
        Assertions.assertTrue(driver.getPageSource().contains("Kate Beckinsale"),
                "Stránka profilu herečky nebyla správně načtena.");
    }

    @Test
    public void imdbSearchTestKateProfileNoThreads() throws InterruptedException {
        driver.get("https://www.imdb.com/");

        // Odstraní modální dialog, pokud se objeví (např. GDPR, cookies)

        ((JavascriptExecutor) driver).executeScript(
                "const el = document.querySelector('div[role=dialog], iframe'); if(el) el.style.display='none';"
        );

        // Najdi vyhledávací pole a zadej hledaný výraz
        WebElement searchBox = driver.findElement(By.name("q"));
        wait.until(ExpectedConditions.elementToBeClickable(searchBox));
        searchBox.clear();
        searchBox.sendKeys("Kate Beckinsale");
        searchBox.submit();

        // Počkej, než se zobrazí odkaz s herečkou
        WebElement result = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[contains(text(), 'Kate Beckinsale')]")
        ));

        Assertions.assertTrue(result.isDisplayed(), "Kate Beckinsale nebyla nalezena ve výsledcích hledání.");

        // Klikni na odkaz
        result.click();

        // Počkej, až se načte profil herečky
        wait.until(ExpectedConditions.titleContains("Kate Beckinsale"));

        // Ověř, že stránka profilu obsahuje jméno herečky
        Assertions.assertTrue(driver.getPageSource().contains("Kate Beckinsale"),
                "Stránka profilu herečky nebyla správně načtena.");
    }

    @Test
    public void imdbSearchTestKateProfileMetaKnownFor() throws InterruptedException {
        driver.get("https://www.imdb.com/");

        Thread.sleep(4000);
        ((JavascriptExecutor) driver).executeScript(
                "const el = document.querySelector('div[role=dialog], iframe'); if(el) el.style.display='none';"
        );

        WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
        searchBox.clear();
        searchBox.sendKeys("Kate Beckinsale");
        searchBox.submit();

        WebElement resultLink = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[contains(text(), 'Kate Beckinsale')]")
        ));
        resultLink.click();

        wait.until(ExpectedConditions.titleContains("Kate Beckinsale"));

        // Získání obsahu meta tagu twitter:description
        WebElement metaTag = driver.findElement(By.cssSelector("meta[property='twitter:description']"));
        String metaContent = metaTag.getAttribute("content");
        System.out.println("Meta twitter:description: " + metaContent);

        Assertions.assertTrue(metaContent.contains("Love & Friendship"), "Meta tag neobsahuje očekávaný film.");
        Assertions.assertTrue(metaContent.contains("Underworld"), "Meta tag neobsahuje očekávaný film.");
    }

    @Test
    public void seznamSearchTests3() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://www.super.cz/");

        // Vyhledávací pole podle nového selektoru
        WebElement searchField = wait.until(ExpectedConditions.elementToBeClickable(
                By.name("ribbon--search")));

        // Zadání dotazu
        searchField.clear();
        searchField.sendKeys("Kate Beckinsale");
        searchField.sendKeys(Keys.ENTER); // submit nefunguje na tomhle webu
        Thread.sleep(4000);
        // Čekání na změnu titulku
        wait.until(ExpectedConditions.or(
                ExpectedConditions.titleContains("Kate Beckinsale"),
                ExpectedConditions.presenceOfElementLocated(By.cssSelector("main"))
        ));

        // Ověření výskytu textu
        Assertions.assertTrue(driver.getPageSource().toLowerCase().contains("kate beckinsale"),
                "Searched key not found ...");
    }

    @Test
    public void seznamSearchTests4() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://www.super.cz/");

        // Vyhledávací pole podle nového selektoru
        WebElement searchField = wait.until(ExpectedConditions.elementToBeClickable(
                By.name("ribbon--search")));

        // Zadání dotazu
        searchField.clear();
        searchField.sendKeys("Reese Witherspoon");
        searchField.sendKeys(Keys.ENTER); // submit nefunguje na tomhle webu
        Thread.sleep(4000);
        // Čekání na změnu titulku
        wait.until(ExpectedConditions.or(
                ExpectedConditions.titleContains("Reese Witherspoon"),
                ExpectedConditions.presenceOfElementLocated(By.cssSelector("main"))
        ));

        // Ověření výskytu textu
        Assertions.assertTrue(driver.getPageSource().toLowerCase().contains("reese witherspoon"),
                "Searched key not found ...");
    }

    @Test
    public void seznamSearchTests5() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://www.super.cz/");

        // Vyhledávací pole podle nového selektoru
        WebElement searchField = wait.until(ExpectedConditions.elementToBeClickable(
                By.name("ribbon--search")));

        // Zadání dotazu
        searchField.clear();
        searchField.sendKeys("Little Caprice");
        searchField.sendKeys(Keys.ENTER); // submit nefunguje na tomhle webu
        Thread.sleep(4000);
        // Čekání na změnu titulku
        wait.until(ExpectedConditions.or(
                ExpectedConditions.titleContains("Little Caprice"),
                ExpectedConditions.presenceOfElementLocated(By.cssSelector("main"))
        ));

        // Ověření výskytu textu
        Assertions.assertTrue(driver.getPageSource().toLowerCase().contains("little caprice"),
                "Searched key not found ...");


    }

    @Test
    public void seznamSearchTests6() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://www.super.cz/");

        // Vyhledávací pole podle nového selektoru
        WebElement searchField = wait.until(ExpectedConditions.elementToBeClickable(
                By.name("ribbon--search")));

        // Zadání dotazu
        searchField.clear();
        searchField.sendKeys("Paul McCartney");
        searchField.sendKeys(Keys.ENTER); // submit nefunguje na tomhle webu
        Thread.sleep(4000);
        // Čekání na změnu titulku
        wait.until(ExpectedConditions.or(
                ExpectedConditions.titleContains("Paul McCartney"),
                ExpectedConditions.presenceOfElementLocated(By.cssSelector("main"))
        ));

        // Ověření výskytu textu
        Assertions.assertTrue(driver.getPageSource().toLowerCase().contains("paul mccartney"),
                "Searched key not found ...");


    }



@Test
public void seznamSearchTests7() throws InterruptedException {
    driver.manage().window().maximize();
    driver.get("https://www.super.cz/");

    // Vyhledávací pole podle nového selektoru
    WebElement searchField = wait.until(ExpectedConditions.elementToBeClickable(
            By.name("ribbon--search")));

    // Zadání dotazu
    searchField.clear();
    searchField.sendKeys("Ashley Harkleroad");
    searchField.sendKeys(Keys.ENTER); // submit nefunguje na tomhle webu
    Thread.sleep(4000);
    // Čekání na změnu titulku
    wait.until(ExpectedConditions.or(
            ExpectedConditions.titleContains("Ashley Harkleroad"),
            ExpectedConditions.presenceOfElementLocated(By.cssSelector("main"))
    ));

    // Ověření výskytu textu
    Assertions.assertTrue(driver.getPageSource().toLowerCase().contains("ashley harkleroad"),
            "Searched key not found ...");


}

    @Test
    public void seznamSearchClickFirstArticleTest() {
        driver.manage().window().maximize();
        driver.get("https://www.super.cz/");

        // Vyhledávací pole
        WebElement searchField = wait.until(ExpectedConditions.elementToBeClickable(
                By.name("ribbon--search")));

        // Zadání hledaného výrazu a Enter
        searchField.clear();
        searchField.sendKeys("Paul McCartney");
        searchField.sendKeys(Keys.ENTER);

        // Čekání na výsledky
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("main")));

        // Vyhledání odkazů na články
        List<WebElement> articleLinks = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
                By.cssSelector("main a[href*='super.cz/clanek']")));

        Assertions.assertFalse(articleLinks.isEmpty(), "Nebyl nalezen žádný článek ve výsledcích.");

        // Kliknutí na první nalezený článek
        WebElement firstArticle = articleLinks.get(0);
        String url = firstArticle.getAttribute("href");
        firstArticle.click();

        // Čekání na přesměrování na článek
        wait.until(ExpectedConditions.urlToBe(url));

        // Ověření, že URL odpovídá
        Assertions.assertTrue(driver.getCurrentUrl().contains("super.cz/clanek"),
                "Nepodařilo se otevřít článek.");
    }

    @Test
    public void seznamSearchClickFirstArticleTest2() {
        driver.manage().window().maximize();
        driver.get("https://www.super.cz/");

        WebElement searchField = wait.until(ExpectedConditions.elementToBeClickable(By.name("ribbon--search")));
        searchField.clear();
        searchField.sendKeys("Paul McCartney");
        searchField.sendKeys(Keys.ENTER);

        // Počkej na první článek (odkaz obsahující 'super.cz/clanek')
        List<WebElement> articleLinks = wait.until(
                ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("a[href*='super.cz/clanek']"))
        );

        Assertions.assertFalse(articleLinks.isEmpty(), "Nebyly nalezeny žádné články.");

        WebElement firstArticle = articleLinks.get(0);
        String url = firstArticle.getAttribute("href");
        firstArticle.click();

        wait.until(ExpectedConditions.urlContains("super.cz/clanek"));

        Assertions.assertTrue(driver.getCurrentUrl().contains("super.cz/clanek"),
                "Nepodařilo se otevřít článek.");
    }

}
