package org.example.Gmail;

import org.example.DriverSetup;
import org.testng.annotations.Test;

public class Registration extends DriverSetup {
    @Test
    public void UserRegistration() throws InterruptedException {
        browser.get("https://accounts.google.com/lifecycle/steps/signup/name?continue=https://mail.google.com/mail&dsh=S1091219493:1704288034677655&ec=GAlAFw&flowEntry=SignUp&flowName=GlifWebSignIn&hl=en&service=mail&theme=glif&TL=AHNYTIQ_rTAADpPgDRywR6mOXbhgJ95jEqHjd6VWNOAcojssvEqZeDN09qlxoLHz");
        Thread.sleep(2000);
    }

}
