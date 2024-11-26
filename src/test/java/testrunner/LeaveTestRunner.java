package testrunner;

import config.Setup;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LeavePage;
import pages.LoginPage;

public class LeaveTestRunner extends Setup {
    @BeforeTest
    public void doLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.doLogin("Admin","admin123");
    }
    @Test
    public void leaveApply() throws InterruptedException {
        LeavePage leavePage = new LeavePage (driver);
        String fromDate = "2024-17-12";
        String comments = "Personal Leave";
        leavePage.LeaveApply (fromDate, comments);
        Thread.sleep (1000);
    }
}
