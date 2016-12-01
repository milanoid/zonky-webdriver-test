import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class HelloWorldWebDriver {

    @Test
    public void marketplacePageSmokeTest() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://app.zonky.cz/#/marketplace/");
        WebElement header = driver.findElement(By.xpath(".//div[@class='main']//h1"));

        assertThat(header.getText(), is("Tržiště"));
    }
}
