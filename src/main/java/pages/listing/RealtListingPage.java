package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

public class RealtListingPage extends BasePage {
    public RealtListingPage(WebDriver driver) {
        super(driver);
    }
    public final By card = By.xpath("//div[@data-mode='3']");

    public RealtListingPage checkCountCards() {
        int countCard = driver.findElements(card).size();
        Assert.assertEquals(countCard, 20);
        return  this;
    }
}
