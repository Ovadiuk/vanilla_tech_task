package amazon.pages;

import amazon.config.EnvFactory;
import amazon.pages.components.HamburgerMenuElement;

import com.typesafe.config.Config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.awaitility.Awaitility.*;

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

    public HamburgerMenuElement openHamburgerMenu(){
        driver.findElement(By.id("nav-hamburger-menu")).click();
        waitForElemetIsDisplay(driver.findElement(By.id("hmenu-canvas")));
        return new HamburgerMenuElement(driver);
    }
}
