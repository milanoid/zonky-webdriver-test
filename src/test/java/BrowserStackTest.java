import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class BrowserStackTest {

    public static final String BROWSERSTACK_USER = System.getenv("BROWSERSTACK_USER");
    public static final String BROWSERSTACK_ACCESSKEY = System.getenv("BROWSERSTACK_ACCESSKEY");
    public static final String URL = String.format("https://%s:%s@hub-cloud.browserstack.com/wd/hub", BROWSERSTACK_USER, BROWSERSTACK_ACCESSKEY);

    @Test
    public void dummyTest() throws Exception {


        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browser", "Edge");
        caps.setCapability("browser_version", "14.0");
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("resolution", "1280x1024");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));

        element.sendKeys("BrowserStack");
        element.submit();

        System.out.println(driver.getTitle());
        driver.quit();

    }
}