package amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemPage {
    private final WebDriver driver;

    public ItemPage(WebDriver driver){
        this.driver = driver;
    }

    public String getAboutThisItem(){
        return driver.findElement(By.id("feature-bullets")).getText();
    }



}
