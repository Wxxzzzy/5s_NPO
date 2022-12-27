package driver;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class DriverSingleton {
    private static WebDriver driver;

    private DriverSingleton (){}

    public static WebDriver getDriver(){
        if(null == driver){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

            driver.manage().window().fullscreen();

        }

        return driver;
    }

    public static void closeDriver(){
        driver.quit();
        driver = null;
    }
}