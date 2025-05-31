package selenium.POM.TestSuites;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import selenium.POM.Pages.FormPage;

import java.io.File;
import java.time.Duration;

public class FormTests {

    private WebDriver driver;
    private FormPage fp;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        fp = PageFactory.initElements(driver, FormPage.class);
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
    }

    @Test
    public void formTest() throws InterruptedException {
        fp.fillInName("Reese", "Witherspoon");
        Thread.sleep(5000);

        fp.selectFemaleGender();;
        Thread.sleep(5000);

        fp.fillInDateOfBirth(22,3, 1976);
        Thread.sleep(5000);

        fp.addressOfResidence(9500, "Wilshire Blvd", "Beverly Hills", "CA", 90212, "USA");
        Thread.sleep(5000);


        }

    @AfterEach
    public void tearDown() {
        waitBeforeClosing_ForLecturerDemoOnly();
        if (driver != null)
            driver.quit();
    }

    // *********************** helper methods *************************

    private void openOnSecondScreen_ForLecturerDemoOnly() {
        if (IsOnLecturerPc()) {
            driver.manage().window().setPosition(new Point(-2000, 0));
        }
    }

    private void waitBeforeClosing_ForLecturerDemoOnly() {
        if (IsOnLecturerPc()) {
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void wait2Sec_ForLecturerDemoOnly() {
        if (IsOnLecturerPc()) {
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private boolean IsOnLecturerPc() {
        boolean inLecturerPc = false;
        File file = new File(System.getProperty("user.dir") + File.separator + "runInLecturerPc.txt");
        if (file.exists()) {
            inLecturerPc = true;
        }
        return inLecturerPc;
    }
}



