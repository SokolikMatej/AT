package org.example.SelenideGauge_PageObject.Tests.Sales;

import com.thoughtworks.gauge.Step;
import org.example.SelenideGauge_PageObject.Pages.LoginPage;
import org.example.SelenideGauge_PageObject.Pages.MainPage;
import org.example.SelenideGauge_PageObject.Pages.SalesPage;

public class ChangeSales {
    LoginPage login = new LoginPage();
    MainPage main = new MainPage();
    SalesPage sales = new SalesPage();

    @Step("User Logs In To SalesForce")
    public void loginToSalesForce() {
        login.loginToFreeTrial();
    }

    @Step("User Navigates To Sales")
    public void navigateToSales() {
        main.navigateToSales();
    }

    @Step("User Changes Sales Goal <sum>")
    public void changeSalesGoal(String sum) {
        sales.editGoal(sum);
    }

    @Step("User Verifies Changed Sales Goal <sum>")
    public void verifyChangedSalesGoal(String sum) {
        sales.verifyGoalValue(sum);
    }
}
