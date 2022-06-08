package amazon.pages.components;

import amazon.pages.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HamburgerMenuElement {
    private final WebDriver driver;

    public HamburgerMenuElement (WebDriver driver){
        this.driver = driver;
    }

    public HamburgerMenuElement clickOnDepartmentByName(String departmentName){
        WebElement element = driver.findElement(By.xpath("//*[text()='"+departmentName+"']"));
        Utils.scrollToElement(driver, element);
        element.click();
        return this;
    }





}
