package org.example.Facebook;

import org.example.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Registration extends DriverSetup {


    @Test
    public void UserRegistration() throws InterruptedException {
        browser.get("https://www.facebook.com/register");
        Thread.sleep(1000);

        browser.findElement(By.name("firstname")).sendKeys("Mohammad");
        Thread.sleep(500);

        browser.findElement(By.name("lastname")).sendKeys("Sumon");
        Thread.sleep(500);

        browser.findElement(By.name("reg_email__")).sendKeys("mohammad.sumon.aiub@gmail.com");
        Thread.sleep(500);

        browser.findElement(By.name("reg_email_confirmation__")).sendKeys("mohammad.sumon.aiub@gmail.com");
        Thread.sleep(300);

        browser.findElement(By.name("reg_passwd__")).sendKeys("12345678");
        Thread.sleep(500);

        WebElement w1 = browser.findElement(By.xpath("(//select[@id='day'])[1]"));
        Select s1 = new Select(w1);
        s1.selectByValue("25");

        WebElement w2 = browser.findElement(By.xpath("(//select[@id='month'])[1]"));
        Select s2 = new Select(w2);
        s2.selectByValue("10");

        WebElement w3 = browser.findElement(By.xpath("(//select[@id='year'])[1]"));
        Select s3 = new Select(w3);
        s3.selectByValue("1999");

        Thread.sleep(300);

        browser.findElement(By.xpath("(//label[normalize-space()='Male'])[1]")).click();
        browser.findElement(By.name("websubmit")).click();
        Thread.sleep(700);






    }

}
