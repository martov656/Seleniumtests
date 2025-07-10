package selenium.POM.TestSuites;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import selenium.POM.Pages.HotelAccountPage;
import selenium.POM.Pages.HotelAuthPage;
import selenium.POM.Pages.HotelHomePage;
import selenium.POM.Pages.HotelProfilePage;


import java.io.File;

public class HotelTests {
    private WebDriver driver;
    private HotelHomePage hhp;
    private HotelAuthPage hap;
    private HotelAccountPage hacp;
    private HotelProfilePage hpp;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        hhp = PageFactory.initElements(driver, HotelHomePage.class);
        hap = PageFactory.initElements(driver, HotelAuthPage.class);
        hacp = PageFactory.initElements(driver, HotelAccountPage.class);
        hpp = PageFactory.initElements(driver, HotelProfilePage.class);
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
    }

    @Test
    public void registerUserTest() throws InterruptedException {
        hhp.signInButton();
        Thread.sleep(5000);
        hap.submit();
        Thread.sleep(5000);
        hacp.registerUser("Jennifer", "Aniston", "Jen1969");
        Thread.sleep(5000);
        hpp.verifyUserCreate();
        Thread.sleep(5000);
    }

    @Test
    public void UserTest() {
        hhp.signInButton();
        hap.submit();
        hacp.registerUser("Jennifer", "Aniston", "Jen1969");
        hpp.verifyUserCreate();

    }

    @Test
    public void UserTest2() {
        hhp.signInButton();
        hap.submit();
        hacp.registerUser("Reese", "Witherspoon", "Reese1976");
        hpp.verifyUserCreate();

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



