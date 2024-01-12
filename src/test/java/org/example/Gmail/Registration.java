package org.example.Gmail;

import org.example.DriverSetup;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Registration extends DriverSetup {
    @Test
    public void UserRegistration() throws InterruptedException {
        browser.get("https://accounts.google.com/v3/signin/identifier?authuser=0&continue=https%3A%2F%2Fmail.google.com%2Fmail&ec=GAlAFw&hl=en&service=mail&flowName=GlifWebSignIn&flowEntry=AddSession&dsh=S1091219493%3A1704288034677655&theme=glif");
        Thread.sleep(2000);

        browser.findElement(By.xpath("//span[normalize-space()='Create account']")).click();

        browser.findElement(By.xpath("(//span[normalize-space()='For my personal use'])[1]")).click();


        browser.findElement(By.name("firstName")).sendKeys("Mohammad");
        Thread.sleep(500);

        browser.findElement(By.name("lastName")).sendKeys("Sumon");
        Thread.sleep(500);

        browser.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[1]")).click();



    }

}
