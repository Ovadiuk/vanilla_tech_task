package amazon.pages;

import amazon.utils.Utils;
import amazon.config.EnvFactory;

import amazon.pages.components.HeaderElement;
import amazon.pages.components.HeaderResultElement;
import amazon.pages.components.LeftFilterPanelElement;
import amazon.pages.components.ResultsElement;
import com.typesafe.config.Config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage{
    private static Config config = EnvFactory.getInstance().getConfig();
    private static final String HOME_PAGE_URL = config.getString("HOME_PAGE_URL");
    private WebDriver driver;

    public HomePage (WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public HomePage open (){
        driver.get(HOME_PAGE_URL);
        return this;
    }

    public HeaderElement getHeaderElement(){
        return new HeaderElement(driver);
    }

    public LeftFilterPanelElement getLeftPanel(){
        Utils.waitForElemetIsDisplay(driver.findElement(By.id("s-refinements")));
        return new LeftFilterPanelElement(driver);
    }

    public ResultsElement getResultsElement(){
        return new ResultsElement(driver);
    }

    public HeaderResultElement getHeaderResultElement(){
        return new HeaderResultElement(driver);
    }

}
