package page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class HomePage extends AbstractPage {
    private final String BASE_URL = "https://www.comicskrama.by/";

    @FindBy(xpath = "/html/body/div[1]/div[2]/header/div[1]/div/div/div[2]/div[2]/div[1]/form/input")
    private WebElement searchBar;

    @FindBy(xpath = "/html/body/div[1]/div[2]/header/div[1]/div/div/div[2]/div[1]/div[4]/div/div[2]/a[2]")
    private WebElement callbackLink;

    @FindBy(xpath = "/html/body/div[6]/div[2]/div/div[1]/button[3]")
    private WebElement closeButton;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div[1]/a")
    private WebElement signUpAndSignInButton;

    public HomePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public HomePage openPage(){
        driver.navigate().to(BASE_URL);
        return this;
    }
}
