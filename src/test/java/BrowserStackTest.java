import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;

public class BrowserStackTest {

    public static final String USERNAME = System.getenv("USERNAME");
    public static final String ACCESS_KEY = System.getenv("ACCESS_KEY");
    public static final String URL = String.format("https://%s:%s@hub-cloud.browserstack.com/wd/hub", USERNAME, ACCESS_KEY);

    @Test
    public void dummyTest() throws Exception {


        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browser", "Edge");
        caps.setCapability("browser_version", "14.0");
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("resolution", "1280x1024");
        caps.setCapability("browserstack.debug", "true");
        caps.setCapability("browserstack.local", "true");
        caps.setCapability("browserstack.localIdentifier", System.getenv("BROWSERSTACK_LOCAL_IDENTIFIER"));
        caps.setCapability("browserstack.selenium_version", "3.4.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("https://test.zonkej.cz/account/login");

        new WebDriverWait(driver, 10).until(
                ExpectedConditions.and(
                        ExpectedConditions.visibilityOfElementLocated(By.xpath(".//input[@id='username']")),
                        ExpectedConditions.visibilityOfElementLocated(By.xpath(".//input[@id='password']")))
        );

        System.out.println(driver.getTitle());
        driver.quit();

    }
}