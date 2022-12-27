using OpenQA.Selenium;
using SeleniumExtras.PageObjects;

namespace WebDriverAutomation.Pages;

public class LoginPage
{
    private const string BASE_URL = "https://www.comicskrama.by/client_account/contacts/new";

    [FindsBy(How = How.XPath, Using = "//input[@id='client_name']")]
    private IWebElement _fullNameInput;

    [FindsBy(How = How.XPath, Using = "//input[@id='client_phone']")]
    private IWebElement _phoneNumberInput;

    [FindsBy(How = How.XPath, Using = "//input[@id='client_email']")]
    private IWebElement _emailInput;

    [FindsBy(How = How.XPath, Using = "//input[@id='client_password']")]
    private IWebElement _passwordInput;

    [FindsBy(How = How.XPath, Using = "//*[@id='client_password_confirmation']")]
    private IWebElement _repeatPasswordInput;

    [FindsBy(How = How.XPath, Using = "//input[@id='new_client']/div[8]/button")]
    private IWebElement _signUpButton;

    private IWebDriver _driver;

    public LoginPage(IWebDriver driver)
    {
        this._driver = driver;
        PageFactory.InitElements(this._driver, this);
    }
            
    public void OpenPage()
    {
        _driver.Navigate().GoToUrl(BASE_URL);
        Console.WriteLine("Login page opened");
    }

    public void SignUp(string password, string email, string phoneNumber, string fullName)
    {
        _fullNameInput.SendKeys(fullName);
        _phoneNumberInput.SendKeys(phoneNumber);
        _emailInput.SendKeys(email);
        _passwordInput.SendKeys(password);
        _repeatPasswordInput.SendKeys(password);
        _signUpButton.Click();
    }
}