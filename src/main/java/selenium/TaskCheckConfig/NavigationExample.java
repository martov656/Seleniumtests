package selenium.TaskCheckConfig;

import org.junit.jupiter.api.Test;
import selenium.BasedSharedMethods;

public class NavigationExample extends BasedSharedMethods {

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
}