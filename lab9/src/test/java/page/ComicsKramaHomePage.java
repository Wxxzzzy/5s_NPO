package page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

public class ComicsKramaHomePage extends BasePage{
    private static final String HOMEPAGE_URL = "https://www.comicskrama.by/";

    @FindBy(xpath = "/html/body/div[1]/div[3]/div/div[2]/div[1]/div[2]/ul/li[4]/div/button")
    private WebElement comicsButton;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div/div[2]/div[1]/div[2]/ul/li[4]/ul/li[4]/div/a")
    private WebElement listElement;

    public ComicsKramaHomePage(WebDriver driver) {
        super(driver);
    }

    public ComicsKramaHomePage openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public ComicsKramaHomePage comicsButtonClick() throws InterruptedException {
        new WebDriverWait(driver, 10).until(
                ExpectedConditions.elementToBeClickable(comicsButton))
                    .click();
        return this;
    }

    public ComicsKramaHomePage listElementClick() throws InterruptedException {
        new WebDriverWait(driver, 10).until(
                ExpectedConditions.elementToBeClickable(listElement))
                .click();
        return this;
    }
}
