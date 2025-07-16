package uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeUI {


   public static By SearchBox = By.xpath("//input[@placeholder='Search for Products, Brands and More']");

   public static By dropdownMin = By.xpath("//select[@fdprocessedid='5513cm']");

   public static By dropdownMax = By.xpath("//select[@fdprocessedid='rzkpnp']");

   public static By BrandButton = By.xpath("//div[text()='Brand']");

   public static By More21 = By.xpath("//span[text()='21 MORE']");

   public static By Acer = By.xpath("Acer");

   public static By Processor = By.xpath("(//div[@class='fxf7w6 rgHxCQ'])[3]");

   public static By more11 = By.xpath("//span[text()='11 MORE']");

   public static By hexacore = By.xpath("//div[text()='Ryzen 5 Hexa Core']");
}
