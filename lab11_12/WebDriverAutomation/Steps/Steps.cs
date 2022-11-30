using OpenQA.Selenium;
using WebDriverAutomation.Pages;

namespace WebDriverAutomation.Steps;

public class Steps
{
    IWebDriver driver;

    public void InitBrowser()
    {
        driver = Driver.DriverInstance.GetInstance();
    }

    public void CloseBrowser()
    {
        Driver.DriverInstance.CloseBrowser();
    }

    public void SignUpComicsKrama()
    {
        var loginPage = new LoginPage(driver);
        loginPage.OpenPage();
        loginPage.SignUp("123123", "ksfg@kwrf.com", "111111111111", "erfk owr fwp");
    }

    public string GetCurrentPageUrl() => driver.Url;
}