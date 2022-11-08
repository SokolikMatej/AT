package org.example.Selenide_PageObject_Without_BDD.Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
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
    public SalesPage navigateToSales() {
        mainMenuButton.shouldBe(Condition.visible)
                .click();
        salesMenuButton.click();

        return new SalesPage();
    }

    public ContactsPage navigateToContacts() {
        contactsMenuTabButton.shouldBe(Condition.visible)
                .click();

        return new ContactsPage();
    }

    public MainPage navigateToHome() {
        homeMenuTabButton.shouldBe(Condition.visible)
                .click();

        return this;
    }

    public ChatterPage navigateToChatter() {
        chatterMenuTabButton.shouldBe(Condition.visible)
                .click();

        return new ChatterPage();
    }

    public AccountsPage navigateToAccounts() {
        accountsMenuTabButton.shouldBe(Condition.visible)
                .click();

        return new AccountsPage();
    }

    public ContractsPage navigateToContracts() {
        contractsMenuTabButton.shouldBe(Condition.visible)
                .click();

        return new ContractsPage();
    }

    public CalendarPage navigateToCalendar() {
        calendarMenuTabButton.shouldBe(Condition.visible)
                .click();

        return new CalendarPage();
    }

    public GroupsPage navigateToGroups() {
        groupsMenuTabButton.shouldBe(Condition.visible)
                .click();

        return new GroupsPage();
    }

    public NotesPage navigateToNotes() {
        notesMenuTabButton.shouldBe(Condition.visible)
                .click();

        return new NotesPage();
    }

    public TasksPage navigateToTasks() {
        tasksMenuTabButton.shouldBe(Condition.visible)
                .click();

        return new TasksPage();
    }
}
