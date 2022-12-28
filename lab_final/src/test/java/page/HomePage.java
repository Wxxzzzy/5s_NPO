package page;

import model.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class HomePage extends AbstractPage {
    private final String BASE_URL = "https://www.comicskrama.by/";

    @FindBy(xpath = "/html/body/div[1]/div[2]/header/div[1]/div/div/div[2]/div[2]/div[1]/form/input")
    private WebElement searchBar;

    @FindBy(xpath = "/html/body/div[1]/div[2]/header/div[1]/div/div/div[2]/div[2]/div[1]/form/button")
    private WebElement searchBarSubmitButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/header/div[1]/div/div/div[2]/div[1]/div[4]/div/div[2]/a[2]")
    private WebElement callbackLink;

    @FindBy(xpath = "/html/body/div[9]/div[2]/div/div[3]/div/form/div[4]/input")
    private WebElement callbackInputName;

    @FindBy(xpath = "/html/body/div[9]/div[2]/div/div[3]/div/form/div[5]/input")
    private WebElement callbackInputPhoneNumber;

    @FindBy(xpath = "/html/body/div[10]/div[2]/div/div[4]/div[2]/button")
    private WebElement callbackSubmitButton;


    public HomePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public HomePage openPage(){
        driver.navigate().to(BASE_URL);
        return this;
    }

    public String submitCallBackForm(CallBackForm callBackForm) throws InterruptedException {
        callbackLink.click();
        callbackInputName.sendKeys(callBackForm.getName());
        callbackInputPhoneNumber.sendKeys(callBackForm.getPhoneNumber());
        Thread.sleep(15000);
        callbackSubmitButton.click();

        return getUrlLoginPage();
    }

    public String doSearch(SearchModel searchModel){
        searchBar.sendKeys(searchModel.getSearchInput());
        searchBarSubmitButton.click();

        return getUrlLoginPage();
    }

    private String getUrlLoginPage(){
        return driver.getCurrentUrl();
    }
}
