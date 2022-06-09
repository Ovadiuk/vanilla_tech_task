import amazon.config.EnvFactory;
import amazon.factories.DriverFactory;
import com.typesafe.config.Config;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    private static Config config = EnvFactory.getInstance().getConfig();
    protected WebDriver driver = DriverFactory.getDriver();

    @AfterEach
    public void closeBrowser(){
        driver.quit();
    }



}
