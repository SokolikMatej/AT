package org.example.Selenide_PageObject_Without_BDD.Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

/**
 * Page containing login page elements and methods
 */
public class LoginPage {

    private SelenideElement username = $("#username");
    private SelenideElement password = $("#password");

    public MainPage login() {
        open("https://eu46.lightning.force.com/lightning/page/home");
        username.val("username");
        password.val("password").pressEnter();

        return new MainPage();
    }

    public MainPage loginToFreeTrial() {
        Configuration.timeout = 20000;
        open("https://www.salesforce.com/form/signup/freetrial-elf-v2/?d=cta-li-promo-147");
        $("button#onetrust-accept-btn-handler").click();
        $(byName("UserFirstName")).val("Marian");
        $(byName("UserLastName")).val("Sepela");
        $(byName("UserTitle")).val("QA").pressEnter();
        $(byXpath("//span[text() ='Next']")).click();
        $(byName("UserPhone")).val("0949111111");
        $(("div.checkbox-ui")).click();
        $(byName("UserEmail")).val("tester256@gmail.com").pressEnter();
        //$(byXpath("//div[@role='navigation']/one-app-launcher-header")).should(Condition.visible);
        //$(byXpath("//div[@role='dialog']//button[@title='Close this window']")).click();
        //$(byXpath("//*[@role='dialog']//button[@title='Close']")).click();

        return new MainPage();
    }
}
