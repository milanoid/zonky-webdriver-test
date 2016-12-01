import PageObjects.MarketPlacePage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MarketPlaceSmokeTest {

    static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        driver = new FirefoxDriver();
    }

    @Test
    public void marketplacePageSmokeTest() {

        MarketPlacePage page = new MarketPlacePage(driver).get();
        assertThat(page.getPageHeaderText(), is("Tržiště"));
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}
