package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Base {

   public static WebDriver driver;

   public void startBrowser(){


       driver = new ChromeDriver();

       driver.manage().window().maximize();

       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       String url = readproperties.getValue("url");

       driver.get(url);
   }

}
