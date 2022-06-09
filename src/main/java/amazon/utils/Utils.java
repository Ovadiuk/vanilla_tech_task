package amazon.utils;

import static org.awaitility.Awaitility.await;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utils {

    public static void scrollToElement(WebDriver driver, WebElement webElement){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", webElement);
    }

    public static void waitForElemetIsDisplay(WebElement element){
        await().atMost(3000, TimeUnit.MILLISECONDS)
                .until(element::isDisplayed);
    }
}
