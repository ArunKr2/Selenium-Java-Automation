package runner;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Base;

public class Testrunner extends Base {

    @BeforeMethod
    public void OpenBrowser() {

        startBrowser();
    }

    @Test
    public void Test1() {

        try {

            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterMethod

    public void teardown() {

        driver.quit();
    }
}
