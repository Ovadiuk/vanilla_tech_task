package amazon.pages;


import org.openqa.selenium.WebDriver;


public class BasePage {
    //used for universal methods across all pages
    private final WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

}
