package org.example.Gmail;

import org.example.DriverSetup;
import org.testng.annotations.Test;

public class UrlPage extends DriverSetup {

    @Test
    public void OpenUrl() throws InterruptedException {
        browser.get("https://accounts.google.com/lifecycle/steps/signup/name?continue=https://mail.google.com/mail&dsh=S1091219493:1704288034677655&ec=GAlAFw&flowEntry=SignUp&flowName=GlifWebSignIn&hl=en&service=mail&theme=glif&TL=AHNYTIQ_rTAADpPgDRywR6mOXbhgJ95jEqHjd6VWNOAcojssvEqZeDN09qlxoLHz");
        Thread.sleep(2000);

        System.out.println(browser.getTitle());
        System.out.println(browser.getCurrentUrl());
//        System.out.println(browser.getPageSource());
        System.out.println(browser.getWindowHandle());
        System.out.println(browser.getWindowHandles());
        System.out.println(browser.switchTo());
        System.out.println(browser.manage());
        System.out.println(browser.navigate());
    }
}
