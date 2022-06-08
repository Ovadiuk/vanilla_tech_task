package amazon.pages;

import static org.awaitility.Awaitility.await;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    private final WebDriver driver;

    public BasePage (WebDriver driver){
        this.driver = driver;
    }

    public void waitForElemetIsDisplay(WebElement element){
        await().atMost(3000, TimeUnit.MILLISECONDS)
                .until(element::isDisplayed);
    }
}
