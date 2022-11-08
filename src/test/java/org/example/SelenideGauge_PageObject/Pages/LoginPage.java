package org.example.SelenideGauge_PageObject.Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Page containing login page elements and methods
 */
public class LoginPage {

    private SelenideElement username = $("#username");
    private SelenideElement password = $("#password");

    public void login() {
        open("https://eu46.lightning.force.com/lightning/page/home");
        username.val("username");
        password.val("password").pressEnter();
    }

    public void loginToFreeTrial() {
        open("https://www.salesforce.com/form/signup/freetrial-elf-v2/?d=cta-li-promo-147");
        $("button#onetrust-accept-btn-handler").click();
        $(byName("UserFirstName")).val("Marian");
        $(byName("UserLastName")).val("Sepela");
        $(byName("UserTitle")).val("QA").pressEnter();
        $(byXpath("//span[text() ='Next']")).click();
        $(byName("UserPhone")).val("0949111111");
        $(("div.checkbox-ui")).click();
        $(byName("UserEmail")).val("tester256@gmail.com").pressEnter();
    }
}
