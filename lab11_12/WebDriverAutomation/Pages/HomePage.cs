using OpenQA.Selenium;
using SeleniumExtras.PageObjects;

namespace WebDriverAutomation.Pages;

public class HomePage
{
    private const string BASE_URL = "https://www.comicskrama.by/";

    private IWebDriver _driver;

    [FindsBy(How = How.XPath, Using = "/html/body/div[1]/div[2]/header/div[1]/div/div/div[2]/div[2]/div[1]/form/input")]
    private IWebElement _searchBar;

    [FindsBy(How = How.XPath, Using = "/html/body/div[1]/div[2]/header/div[1]/div/div/div[2]/div[1]/div[4]/div/div[2]/a[2]")]
    private IWebElement _callbackLink;

    [FindsBy(How = How.XPath, Using = "/html/body/div[6]/div[2]/div/div[1]/button[3]")]
    private IWebElement _closeButton;

    [FindsBy(How = How.XPath, Using = "/html/body/div[1]/div[1]/div/div/div[1]/a")]
    private IWebElement _signUpAndSignInButton;

    public HomePage(IWebDriver driver)
    {
        this._driver = driver;
        PageFactory.InitElements(this._driver, this);
    }

    public void OpenPage()
    {
        _driver.Navigate().GoToUrl(BASE_URL);
    }
}
