package amazon.pages.components;

import amazon.pages.ItemPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultsElement {
    private final WebDriver driver;

    public ResultsElement (WebDriver driver){
        this.driver = driver;
    }

    private List<WebElement> getResults (){
        return driver.findElements(By.xpath("//div[@class='a-section a-spacing-base']"));
    }

    public ItemPage openResultByIndex(int index){
        List<WebElement> results = getResults();
        results.get(index).findElement(By.tagName("img")).click();
        return getItemPage();
    }

    private ItemPage getItemPage(){
        String originalWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if(!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        return new ItemPage(driver);
    }
}
