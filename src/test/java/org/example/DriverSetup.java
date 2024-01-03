package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverSetup {

    public WebDriver browser;

    @BeforeMethod
    public void openABrowser(){
        browser = new ChromeDriver();
        browser.manage().window().maximize();
    }
    @AfterMethod
    public void quitBrowser(){
        browser.quit();
    }
}
