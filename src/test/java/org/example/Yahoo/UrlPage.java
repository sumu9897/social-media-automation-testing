package org.example.Yahoo;

import org.example.DriverSetup;
import org.testng.annotations.Test;

public class UrlPage extends DriverSetup {

    @Test
    public void OpenUrl() throws InterruptedException {
        browser.get("https://login.yahoo.com/?.src=ym&lang=en-GB&done=https%3A%2F%2Fmail.yahoo.com%2F%3Fguce_referrer%3DaHR0cHM6Ly93d3cuZ29vZ2xlLmNvbS8%26guce_referrer_sig%3DAQAAANTK5ZtLUct0atEJEgRv_XQJQC9RwtI9SaxSJklBIFOkQDAakoIjT67-SLUfIA6a3grBGqscoJ0dolsnrI074ndt6mrjVWTv9PHjO4S_EfieZgwpHNL15MyDgrJDBkwzpZ5T_b-AWnyY1Rixe63q4JbzId5kdHUEC2sYrgcjim8-");
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
