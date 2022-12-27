using NUnit.Framework;

namespace WebDriverAutomation.Tests;

[TestFixture]
public class SmokeTests
{
    private Steps.Steps _steps = new Steps.Steps();

    [SetUp]
    public void Init()
    {
        _steps.InitBrowser();
    }

    [TearDown]
    public void Cleanup()
    {
        _steps.CloseBrowser();
    }

    public void OneCanSignUpComicsKrama()
    {
        _steps.SignUpComicsKrama();
        Assert.AreEqual("(", _steps.GetCurrentPageUrl);
    }
}