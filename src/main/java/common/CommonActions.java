package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

import static common.Config.PLATFORM_AND_BROWSER;
import static constants.Constant.TimeoutVariable.IMPLICITLY_WAIT;

public class CommonActions {

    public static WebDriver createDriver() {
        WebDriver driver = null;

        switch (PLATFORM_AND_BROWSER) {
            case "ubuntu_chrome":
                System.setProperty("chromedriver.driver", "/home/dm/IdeaProjects/chromedriver");
                driver = new ChromeDriver();
                break;
            default:
                Assert.fail("Incorrect platform or browser name" + PLATFORM_AND_BROWSER);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICITLY_WAIT, TimeUnit.SECONDS);
        return driver; }
}
