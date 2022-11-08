package org.example.Selenide_PageObject_Without_BDD.Tests.Sales;

import org.example.Selenide_PageObject_Without_BDD.Pages.LoginPage;
import org.junit.jupiter.api.Test;

public class ChangeSalesGoal {
    LoginPage main = new LoginPage();

    @Test
    public void changeSalesGoals() {
        String sum = "5000";

        main.loginToFreeTrial()
                .navigateToSales()
                .changeGoal(sum)
                .verifyGoalValue(sum);
    }
}
