package org.example.Facebook;

import org.example.DriverSetup;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login extends DriverSetup {
    @Test
    public void UserLogin() throws InterruptedException {
        browser.get("https://www.facebook.com/login");
        Thread.sleep(1000);

        browser.findElement(By.name("email")).sendKeys("mohammad.sumon.aiub@gmail.com");
        Thread.sleep(500);

    }

}
