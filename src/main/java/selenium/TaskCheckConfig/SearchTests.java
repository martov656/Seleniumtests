package selenium.TaskCheckConfig;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.BasedSharedMethods;

import java.time.Duration;
import java.util.List;

public class SearchTests extends BasedSharedMethods {

    @Test
    public void bingSearchTest9(){

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
    public void seznamSearchTests9(){
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
    public void divSearchTest6() throws InterruptedException {

        driver.get("https://csfd.cz/");
        try {
            WebElement acceptCookies = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[contains(text(),'Accept') or contains(text(),'Souhlasím')]")
            ));
            acceptCookies.click();
        } catch (TimeoutException e) {
            System.out.println("Cookies banner se nezobrazil nebo už byl potvrzen.");
        }
        WebElement element = driver.findElement(By.name("q"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.clear();
        element.sendKeys("Scarlett Johansson");
        element.submit();

        wait.until(ExpectedConditions.titleContains("Scarlett Johansson"));
        Assertions.assertTrue(driver.getPageSource().contains("Scarlett Johansson"), "Searched key not found ...");


    }

    @Test
    public void divSearchTestCS() throws InterruptedException {
        driver.get("https://csfd.cz/");

        try {
            // Přijetí cookies – podle ID a textu
            WebElement acceptCookies = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[@id='didomi-notice-agree-button' or span[contains(text(),'Rozumím a přijímám')]]")
            ));
            acceptCookies.click();
            System.out.println("Cookies byly přijaty.");
        } catch (TimeoutException e) {
            System.out.println("Cookies banner se nezobrazil nebo už byl potvrzen.");
        }

        WebElement element = driver.findElement(By.name("q"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.clear();
        element.sendKeys("Scarlett Johansson");
        element.submit();

        wait.until(ExpectedConditions.titleContains("Scarlett Johansson"));
        Assertions.assertTrue(driver.getPageSource().contains("Scarlett Johansson"), "Searched key not found ...");
    }

    @Test
    public void divSearchTestsc2() {
        driver.get("https://csfd.cz/");

        try {
            // Přijetí cookies přes ID
            WebElement acceptCookies = wait.until(ExpectedConditions.elementToBeClickable(
                    By.id("didomi-notice-agree-button")
            ));
            acceptCookies.click();
            System.out.println("Cookies byly přijaty.");
        } catch (TimeoutException e) {
            System.out.println("Cookies banner se nezobrazil nebo už byl potvrzen.");
        }

        // Vyhledání herečky
        WebElement element = driver.findElement(By.name("q"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.clear();
        element.sendKeys("Scarlett Johansson");
        element.submit();

        // Ověření výsledků
        wait.until(ExpectedConditions.titleContains("Scarlett Johansson"));
        Assertions.assertTrue(driver.getPageSource().contains("Scarlett Johansson"), "Herečka nebyla nalezena.");

        // Debug
        System.out.println("Herečka byla nalezena.");
    }




    @Test
    public void testClickActressFromFilmCreators() {
        driver.get("https://csfd.cz/");

        try {
            WebElement acceptCookies = wait.until(ExpectedConditions.elementToBeClickable(
                    By.id("didomi-notice-agree-button")
            ));
            acceptCookies.click();
        } catch (TimeoutException e) {
            System.out.println("Cookies už byly potvrzeny nebo se nezobrazily.");
        }

        // Vyhledání filmu
        WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
        searchBox.clear();
        searchBox.sendKeys("Manželská historie"); // nebo jiný film s herečkou
        searchBox.submit();

        // Klik na odkaz filmu (pokud tam nejsme rovnou)
        try {
            WebElement filmLink = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//a[contains(@href,'/film/') and contains(.,'Manželská historie')]")
            ));
            filmLink.click();
        } catch (Exception e) {
            System.out.println("Zřejmě jsme už na stránce filmu.");
        }

        // Scroll dolů – pro jistotu
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight / 2);");

        // Počkej na profil herečky ve tvůrcích
        try {
            WebElement actressLink = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//section[contains(@class,'creators')]//a[contains(.,'Scarlett Johansson')]")
            ));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", actressLink);
            wait.until(ExpectedConditions.elementToBeClickable(actressLink)).click();

            // Ověření přesměrování
            wait.until(ExpectedConditions.titleContains("Scarlett Johansson"));
            System.out.println("Kliknutí na profil herečky proběhlo.");
        } catch (Exception e) {
            System.out.println("Herečka v sekci Tvůrci nebyla nalezena: " + e.getMessage());
        }
    }

    @Test
    public void testClickActressFromCreatorsSection() {
        driver.get("https://csfd.cz/");

        // Přijetí cookies
        try {
            WebElement acceptCookies = wait.until(ExpectedConditions.elementToBeClickable(
                    By.id("didomi-notice-agree-button")
            ));
            acceptCookies.click();
            System.out.println("Cookies byly přijaty.");
        } catch (TimeoutException e) {
            System.out.println("Cookies banner nebyl zobrazen nebo už byl přijat.");
        }

        // Vyhledání filmu
        WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
        searchBox.clear();
        searchBox.sendKeys("Black Widow");
        searchBox.submit();

        // Kliknutí na výsledek filmu
        try {
            WebElement filmLink = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//a[contains(@href,'/film/') and contains(.,'Black Widow')]")
            ));
            filmLink.click();
            System.out.println("Kliknuto na odkaz filmu.");
        } catch (Exception e) {
            System.out.println("Film nebyl nalezen nebo kliknutí selhalo: " + e.getMessage());
            return;
        }

        // Scroll dolů – polovina stránky
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight / 2);");

        // Kliknutí na herečku ve tvůrcích
        try {
            WebElement actressLink = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//section[contains(@class,'creators')]//a[contains(.,'Scarlett Johansson')]")
            ));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", actressLink);
            wait.until(ExpectedConditions.elementToBeClickable(actressLink)).click();
            System.out.println("Kliknuto na profil herečky.");

            // Ověření přesměrování
            wait.until(ExpectedConditions.titleContains("Scarlett Johansson"));
            Assertions.assertTrue(driver.getPageSource().contains("Scarlett Johansson"), "Profil herečky nebyl načten.");
        } catch (Exception e) {
            System.out.println("Herečka nebyla nalezena v sekci Tvůrci: " + e.getMessage());
        }
    }

    @Test
    public void testClickActressFromCreatorsSection2() {
        driver.get("https://csfd.cz/");

        // Přijetí cookies
        try {
            WebElement acceptCookies = wait.until(ExpectedConditions.elementToBeClickable(
                    By.id("didomi-notice-agree-button")
            ));
            acceptCookies.click();
        } catch (TimeoutException ignored) {}

        // Vyhledání filmu
        WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
        searchBox.clear();
        searchBox.sendKeys("Scarlett Johansson");
        searchBox.submit();

        // Kliknutí na výsledek filmu
        try {
            WebElement filmLink = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//a[contains(@href,'/film/') and contains(.,'Scarlett Johansson')]")
            ));
            filmLink.click();
        } catch (Exception e) {
            System.out.println("Film nebyl nalezen nebo kliknutí selhalo: " + e.getMessage());
            return;
        }

        // Scroll až na konec stránky kvůli lazy-load sekci "Tvůrci"
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");

        // Počkáme na načtení sekce „Tvůrci“
        try {
            WebElement creatorsSection = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//h2[contains(text(),'Tvůrci')]")
            ));

            // Najdeme herečku a klikneme
            WebElement actressLink = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//section//a[contains(.,'Scarlett Johansson')]")
            ));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", actressLink);
            actressLink.click();

            // Ověříme, že jsme na profilu herečky
            wait.until(ExpectedConditions.titleContains("Scarlett Johansson"));
            Assertions.assertTrue(driver.getPageSource().contains("Scarlett Johansson"));
        } catch (Exception e) {
            System.out.println("Herečka nebyla nalezena v sekci Tvůrci: " + e.getMessage());
        }
    }

    @Test
    public void testClickActressFromCreatorsSection3() {
        driver.get("https://csfd.cz/");

        // Přijetí cookies
        try {
            WebElement acceptCookies = wait.until(ExpectedConditions.elementToBeClickable(
                    By.id("didomi-notice-agree-button")
            ));
            acceptCookies.click();
        } catch (TimeoutException ignored) {}

        // Vyhledání filmu
        WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
        searchBox.clear();
        searchBox.sendKeys("Kate Beckinsale");
        searchBox.submit();

        // Kliknutí na výsledek filmu
        try {
            WebElement filmLink = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//a[contains(@href,'/film/') and contains(.,'Kate Beckinsale')]")
            ));
            filmLink.click();
        } catch (Exception e) {
            System.out.println("Film nebyl nalezen nebo kliknutí selhalo: " + e.getMessage());
            return;
        }

        // Scroll až na konec stránky kvůli lazy-load sekci "Tvůrci"
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");

        // Počkáme na načtení sekce „Tvůrci“
        try {
            WebElement creatorsSection = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//h2[contains(text(),'Tvůrci')]")
            ));

            // Najdeme herečku a klikneme
            WebElement actressLink = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//section//a[contains(.,'Kate Beckinsale')]")
            ));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", actressLink);
            actressLink.click();

            // Ověříme, že jsme na profilu herečky
            wait.until(ExpectedConditions.titleContains("Kate Beckinsale"));
            Assertions.assertTrue(driver.getPageSource().contains("Kate Beckinsale"));
        } catch (Exception e) {
            System.out.println("Herečka nebyla nalezena v sekci Tvůrci: " + e.getMessage());
        }
    }

    @Test
    public void testClickOnActressProfile() {
        driver.get("https://www.csfd.cz/");

        // Přijetí cookies
        try {
            WebElement acceptCookies = wait.until(ExpectedConditions.elementToBeClickable(
                    By.id("didomi-notice-agree-button")
            ));
            acceptCookies.click();
        } catch (TimeoutException ignored) {}

        // Vyhledání herečky podle jména
        WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
        searchBox.clear();
        searchBox.sendKeys("Kate Beckinsale");
        searchBox.submit();

        // Kliknutí na odkaz vedoucí na profil herečky
        try {
            WebElement actressProfileLink = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//a[contains(@href, '/tvurce/') and contains(.,'Kate Beckinsale')]")
            ));
            actressProfileLink.click();

            // Ověříme, že jsme na profilu herečky
            wait.until(ExpectedConditions.titleContains("Kate Beckinsale"));
            Assertions.assertTrue(driver.getPageSource().contains("Kate Beckinsale"));
            System.out.println("Test úspěšně prošel – profil herečky otevřen.");
        } catch (Exception e) {
            System.out.println("Nepodařilo se najít nebo otevřít profil herečky: " + e.getMessage());
        }
    }



    @Test
    public void divSearchTestCS2()  {
        driver.get("https://csfd.cz/");

        try {
            // Přijetí cookies – podle ID a textu
            WebElement acceptCookies = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[@id='didomi-notice-agree-button' or span[contains(text(),'Rozumím a přijímám')]]")
            ));
            acceptCookies.click();
            System.out.println("Cookies byly přijaty.");
        } catch (TimeoutException e) {
            System.out.println("Cookies banner se nezobrazil nebo už byl potvrzen.");
        }

        WebElement element = driver.findElement(By.name("q"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.clear();
        element.sendKeys("Canary Black");
        element.submit();

        wait.until(ExpectedConditions.titleContains("Canary Black"));
        Assertions.assertTrue(driver.getPageSource().contains("Canary Black"), "Searched key not found ...");

    }

    @Test
    public void divSearchTestCS3() throws InterruptedException {
        driver.get("https://csfd.cz/");

        try {
            WebElement acceptCookies = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[@id='didomi-notice-agree-button' or span[contains(text(),'Rozumím a přijímám')]]")
            ));
            acceptCookies.click();
            System.out.println("Cookies byly přijaty.");
        } catch (TimeoutException e) {
            System.out.println("Cookies banner se nezobrazil nebo už byl potvrzen.");
        }

        WebElement element = driver.findElement(By.name("q"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.clear();
        element.sendKeys("Canary Black");
        element.submit();

        wait.until(ExpectedConditions.titleContains("Canary Black"));
        Assertions.assertTrue(driver.getPageSource().contains("Canary Black"), "Searched key not found ...");

        // Klikni na název filmu
        WebElement filmLink = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(., 'Canary Black')]")
        ));
        filmLink.click();

        System.out.println("Kliknutí na odkaz filmu bylo úspěšné.");

        // Ověř, že se stránka načetla
        wait.until(ExpectedConditions.titleContains("Canary Black"));
    }




    @Test
    public void divSearchTestCS4() throws InterruptedException {
        driver.get("https://csfd.cz/");

        try {
            WebElement acceptCookies = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[@id='didomi-notice-agree-button' or span[contains(text(),'Rozumím a přijímám')]]")
            ));
            acceptCookies.click();
            System.out.println("Cookies byly přijaty.");
        } catch (TimeoutException e) {
            System.out.println("Cookies banner se nezobrazil nebo už byl potvrzen.");
        }

        // Vyhledání filmu
        WebElement element = driver.findElement(By.name("q"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.clear();
        element.sendKeys("Canary Black");
        element.submit();

        // Ověření, že jsme ve výsledcích
        wait.until(ExpectedConditions.titleContains("Canary Black"));
        Assertions.assertTrue(driver.getPageSource().contains("Canary Black"), "Searched key not found ...");

        // Kliknutí na odkaz filmu
        WebElement filmLink = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(., 'Canary Black')]")
        ));
        filmLink.click();
        System.out.println("Kliknutí na odkaz filmu bylo úspěšné.");

        // Ověření, že stránka je načtená
        wait.until(ExpectedConditions.titleContains("Canary Black"));

        // Scroll ke sekci "Hrají"
        WebElement actorsHeader = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//h4[contains(text(),'Hrají:')]")
        ));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", actorsHeader);

        // Kliknutí na herečku (např. Kate Beckinsale)

    }

    @Test
    public void clickOnActorInCastSection() throws InterruptedException {
        driver.get("https://www.csfd.cz/");

        try {
            WebElement acceptCookies = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[@id='didomi-notice-agree-button' or span[contains(text(),'Rozumím a přijímám')]]")
            ));
            acceptCookies.click();
            System.out.println("Cookies byly přijaty.");
        } catch (TimeoutException e) {
            System.out.println("Cookies banner se nezobrazil nebo už byl potvrzen.");
        }

        // Vyhledání filmu
        WebElement searchBox = driver.findElement(By.name("q"));
        wait.until(ExpectedConditions.elementToBeClickable(searchBox));
        searchBox.clear();
        searchBox.sendKeys("Canary Black");
        searchBox.submit();

        wait.until(ExpectedConditions.titleContains("Canary Black"));
        Assertions.assertTrue(driver.getPageSource().contains("Canary Black"), "Film nebyl nalezen ve výsledcích vyhledávání.");

        // Kliknutí na název filmu
        WebElement filmLink = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(., 'Canary Black')]")
        ));
        filmLink.click();
        System.out.println("Kliknutí na odkaz filmu bylo úspěšné.");

        // Počkáme na načtení detailu filmu
        wait.until(ExpectedConditions.titleContains("Canary Black"));

        // Mírný scroll dolů, protože sekce „Hrají“ je níže
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 1000);");
        Thread.sleep(2000); // nebo použij fluent wait

        // Kliknutí na herečku Kate Beckinsale
        try {
            WebElement actorLink = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//h4[text()='Hrají:']/following-sibling::a[contains(text(),'Kate Beckinsale')]")
            ));
            actorLink.click();

            wait.until(ExpectedConditions.titleContains("Kate Beckinsale"));
            Assertions.assertTrue(driver.getPageSource().contains("Kate Beckinsale"));
            System.out.println("Profil herečky byl úspěšně otevřen.");
        } catch (TimeoutException | NoSuchElementException e) {
            System.out.println("Herečka nebyla nalezena nebo kliknutí selhalo: " + e.getMessage());
        } finally {
            Thread.sleep(3000); // pro vizuální kontrolu (volitelné)
            driver.quit();
        }
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
            WebElement cookieBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Přijmout vše')]")));
            cookieBtn.click();
        } catch (Exception e) {
            System.out.println("Cookie lišta se nezobrazila nebo už byla skrytá.");
        }

        WebElement searchBox = driver.findElement(By.name("search"));
        wait.until(ExpectedConditions.elementToBeClickable(searchBox));
        searchBox.clear();
        searchBox.sendKeys("Elvis Presley");
        searchBox.submit();

        // čekej na výsledek, například že stránka obsahuje "Elvis Presley"
        wait.until(ExpectedConditions.titleContains("Elvis Presley"));

        Assertions.assertTrue(driver.getPageSource().contains("Elvis Presley"), "Elvis Presley nebyl nalezen.");
    }

    @Test
    public void imdbSearchTestKate() {
        driver.get("https://www.imdb.com/");

        ((JavascriptExecutor) driver).executeScript(
                "const el = document.querySelector('div[role=dialog], iframe'); if(el) el.style.display='none';"
        );
        WebElement searchBox = driver.findElement(By.name("q"));
        wait.until(ExpectedConditions.elementToBeClickable(searchBox));
        searchBox.clear();
        searchBox.sendKeys("Kate Beckinsale");

        searchBox.submit();

        // počkej, až se výsledky načtou (hledání přes selector nebo text)
        WebElement result = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[contains(text(), 'Kate Beckinsale')]")
        ));

        Assertions.assertTrue(result.isDisplayed(), "Kate Beckinsale nebyla nalezena ve výsledcích hledání.");
    }

    @Test
    public void imdbSearchTestKateProfileClick() {
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
    public void imdbSearchTestKateProfileMetaKnownFor() {
        driver.get("https://www.imdb.com/");


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
    public void seznamSearchClickAlbaButtonTest() {
        driver.manage().window().maximize();
        driver.get("https://search.seznam.cz/");

        WebElement searchField = wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
        searchField.clear();
        searchField.sendKeys("Paul McCartney");
        searchField.sendKeys(Keys.ENTER);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("main")));

        WebElement albaButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[span[@data-text='Alba']]")
        ));
        albaButton.click();

        // Počkej na nějakou změnu stránky, třeba podle URL nebo změny obsahu
        wait.until(ExpectedConditions.urlContains("/hudba/alba"));

        Assertions.assertTrue(driver.getCurrentUrl().contains("/hudba/alba"),
                "Nepodařilo se přepnout na záložku 'Alba'.");
    }

    @Test
    public void seznamSearchClickFirstArticleTest2() {
        driver.manage().window().maximize();
        driver.get("https://search.seznam.cz/");

        WebElement searchField = wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
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

    @Test
    public void divSearchTestsc() throws InterruptedException {

        driver.get("https://div.cz/");
        WebElement searchBox = driver.findElement(By.name("q"));
        wait.until(ExpectedConditions.elementToBeClickable(searchBox));
        searchBox.clear();
        searchBox.sendKeys("Scarlett Johansson");
        searchBox.submit();

        // Počkáme na h2 element s textem Scarlett Johansson
        WebElement resultHeader = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//h2[contains(text(), 'Scarlett Johansson')]")));

        Assertions.assertTrue(resultHeader.isDisplayed(), "Scarlett Johansson was not displayed in results.");
        Thread.sleep(5000);
    }

    @Test
    public void divSearchPartialMatchTest() throws InterruptedException {
        driver.get("https://div.cz/");
        WebElement searchBox = driver.findElement(By.name("q"));
        wait.until(ExpectedConditions.elementToBeClickable(searchBox));
        searchBox.clear();
        searchBox.sendKeys("Scarlett");
        searchBox.submit();

        // Počkej na nějaký výsledek s jejím jménem
        List<WebElement> results = wait.until(ExpectedConditions
                .presenceOfAllElementsLocatedBy(By.xpath("//*[contains(text(), 'Scarlett Johansson')]")));

        Assertions.assertFalse(results.isEmpty(), "Scarlett Johansson not found in partial search results.");
        Thread.sleep(5000);
    }

    @Test
    public void divPartialSearchTest() throws InterruptedException {

        driver.get("https://div.cz/");
        WebElement searchBox = driver.findElement(By.name("q"));
        wait.until(ExpectedConditions.elementToBeClickable(searchBox));
        searchBox.clear();
        searchBox.sendKeys("Scarlett");
        searchBox.submit();

        Thread.sleep(5000); // jen pro debug – později nahradit wait()

        System.out.println(driver.getPageSource()); // uvidíš výstup

        List<WebElement> headers = driver.findElements(By.xpath("//h2"));
        for (WebElement h : headers) {
            System.out.println("H2: " + h.getText());
        }

        List<WebElement> results = driver.findElements(
                By.xpath("//*[contains(text(), 'Scarlett Johansson')]"));

        Assertions.assertFalse(results.isEmpty(), "Scarlett Johansson not found among search results.");
        Thread.sleep(5000);
    }

    @Test
    public void loginTest() throws InterruptedException {

        // 1. Hlavní stránka
        driver.get("https://div.cz/");

        // 2. Kliknutí na "Přihlásit"
        WebElement loginLink = wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("//a[contains(text(),'Přihlásit')]")));
        loginLink.click();

        // 3. Počkej na přihlašovací formulář (name="email")
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("login")));

        // 4. Vyplnění údajů
        driver.findElement(By.name("login")).sendKeys("martinx");     // <-- zadej správné testovací údaje
        driver.findElement(By.name("password")).sendKeys("Whitesnake1987");   // <-- zadej správné heslo

        // 5. Klikni na tlačítko "Přihlásit"
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Přihlásit')]"));
        loginButton.click();

        // 6. Ověření, že jsme přihlášeni
        WebElement logoutLink = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//a[contains(text(),'Odhlásit')]")));

        Assertions.assertTrue(logoutLink.isDisplayed(), "Přihlášení se nezdařilo – 'Odhlásit' nebylo nalezeno.");
        Thread.sleep(5000);
    }

    @Test
    public void logoutTest() throws InterruptedException {

        // 1. Hlavní stránka
        driver.get("https://div.cz/");

        // 2. Kliknutí na "Přihlásit"
        WebElement loginLink = wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("//a[contains(text(),'Přihlásit')]")));
        loginLink.click();

        // 3. Počkej na přihlašovací formulář (name="login")
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("login")));

        // 4. Vyplnění údajů
        driver.findElement(By.name("login")).sendKeys("martinx");
        driver.findElement(By.name("password")).sendKeys("Whitesnake1987");

        // 5. Přihlášení
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Přihlásit')]"));
        loginButton.click();

        // 6. Ověření přihlášení – přítomnost odkazu "Odhlásit"
        WebElement logoutLink = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//a[contains(text(),'Odhlásit')]")));
        Assertions.assertTrue(logoutLink.isDisplayed(), "'Odhlásit' nebylo nalezeno – přihlášení selhalo.");
        Thread.sleep(2000);
        // 7. Kliknutí na "Odhlásit"
        logoutLink.click();
        Thread.sleep(2000);

        // 8. Ověření odhlášení – opětovná přítomnost odkazu "Přihlásit"
        WebElement loginAgainLink = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//a[contains(text(),'Přihlásit')]")));
        Assertions.assertTrue(loginAgainLink.isDisplayed(), "Po odhlášení se nezobrazil odkaz 'Přihlásit'.");
        Thread.sleep(2000);
        driver.get("https://div.cz/filmy/");
        Thread.sleep(2000);

// Najdi nadpis sekce "V kinech"
        WebElement vKinechHeader = driver.findElement(By.xpath("//h3[text()='V kinech']"));

// Najdi první film, který následuje po této sekci
// Předpokládáme, že filmy jsou v kartách (např. <div class="card">) po tomto nadpisu
        WebElement prvniFilmVKinech = vKinechHeader.findElement(
                By.xpath("following::a[contains(@href, '/film/')][1]"));

// Klikni na první film
        prvniFilmVKinech.click();
        Thread.sleep(2000);
    }

    @Test
    public void logoutTest2() {

        // 1. Hlavní stránka
        driver.get("https://div.cz/");

        // 2. Kliknutí na "Přihlásit"
        WebElement loginLink = wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("//a[contains(text(),'Přihlásit')]")));
        loginLink.click();

        // 3. Počkej na přihlašovací formulář (name="login")
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("login")));

        // 4. Vyplnění údajů
        driver.findElement(By.name("login")).sendKeys("martinx");
        driver.findElement(By.name("password")).sendKeys("Whitesnake1987");

        // 5. Přihlášení
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Přihlásit')]"));
        loginButton.click();

        // 6. Ověření přihlášení – přítomnost odkazu "Odhlásit"
        WebElement logoutLink = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//a[contains(text(),'Odhlásit')]")));
        Assertions.assertTrue(logoutLink.isDisplayed(), "'Odhlásit' nebylo nalezeno – přihlášení selhalo.");

        // 7. Kliknutí na "Odhlásit"
        logoutLink.click();


        // 8. Ověření odhlášení – opětovná přítomnost odkazu "Přihlásit"
        WebElement loginAgainLink = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//a[contains(text(),'Přihlásit')]")));
        Assertions.assertTrue(loginAgainLink.isDisplayed(), "Po odhlášení se nezobrazil odkaz 'Přihlásit'.");

        driver.get("https://div.cz/filmy/");


// Najdi nadpis sekce "V kinech"
        WebElement vKinechHeader = driver.findElement(By.xpath("//h3[text()='V kinech']"));

// Najdi první film, který následuje po této sekci
// Předpokládáme, že filmy jsou v kartách (např. <div class="card">) po tomto nadpisu
        WebElement prvniFilmVKinech = vKinechHeader.findElement(
                By.xpath("following::a[contains(@href, '/film/')][1]"));

// Klikni na první film
        prvniFilmVKinech.click();


    }

    @Test
    public void invalidUsernameLoginTest() throws InterruptedException {

        // 1. Hlavní stránka
        driver.get("https://div.cz/");

        // 2. Kliknutí na "Přihlásit"
        WebElement loginLink = wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("//a[contains(text(),'Přihlásit')]")));
        loginLink.click();

        // 3. Počkej na přihlašovací formulář
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("login")));

        // 4. Vyplnění špatného uživatelského jména a správného hesla
        driver.findElement(By.name("login")).sendKeys("spatneJmeno");
        driver.findElement(By.name("password")).sendKeys("Whitesnake1987");

        // 5. Kliknutí na tlačítko "Přihlásit"
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Přihlásit')]"));
        loginButton.click();

        // 6. Krátké čekání kvůli možnému přesměrování nebo zobrazení chyby
        Thread.sleep(2000);

// Kontrola, že uživatel není přihlášen
        boolean odhlaseniExistuje = driver.findElements(By.xpath("//a[contains(text(),'Odhlásit')]")).size() > 0;
        Assertions.assertFalse(odhlaseniExistuje, "Uživatel byl přihlášen i se špatným jménem.");

// Ověření, že se zobrazila chybová hláška nebo že jsme stále na přihlašovací stránce
        List<WebElement> chyba = driver.findElements(By.className("invalid-feedback"));
        Assertions.assertTrue(chyba.size() > 0 || driver.getCurrentUrl().contains("login"),
                "Přihlášení selhalo, ale nezůstali jsme na přihlašovací stránce a žádná chyba se nezobrazila.");

    }

    @Test
    public void invalidUsernameLoginTest2() throws InterruptedException {

        // 1. Hlavní stránka
        driver.get("https://div.cz/");

        // 2. Kliknutí na "Přihlásit"
        WebElement loginLink = wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("//a[contains(text(),'Přihlásit')]")));
        loginLink.click();

        // 3. Počkej na přihlašovací formulář
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("login")));

        // 4. Vyplnění špatného uživatelského jména a správného hesla
        driver.findElement(By.name("login")).sendKeys("martinx");
        driver.findElement(By.name("password")).sendKeys("Whitesnake");

        // 5. Kliknutí na tlačítko "Přihlásit"
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Přihlásit')]"));
        loginButton.click();

        // 6. Krátké čekání kvůli možnému přesměrování nebo zobrazení chyby
        Thread.sleep(2000);

// Kontrola, že uživatel není přihlášen
        boolean odhlaseniExistuje = driver.findElements(By.xpath("//a[contains(text(),'Odhlásit')]")).size() > 0;
        Assertions.assertFalse(odhlaseniExistuje, "Uživatel byl přihlášen i se špatným heslem.");

// Ověření, že se zobrazila chybová hláška nebo že jsme stále na přihlašovací stránce
        List<WebElement> chyba = driver.findElements(By.className("invalid-feedback"));
        Assertions.assertTrue(chyba.size() > 0 || driver.getCurrentUrl().contains("login"),
                "Přihlášení selhalo, ale nezůstali jsme na přihlašovací stránce a žádná chyba se nezobrazila.");

    }


    @Test
    public void fdbSearchTestReese2() {
        driver.get("https://www.fdb.cz/");

        try {
            // Přijetí cookies
            WebElement cookieBtn = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[contains(text(), 'Přijmout vše')]")
            ));
            cookieBtn.click();
        } catch (Exception e) {
            System.out.println("Cookie lišta se nezobrazila nebo už byla skrytá.");
        }

        try {
            // Vyhledání herečky Reese Witherspoon
            WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.name("search")));
            searchBox.clear();
            searchBox.sendKeys("Reese Witherspoon");
            searchBox.submit();

            // Počkej, až se načte stránka výsledků s Reese Witherspoon v titulku
            wait.until(ExpectedConditions.titleContains("Reese Witherspoon"));
            Assertions.assertTrue(driver.getPageSource().contains("Reese Witherspoon"), "Herečka nebyla nalezena.");

            // Najdi film „Voda pro slony“ podle <h3>
            WebElement filmHeading = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//h3[contains(text(),'Voda pro slony')]")
            ));

            // Zvýrazni a scrollni na něj
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'; arguments[0].scrollIntoView(true);", filmHeading);
            System.out.println("Text filmu nalezen: " + filmHeading.getText());

            // Najdi wrapper <a> a klikni
            try {
                WebElement parentLink = filmHeading.findElement(By.xpath("./ancestor::a[1]"));
                System.out.println("Href odkazu: " + parentLink.getAttribute("href"));
                wait.until(ExpectedConditions.elementToBeClickable(parentLink));
                parentLink.click();
                System.out.println("Kliknutí na odkaz proběhlo.");
            } catch (Exception e) {
                System.out.println("Kliknutí na wrapper <a> selhalo, zkusíme JavaScript klik...");
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", filmHeading);
            }

            // Počkej, až se načte stránka filmu
            wait.until(ExpectedConditions.titleContains("Voda pro slony"));

            // Scroll dolů, aby byl odkaz viditelný
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");

        } catch (Exception e) {
            Assertions.fail("Test selhal: " + e.getMessage());
        }
    }

    @Test
    public void fdbSearchTestReese3() {
        driver.get("https://www.fdb.cz/");

        try {
            // Přijetí cookies
            WebElement cookieBtn = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[contains(text(), 'Přijmout vše')]")
            ));
            cookieBtn.click();
        } catch (Exception e) {
            System.out.println("Cookie lišta se nezobrazila nebo už byla skrytá.");
        }

        try {
            // Vyhledání herečky Reese Witherspoon
            WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.name("search")));
            searchBox.clear();
            searchBox.sendKeys("Reese Witherspoon");
            searchBox.submit();

            // Počkej, až se načte stránka výsledků s Reese Witherspoon v titulku
            wait.until(ExpectedConditions.titleContains("Reese Witherspoon"));
            Assertions.assertTrue(driver.getPageSource().contains("Reese Witherspoon"), "Herečka nebyla nalezena.");

            // Najdi film „Voda pro slony“ podle <h3>
            WebElement filmHeading = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//h3[contains(text(),'Divoká dvojka')]")
            ));

            // Zvýrazni a scrollni na něj
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'; arguments[0].scrollIntoView(true);", filmHeading);
            System.out.println("Text filmu nalezen: " + filmHeading.getText());

            // Najdi wrapper <a> a klikni
            try {
                WebElement parentLink = filmHeading.findElement(By.xpath("./ancestor::a[1]"));
                System.out.println("Href odkazu: " + parentLink.getAttribute("href"));
                wait.until(ExpectedConditions.elementToBeClickable(parentLink));
                parentLink.click();
                System.out.println("Kliknutí na odkaz proběhlo.");
            } catch (Exception e) {
                System.out.println("Kliknutí na wrapper <a> selhalo, zkusíme JavaScript klik...");
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", filmHeading);
            }

            // Počkej, až se načte stránka filmu
            wait.until(ExpectedConditions.titleContains("Divoká dvojka"));

            // Scroll dolů, aby byl odkaz viditelný
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");

        } catch (Exception e) {
            Assertions.fail("Test selhal: " + e.getMessage());
        }
    }

    @Test
    public void fdbSearchTestKate() {
        driver.get("https://www.fdb.cz/");

        try {
            // Přijetí cookies
            WebElement cookieBtn = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[contains(text(), 'Přijmout vše')]")
            ));
            cookieBtn.click();
        } catch (Exception e) {
            System.out.println("Cookie lišta se nezobrazila nebo už byla skrytá.");
        }

        try {
            // Vyhledání herečky Reese Witherspoon
            WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.name("search")));
            searchBox.clear();
            searchBox.sendKeys("Kate Beckinsale");
            searchBox.submit();

            // Počkej, až se načte stránka výsledků s Reese Witherspoon v titulku
            wait.until(ExpectedConditions.titleContains("Kate Beckinsale"));
            Assertions.assertTrue(driver.getPageSource().contains("Kate Beckinsale"), "Herečka nebyla nalezena.");

            // Najdi film „Voda pro slony“ podle <h3>
            WebElement filmHeading = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//h3[contains(text(),'Pearl Harbor')]")
            ));

            // Zvýrazni a scrollni na něj
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'; arguments[0].scrollIntoView(true);", filmHeading);
            System.out.println("Text filmu nalezen: " + filmHeading.getText());

            // Najdi wrapper <a> a klikni
            try {
                WebElement parentLink = filmHeading.findElement(By.xpath("./ancestor::a[1]"));
                System.out.println("Href odkazu: " + parentLink.getAttribute("href"));
                wait.until(ExpectedConditions.elementToBeClickable(parentLink));
                parentLink.click();
                System.out.println("Kliknutí na odkaz proběhlo.");
            } catch (Exception e) {
                System.out.println("Kliknutí na wrapper <a> selhalo, zkusíme JavaScript klik...");
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", filmHeading);
            }

            // Počkej, až se načte stránka filmu
            wait.until(ExpectedConditions.titleContains("Pearl Harbor"));

            // Scroll dolů, aby byl odkaz viditelný
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");

        } catch (Exception e) {
            Assertions.fail("Test selhal: " + e.getMessage());
        }
    }

    @Test
    public void fdbSearchTestKate2() {
        driver.get("https://www.fdb.cz/");

        try {
            // Přijetí cookies
            WebElement cookieBtn = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[contains(text(), 'Přijmout vše')]")
            ));
            cookieBtn.click();
        } catch (Exception e) {
            System.out.println("Cookie lišta se nezobrazila nebo už byla skrytá.");
        }

        try {
            // Vyhledání herečky Reese Witherspoon
            WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.name("search")));
            searchBox.clear();
            searchBox.sendKeys("Kate Beckinsale");
            searchBox.submit();

            // Počkej, až se načte stránka výsledků s Reese Witherspoon v titulku
            wait.until(ExpectedConditions.titleContains("Kate Beckinsale"));
            Assertions.assertTrue(driver.getPageSource().contains("Kate Beckinsale"), "Herečka nebyla nalezena.");

            // Najdi film „Voda pro slony“ podle <h3>
            WebElement filmHeading = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//h3[contains(text(),'Kate Beckinsale')]")
            ));

            // Zvýrazni a scrollni na něj
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'; arguments[0].scrollIntoView(true);", filmHeading);
            System.out.println("Text filmu nalezen: " + filmHeading.getText());

            // Najdi wrapper <a> a klikni
            try {
                WebElement parentLink = filmHeading.findElement(By.xpath("./ancestor::a[1]"));
                System.out.println("Href odkazu: " + parentLink.getAttribute("href"));
                wait.until(ExpectedConditions.elementToBeClickable(parentLink));
                parentLink.click();
                System.out.println("Kliknutí na odkaz proběhlo.");
            } catch (Exception e) {
                System.out.println("Kliknutí na wrapper <a> selhalo, zkusíme JavaScript klik...");
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", filmHeading);
            }

            // Počkej, až se načte stránka filmu
            wait.until(ExpectedConditions.titleContains("Kate Beckinsale"));

            // Scroll dolů, aby byl odkaz viditelný
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");

        } catch (Exception e) {
            Assertions.fail("Test selhal: " + e.getMessage());
        }
    }

    @Test
    public void fdbSearchTestKate3() {
        driver.get("https://www.fdb.cz/");

        try {
            // Přijetí cookies
            WebElement cookieBtn = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[contains(text(), 'Přijmout vše')]")
            ));
            cookieBtn.click();
        } catch (Exception e) {
            System.out.println("Cookie lišta se nezobrazila nebo už byla skrytá.");
        }

        try {
            // Vyhledání herečky Reese Witherspoon
            WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.name("search")));
            searchBox.clear();
            searchBox.sendKeys("Kate Winslet");
            searchBox.submit();

            // Počkej, až se načte stránka výsledků s Reese Witherspoon v titulku
            wait.until(ExpectedConditions.titleContains("Kate Winslet"));
            Assertions.assertTrue(driver.getPageSource().contains("Kate Winslet"), "Herečka nebyla nalezena.");

            // Najdi film „Voda pro slony“ podle <h3>
            WebElement filmHeading = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//h3[contains(text(),'Kate Winslet')]")
            ));

            // Zvýrazni a scrollni na něj
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'; arguments[0].scrollIntoView(true);", filmHeading);
            System.out.println("Text filmu nalezen: " + filmHeading.getText());

            // Najdi wrapper <a> a klikni
            try {
                WebElement parentLink = filmHeading.findElement(By.xpath("./ancestor::a[1]"));
                System.out.println("Href odkazu: " + parentLink.getAttribute("href"));
                wait.until(ExpectedConditions.elementToBeClickable(parentLink));
                parentLink.click();
                System.out.println("Kliknutí na odkaz proběhlo.");
            } catch (Exception e) {
                System.out.println("Kliknutí na wrapper <a> selhalo, zkusíme JavaScript klik...");
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", filmHeading);
            }

            // Počkej, až se načte stránka filmu
            wait.until(ExpectedConditions.titleContains("Kate Winslet"));

            // Scroll dolů, aby byl odkaz viditelný
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");

        } catch (Exception e) {
            Assertions.fail("Test selhal: " + e.getMessage());
        }
    }

    @Test
    public void fdbSearchTestJen() {
        driver.get("https://www.fdb.cz/");

        try {
            // Přijetí cookies
            WebElement cookieBtn = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[contains(text(), 'Přijmout vše')]")
            ));
            cookieBtn.click();
        } catch (Exception e) {
            System.out.println("Cookie lišta se nezobrazila nebo už byla skrytá.");
        }

        try {
            // Vyhledání herečky Reese Witherspoon
            WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.name("search")));
            searchBox.clear();
            searchBox.sendKeys("Jennifer Aniston");
            searchBox.submit();

            // Počkej, až se načte stránka výsledků s Reese Witherspoon v titulku
            wait.until(ExpectedConditions.titleContains("Jennifer Aniston"));
            Assertions.assertTrue(driver.getPageSource().contains("Jennifer Aniston"), "Herečka nebyla nalezena.");

            // Najdi film „Voda pro slony“ podle <h3>
            WebElement filmHeading = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//h3[contains(text(),'Přátelé')]")
            ));

            // Zvýrazni a scrollni na něj
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'; arguments[0].scrollIntoView(true);", filmHeading);
            System.out.println("Text filmu nalezen: " + filmHeading.getText());

            // Najdi wrapper <a> a klikni
            try {
                WebElement parentLink = filmHeading.findElement(By.xpath("./ancestor::a[1]"));
                System.out.println("Href odkazu: " + parentLink.getAttribute("href"));
                wait.until(ExpectedConditions.elementToBeClickable(parentLink));
                parentLink.click();
                System.out.println("Kliknutí na odkaz proběhlo.");
            } catch (Exception e) {
                System.out.println("Kliknutí na wrapper <a> selhalo, zkusíme JavaScript klik...");
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", filmHeading);
            }

            // Počkej, až se načte stránka filmu
            wait.until(ExpectedConditions.titleContains("Přátelé"));

            // Scroll dolů, aby byl odkaz viditelný
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");

        } catch (Exception e) {
            Assertions.fail("Test selhal: " + e.getMessage());
        }
    }

    @Test
    public void fdbSearchTestJen2() {
        driver.get("https://www.fdb.cz/");

        try {
            // Přijetí cookies
            WebElement cookieBtn = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[contains(text(), 'Přijmout vše')]")
            ));
            cookieBtn.click();
        } catch (Exception e) {
            System.out.println("Cookie lišta se nezobrazila nebo už byla skrytá.");
        }

        try {
            // Vyhledání herečky Reese Witherspoon
            WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.name("search")));
            searchBox.clear();
            searchBox.sendKeys("Jennifer Aniston");
            searchBox.submit();

            // Počkej, až se načte stránka výsledků s Reese Witherspoon v titulku
            wait.until(ExpectedConditions.titleContains("Jennifer Aniston"));
            Assertions.assertTrue(driver.getPageSource().contains("Jennifer Aniston"), "Herečka nebyla nalezena.");

            // Najdi film „Voda pro slony“ podle <h3>
            WebElement filmHeading = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//h3[contains(text(),'The Morning Show')]")
            ));

            // Zvýrazni a scrollni na něj
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'; arguments[0].scrollIntoView(true);", filmHeading);
            System.out.println("Text filmu nalezen: " + filmHeading.getText());

            // Najdi wrapper <a> a klikni
            try {
                WebElement parentLink = filmHeading.findElement(By.xpath("./ancestor::a[1]"));
                System.out.println("Href odkazu: " + parentLink.getAttribute("href"));
                wait.until(ExpectedConditions.elementToBeClickable(parentLink));
                parentLink.click();
                System.out.println("Kliknutí na odkaz proběhlo.");
            } catch (Exception e) {
                System.out.println("Kliknutí na wrapper <a> selhalo, zkusíme JavaScript klik...");
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", filmHeading);
            }

            // Počkej, až se načte stránka filmu
            wait.until(ExpectedConditions.titleContains("The Morning Show"));

            // Scroll dolů, aby byl odkaz viditelný
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");

        } catch (Exception e) {
            Assertions.fail("Test selhal: " + e.getMessage());
        }

    }

    @Test
    public void fdbSearchTestJen3() {
        driver.get("https://www.fdb.cz/");

        try {
            // Přijetí cookies
            WebElement cookieBtn = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[contains(text(), 'Přijmout vše')]")
            ));
            cookieBtn.click();
        } catch (Exception e) {
            System.out.println("Cookie lišta se nezobrazila nebo už byla skrytá.");
        }

        try {
            // Vyhledání herečky Reese Witherspoon
            WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.name("search")));
            searchBox.clear();
            searchBox.sendKeys("Jennifer Aniston");
            searchBox.submit();

            // Počkej, až se načte stránka výsledků s Reese Witherspoon v titulku
            wait.until(ExpectedConditions.titleContains("Jennifer Aniston"));
            Assertions.assertTrue(driver.getPageSource().contains("Jennifer Aniston"), "Herečka nebyla nalezena.");

            // Najdi film „Voda pro slony“ podle <h3>
            WebElement filmHeading = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//h3[contains(text(),'Zkus mě rozesmát')]")
            ));

            // Zvýrazni a scrollni na něj
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'; arguments[0].scrollIntoView(true);", filmHeading);
            System.out.println("Text filmu nalezen: " + filmHeading.getText());

            // Najdi wrapper <a> a klikni
            try {
                WebElement parentLink = filmHeading.findElement(By.xpath("./ancestor::a[1]"));
                System.out.println("Href odkazu: " + parentLink.getAttribute("href"));
                wait.until(ExpectedConditions.elementToBeClickable(parentLink));
                parentLink.click();
                System.out.println("Kliknutí na odkaz proběhlo.");
            } catch (Exception e) {
                System.out.println("Kliknutí na wrapper <a> selhalo, zkusíme JavaScript klik...");
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", filmHeading);
            }

            // Počkej, až se načte stránka filmu
            wait.until(ExpectedConditions.titleContains("Zkus mě rozesmát"));

            // Scroll dolů, aby byl odkaz viditelný
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");

        } catch (Exception e) {
            Assertions.fail("Test selhal: " + e.getMessage());
        }

    }

}



