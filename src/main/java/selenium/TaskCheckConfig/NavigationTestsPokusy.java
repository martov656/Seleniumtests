package selenium.TaskCheckConfig;

import org.junit.jupiter.api.Test;
import selenium.BasedSharedMethods;

public class NavigationTestsPokusy extends BasedSharedMethods {

    @Test
    public void NavigationExercise2() {

        driver.get("https://coderslab.com/en");
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        driver.navigate().to("https://hotel-testlab.coderslab.pl/en/");
    }

        @Test
        public void NavigationExercise3() {

            driver.get("https://www.google.com");
            driver.get("https://coderslab.com/en");
            driver.navigate().back();
            driver.navigate().to("https://mystore-testlab.coderslab.pl/index.php");
            driver.navigate().back();
            driver.navigate().forward();
            driver.get("https://mystore-testlab.coderslab.pl/index.php");
            driver.navigate().refresh();

        }

    @Test
    public void NavigationExercise4() {

        driver.get("https://www.google.com");
        driver.get("https://coderslab.com/en");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        }
}

