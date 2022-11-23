package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import page.ComicsKramaHomePage;

class ComicsKramaTest {
    private WebDriver driver;

    @BeforeEach
    public void setup() {
        driver = getDriver();
    }
    private WebDriver getDriver() {
        final ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1920,1080");
        return new ChromeDriver(options);
    }

    @Test
    @DisplayName("Test: go to gifts for her from menu")
    void giftsForHerFromMenu() throws InterruptedException {
        ComicsKramaHomePage comicsPage =
                new ComicsKramaHomePage(driver).openPage()
                        .comicsButtonClick()
                        .listElementClick();
        Assertions.assertEquals(
                "https://www.comicskrama.by/collection/katalog-1-4eb3be",
                comicsPage.getPageUrl());
    }

    @AfterEach
    @DisplayName("Close Chrome Driver")
    public void tearDown() {
        driver.quit();
        driver = null;
    }
}
