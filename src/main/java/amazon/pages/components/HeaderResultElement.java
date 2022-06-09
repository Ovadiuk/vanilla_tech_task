package amazon.pages.components;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderResultElement {
    private final WebDriver driver;

    public HeaderResultElement(WebDriver driver){
        this.driver = driver;
    }

    public HeaderResultElement clikOnSortByDropDown(){
        driver.findElement(By.className("a-dropdown-label")).click();
        return this;
    }

    private WebElement getDropDownElementByName(String name){
        return driver.findElements(By.className("a-dropdown-link")).
                stream().
                filter(webElement -> webElement.getText().equals(name)).
                findFirst().
                orElseThrow(()-> new NoSuchElementException("No section found + " + name));
    }

    public void selectValueInSortByDropDown(String name){
        getDropDownElementByName(name).click();
    }
}
