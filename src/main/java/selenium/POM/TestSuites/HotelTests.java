package selenium.POM.TestSuites;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import selenium.POM.Pages.*;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HotelTests {
    private WebDriver driver;
    private HotelHomePage hhp;
    private HotelAuthPage hap;
    private HotelAccountPage hacp;
    private HotelProfilePage hpp;
    private SearchResultPage srp;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        openOnSecondScreen_ForLecturerDemoOnly();
        driver.manage().window().maximize();
        hhp = PageFactory.initElements(driver, HotelHomePage.class);
        hap = PageFactory.initElements(driver, HotelAuthPage.class);
        hacp = PageFactory.initElements(driver, HotelAccountPage.class);
        hpp = PageFactory.initElements(driver, HotelProfilePage.class);
        srp = PageFactory.initElements(driver, SearchResultPage.class);
        driver.get("https://hotel-testlab.coderslab.pl/en/");
    }

    @Test
    public void registerUserTest() {
        hhp.signInButton();
        hap.submit();
        hacp.registerUser("David", "Kriz", "Heslo123");
        hpp.verifyUserCreated();

    }

    @Test
    public void selectionHotelTest() {
        hhp.signInButton();
        hap.login("tree@sezo.com", "Lennon1980");
        hpp.goHomePage();
        hhp.verifyHomePageShow();
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date dt = new Date();
        String dataIn = df.format(dt);
        String dataOut = df.format(new Date(dt.getTime() + (2 * 1000 * 60 * 60 * 24)));
        hhp.searchByButton("DefCity", "The Hotel Prime", dataIn, dataOut);
        srp.verifyHotelsSearch();
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
