import amazon.pages.HomePage;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@Slf4j
public class TestSandbox extends BaseTest {

    @Test
    void assertThatHomePageTitleIsCorrect() {
        HomePage homePage = new HomePage(driver);
        homePage.
                open().
                getHeaderElement().
                openHamburgerMenu().
                clickOnDepartmentByName("TV, Appliances, Electronics").
                clickOnDepartmentByName("Televisions");
        homePage.
                getLeftPanel().clickOnFilterByName("Brands", "Samsung");
        homePage.
                getHeaderResultElement().
                clikOnSortByDropDown().
                selectValueInSortByDropDown("Price: High to Low");
        String result = homePage.
                getResultsElement().
                openResultByIndex(1).
                getAboutThisItem();
        log.info(result);
        assertNotNull(result);
    }

}
