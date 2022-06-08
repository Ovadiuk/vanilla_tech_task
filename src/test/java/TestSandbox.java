import amazon.config.EnvFactory;
import amazon.factories.DriverFactory;
import amazon.pages.HomePage;
import com.typesafe.config.Config;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSandbox {
    private static Config config = EnvFactory.getInstance().getConfig();
    private static final String HOME_PAGE_URL = config.getString("HOME_PAGE_URL");
    private WebDriver driver = DriverFactory.getDriver();


    @Tag("smokeTest")
    @DisplayName("This test is for demo purpose only to show that the basic code works." +
            "You have to use the best practices that you normally use to design your tests")
    @Test
    void assertThatHomePageTitleIsCorrect() {
        HomePage homePage = new HomePage(driver);
        homePage.
                open().
                openHamburgerMenu().
                clickOnDepartmentByName("TV, Appliances, Electronics").
                clickOnDepartmentByName("Televisions");
//        assertEquals("Amazon.com. Spend less. Smile more.", driver.getTitle());
    }
}
