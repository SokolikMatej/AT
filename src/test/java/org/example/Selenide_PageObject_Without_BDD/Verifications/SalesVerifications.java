package org.example.Selenide_PageObject_Without_BDD.Verifications;

import com.codeborne.selenide.Condition;
import org.assertj.core.api.Assertions;
import org.example.Selenide_PageObject_Without_BDD.Pages.MainPage;
import org.example.Selenide_PageObject_Without_BDD.Pages.SalesPage;

public class SalesVerifications {
    SalesPage sales = new SalesPage();

    public MainPage verifyGoalValue(String sum) {
        String goalValue = sales.goal.should(Condition.visible)
                                .getText()
                                .replace(",","");
        Assertions.assertThat(goalValue.contains(sum));

        return new MainPage();
    }
}
