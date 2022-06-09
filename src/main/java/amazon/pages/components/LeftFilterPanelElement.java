package amazon.pages.components;

import java.util.List;

import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LeftFilterPanelElement {
    private final WebDriver driver;

    public LeftFilterPanelElement (WebDriver driver){
        this.driver = driver;
    }

    private List<WebElement> getElementsBySectionName (){
        return driver.findElements(By.xpath("//*[@id='s-refinements']//*[@class='a-section a-spacing-none']"));
    }

    private WebElement getSectrionByName(String sectionName){
        List<WebElement> sections = getElementsBySectionName();
        return sections.stream().
                filter(e-> e.findElement(By.tagName("span")).
                        getText().equals(sectionName)).
                findFirst().
                orElseThrow(()-> new NoSuchElementException("No section found + " + sectionName));

    }

    public void clickOnFilterByName(String sectionName, String filterName){
        WebElement section = getSectrionByName(sectionName);
        List<WebElement> filters = section.findElements(By.tagName("li"));
        WebElement filter = filters.stream().
                filter(webElement -> webElement.findElement(By.xpath("span")).
                        getText().
                        equals(filterName)).
                findFirst().
                orElseThrow(()-> new NoSuchElementException("No section found + " + sectionName));
        filter.findElement(By.xpath(".//div[contains(@class,'a-checkbox')]")).click();
    }

}
