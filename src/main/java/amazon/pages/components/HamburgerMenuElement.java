package amazon.pages.components;

import amazon.utils.CustomWebElement;
import amazon.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HamburgerMenuElement {
    private final WebDriver driver;

    public HamburgerMenuElement (WebDriver driver){
        this.driver = driver;
    }

    public HamburgerMenuElement clickOnDepartmentByName(String departmentName){
        WebElement element = driver.findElement(By.xpath("//*[text()='"+departmentName+"']"));
        Utils.scrollToElement(driver, element);
        CustomWebElement.click(driver, element);
        return this;
    }





}
