import PageObjects.MarketPlacePage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;

public class MarketPlaceSmokeTest {

    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = new FirefoxDriver();
    }

    @Test
    public void titleHeaderIsDisplayed() {

        String expectedText = "Tržiště";

        MarketPlacePage page = new MarketPlacePage(driver).get();
        assertThat(String.format("Could not find text %s in page header", expectedText), page.getPageHeaderText(), is(expectedText));
    }

    @Test
    public void loansDisplayed() {

        MarketPlacePage page = new MarketPlacePage(driver).get();
        assertThat("There is not a single loan on page.", page.loanItemsOnPage(), not(0));
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
