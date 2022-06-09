package amazon.pages.components;

import amazon.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderElement {
    private final WebDriver driver;

    public HeaderElement(WebDriver driver){
        this.driver = driver;
    }

    public HamburgerMenuElement openHamburgerMenu(){
        driver.findElement(By.id("nav-hamburger-menu")).click();
        Utils.waitForElemetIsDisplay(driver.findElement(By.id("hmenu-canvas")));
        return new HamburgerMenuElement(driver);
    }
}
