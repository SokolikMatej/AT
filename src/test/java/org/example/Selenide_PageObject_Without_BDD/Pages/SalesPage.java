package org.example.Selenide_PageObject_Without_BDD.Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.example.Selenide_PageObject_Without_BDD.Verifications.SalesVerifications;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class SalesPage extends MainPage {

    private SelenideElement editGoalButton = $(byXpath("//span[text()='Goal']/following-sibling::button"));
    private SelenideElement editGoalInput = $(byXpath("//span[text()='EUR']/following-sibling::lightning-input//input[@lightning-input_input]"));
    private SelenideElement editGoalSaveButton = $(byXpath("//button[text()='Save']"));
    public SelenideElement goal = $(byXpath("//span[contains(@class, 'metric') and text() = 'Goal']")).parent();

    public SalesPage() {
    }

    public SalesVerifications changeGoal(String sumToSet) {
        Selenide.sleep(1000);
        editGoalButton.click();
        editGoalInput.should(Condition.editable)
                .val(sumToSet);
        editGoalSaveButton.should(Condition.enabled)
                .click();

        return new SalesVerifications();
    }
}
