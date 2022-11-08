package org.example.SelenideGauge_PageObject.Pages;

import com.codeborne.selenide.*;
import org.assertj.core.api.Assertions;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class SalesPage {

    private SelenideElement editGoalButton = $(byXpath("//span[text()='Goal']/following-sibling::button"));
    private SelenideElement editGoalInput = $(byXpath("//span[text()='EUR']/following-sibling::lightning-input//input[@lightning-input_input]"));
    private SelenideElement editGoalSaveButton = $(byXpath("//button[text()='Save']"));
    private SelenideElement goal = $(byXpath("//span[contains(@class, 'metric') and text() = 'Goal']")).parent();

    public SalesPage() {
    }

    public void editGoal(String sumToSet) {
        Selenide.sleep(1000);
        editGoalButton.click();
        editGoalInput.should(Condition.editable)
                .val(sumToSet);
        editGoalSaveButton.should(Condition.enabled)
                .click();
    }

    public void verifyGoalValue(String sum) {
        String goalValue = goal.should(Condition.visible)
                .getText()
                .replace(",","");
        Assertions.assertThat(goalValue.contains(sum));
    }
}
