package pages.realt_home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class RealtHomePege extends BasePage {
    public RealtHomePege(WebDriver driver) {
        super(driver);
    }
    private final By countRooms = By.id("rooms");
    private final By option2rooms = By.xpath("//select[@id='rooms']/option[@value='2']");
    private final By findBtn = By.xpath("//div[@id='residentialInputs']//a[text()='Найти']");

    public RealtHomePege enterCountRooms() {
        driver.findElement(countRooms).click();
        driver.findElement(option2rooms).click();

        return this;
    }

    public RealtHomePege clickToFind() {
        WebElement btnFind = driver.findElement(findBtn);
        waitElementIsVisible(btnFind).click();

        return this;
    }

}
