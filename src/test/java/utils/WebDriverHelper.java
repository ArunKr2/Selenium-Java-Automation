package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.Set;

public class WebDriverHelper {

    WebDriver driver;

    public WebDriverHelper(WebDriver driver) {

        this.driver = driver;
    }

    public void click(WebElement ele) {
        try {
            ele.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void MouseHover(WebElement ele) {
        try {
            Actions act = new Actions(driver);
            act.moveToElement(ele).perform();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public void JsClick(WebElement ele){

        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;

            js.executeScript("arguments[0].Click();", ele);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void WindowHandle(WebElement ele){

        try{
            String ParentWindow = driver.getWindowHandle();
            Set<String> windows = driver.getWindowHandles();

            for(String win : windows){

                if(!win.equals(ParentWindow)){

                    driver.switchTo().window(win);
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ExplicitWait(WebElement ele){

        try{

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            wait.until(ExpectedConditions.visibilityOf(ele));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void SendKeys(WebElement ele , String value){

        try{

            ele.sendKeys(value);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void Enter(WebElement ele){
        try{

            ele.sendKeys(Keys.ENTER);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void DropDown(WebElement ele , String type , String Value){
        try{

            Select obj = new Select(ele);

            switch(type.toLowerCase()){

                case "index":
                    obj.selectByIndex(Integer.parseInt(Value));
                    break;
                case "value":
                    obj.selectByValue(Value);
                    break;
                case "visibletext":
                    obj.selectByVisibleText(Value);
                    break;
                default:
                    System.out.println("Not Matched");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
