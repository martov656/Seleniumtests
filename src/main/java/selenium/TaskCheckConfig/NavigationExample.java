package selenium.TaskCheckConfig;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationExampleTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        // Inicializace driveru před každým testem
        driver = new ChromeDriver();
    }

    @Test
    public void testNavigationFlow() {
        // 1. Přejít na Google
        driver.get("https://www.google.com");

        // 2. Přejít na CodersLab
        driver.get("https://coderslab.com/en");

        // 3. Zpět na Google
        driver.navigate().back();

        // 4. Přejít na MyStore testlab
        driver.get("https://mystore-testlab.coderslab.pl/index.php");

        // 5. Zpět na Google
        driver.navigate().back();

        // 6. Dopředu na MyStore testlab
        driver.navigate().forward();

        // 7. Obnovit stránku MyStore testlab
        driver.navigate().refresh();
    }

    @AfterEach
    public void tearDown() {
        // Ukončit prohlížeč po testu
        if (driver != null) {
            driver.quit();
        }
    }
}