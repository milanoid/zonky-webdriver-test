package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

public class MarketPlacePage extends LoadableComponent<MarketPlacePage> {

    WebDriver driver;
    String pageUrl = "https://app.zonky.cz/#/marketplace/";

    @FindBy(xpath = ".//div[@class='main']//h1")
    private WebElement pageHeader;


    public MarketPlacePage(WebDriver webDriver) {
        driver = webDriver;
        PageFactory.initElements(driver, this);

    }

    @Override
    protected void load() {
        driver.get(pageUrl);

    }

    @Override
    protected void isLoaded() throws Error {
        //new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(pageHeader));
        String actualUrl = driver.getCurrentUrl();
        assert (actualUrl.equals(pageUrl));

    }

    public String getPageHeaderText() {
        return pageHeader.getText();
    }
}
