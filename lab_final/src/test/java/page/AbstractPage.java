package page;

import org.openqa.selenium.*;

public abstract class AbstractPage {
    protected WebDriver driver;

    protected abstract AbstractPage openPage();
    protected final int WAIT_TIMEOT_SECONDS = 10;

    protected AbstractPage(WebDriver driver){
        this.driver = driver;
    }
}
