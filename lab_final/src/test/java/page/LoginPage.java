package page;

import model.*;
import org.apache.logging.log4j.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;


public class LoginPage extends AbstractPage{
    private final String BASE_URL = "https://www.comicskrama.by/client_account/contacts/new";
    private final Logger logger = LogManager.getRootLogger();

    @FindBy(xpath = "//input[@id='client_name']")
    private WebElement fullNameInput;

    @FindBy(xpath = "//input[@id='client_phone']")
    private WebElement phoneNumberInput;

    @FindBy(xpath = "//input[@id='client_email']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@id='client_password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//*[@id='client_password_confirmation']")
    private WebElement repeatPasswordInput;

    @FindBy(xpath = "//input[@id='new_client']/div[8]/button")
    private WebElement signUpButton;

    public LoginPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public LoginPage openPage(){
        driver.navigate().to(BASE_URL);
        return this;
    }

    public String singUp(User user){

        fullNameInput.sendKeys(user.getUsername());
        phoneNumberInput.sendKeys(user.getPhoneNumber());
        emailInput.sendKeys(user.getEmail());
        passwordInput.sendKeys(user.getPassword());
        repeatPasswordInput.sendKeys(user.getPassword());
        signUpButton.click();

        logger.info("Registration perfomed");

        return getUrlLoginPage();
    }

    private String getUrlLoginPage(){
        return driver.getCurrentUrl();
    }
}
