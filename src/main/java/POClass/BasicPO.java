package POClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BasicPO{
    WebDriver driver;
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    Alert alert;
    Actions actions;
    String parentWindow = driver.getWindowHandle();
    public BasicPO(WebDriver webdriver){
        driver = webdriver;
    }

    public void sendKeys(WebElement wb,String param){
        wb.clear();
        wb.sendKeys(param);
    }

    public void clickOnElement(WebElement wb){
        wb.click();
    }

    public String getText(WebElement wb){
        return wb.getText();
    }

    public boolean isElementDisplayed(List<WebElement> wb){
        boolean flag = false;
        if(wb.size()>0){
            flag = true;
        }
        return flag;
    }

    public List<String> getListOfElements(List<WebElement> wbs){
        List<String> stringElement = new ArrayList<>();
        for(WebElement wb : wbs){
            wb.getText();
            stringElement.add(String.valueOf(wb));
        }
        return stringElement;
    }

    public void clickViaJavaScriptExecutor(WebElement wb){
        executor.executeScript("arguments[0].click();",wb);
    }

    public void scrollIntoViewWebElement(WebElement wb){
        executor.executeScript("arguments[0].scrollIntoView(true);", wb);
    }

    public void AcceptOnAlertWindow(){
        alert = driver.switchTo().alert();
        alert.accept();
    }

    public void RejectOnAlertWindow(){
        alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public void moveToElementAndClick(WebElement wb){
        actions = new Actions(driver);
        actions.moveToElement(wb);
    }

    public void switchToChildWindow(){
        Set<String> windows = driver.getWindowHandles();
        for(String window : windows){
            if(!(window.equalsIgnoreCase(parentWindow))) {
                driver.switchTo().window(window);
            }
        }
    }

    public void switchToParentWindow(){
        driver.close();
        driver.switchTo().window(parentWindow);
    }



}
