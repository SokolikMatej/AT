package org.example.SelenideGauge_PageObject.Pages;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

/**
 * Page containing menu button and user manipulation buttons
 */
public class MainPage {

    private SelenideElement mainMenuButton = $(byXpath("//div[@role='navigation']/one-app-launcher-header"));
    private SelenideElement salesMenuButton = $(byXpath("//p[text() = 'Sales']//ancestor::one-app-launcher-menu-item"));
    private SelenideElement homeMenuTabButton = $(byXpath("//a[@title='Home']")).parent();
    private SelenideElement contactsMenuTabButton = $(byXpath("//a[@title='Contacts']")).parent();
    private SelenideElement chatterMenuTabButton = $(byXpath("//a[@title='Chatter']")).parent();
    private SelenideElement accountsMenuTabButton = $(byXpath("//a[@title='Accounts']")).parent();
    private SelenideElement contractsMenuTabButton = $(byXpath("//a[@title='Contracts']")).parent();
    private SelenideElement calendarMenuTabButton = $(byXpath("//a[@title='Calendar']")).parent();
    private SelenideElement groupsMenuTabButton = $(byXpath("//a[@title='Groups']")).parent();
    private SelenideElement notesMenuTabButton = $(byXpath("//a[@title='Notes']")).parent();
    private SelenideElement tasksMenuTabButton = $(byXpath("//a[@title='Tasks']")).parent();

    public void navigateToSales() {
        mainMenuButton.shouldBe(Condition.visible)
                .click();
        salesMenuButton.click();
    }

    public void navigateToContacts() { contactsMenuTabButton.shouldBe(Condition.visible).click(); }

    public void navigateToHome() { homeMenuTabButton.shouldBe(Condition.visible).click(); }

    public void navigateToChatter() { chatterMenuTabButton.shouldBe(Condition.visible).click(); }

    public void navigateToAccounts() { accountsMenuTabButton.shouldBe(Condition.visible).click(); }

    public void navigateToContracts() { contractsMenuTabButton.shouldBe(Condition.visible).click(); }

    public void navigateToCalendar() { calendarMenuTabButton.shouldBe(Condition.visible).click(); }

    public void navigateToGroups() { groupsMenuTabButton.shouldBe(Condition.visible).click(); }

    public void navigateToNotes() { notesMenuTabButton.shouldBe(Condition.visible).click(); }

    public void navigateToTasks() { tasksMenuTabButton.shouldBe(Condition.visible).click(); }
}
