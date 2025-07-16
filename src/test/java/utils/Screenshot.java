package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.FileInputStream;

public class Screenshot {
    WebDriver driver;

    Screenshot(WebDriver driver) {
        this.driver = driver;
    }

    public void screenshotphoto() {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;

            File src = ts.getScreenshotAs(OutputType.FILE);

            String FilePath = System.getProperty("user.dir") + "/Screenshot/";

            File Dest = new File(FilePath);

            FileHandler.copy(src, Dest);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
