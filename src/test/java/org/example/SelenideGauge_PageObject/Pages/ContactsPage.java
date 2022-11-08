package org.example.SelenideGauge_PageObject.Pages;

import com.codeborne.selenide.*;
import com.github.javaparser.utils.Log;
import org.assertj.core.api.Assertions;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ContactsPage {

    private SelenideElement selectedListView = $("span.triggerLinkText.selectedListView");
    private SelenideElement allContactOption = $(byXpath("//*[@role='option']//span[text()='All Contacts']"));
    private SelenideElement myContactOption = $(byXpath("//*[@role='option']//span[text()='My Contacts']"));
    private SelenideElement recentlyViewedOption = $(byXpath("//*[@role='option']//span[text()='Recently Viewed']"));
    private SelenideElement recentlyViewedContactsOption = $(byXpath("//*[@role='option']//span[text()='Recently Viewed Contacts']"));
    private SelenideElement contactsTable = $(byXpath("//table[@data-aura-class='uiVirtualDataTable']//tbody"));
    private ElementsCollection contactsTableRows = $$(byXpath("//table[@data-aura-class='uiVirtualDataTable']//tbody//tr"));

    public ContactsPage() {
    }

    public void searchContacts(String option) {
        selectedListView.should(Condition.enabled)
                .click();

        switch (option) {
            case "All Contacts":
                allContactOption.should(Condition.visible)
                        .click();
                break;
            case "My Contacts":
                myContactOption.should(Condition.visible)
                        .click();
                break;
            case "Recently Viewed'":
                recentlyViewedOption.should(Condition.visible)
                        .click();
                break;
            case "Recently Viewed Contacts":
                recentlyViewedContactsOption.should(Condition.visible)
                        .click();
                break;
            default:
                Log.error("Not supported Search Contact Option");
        }
    }

    public void verifyContact(String name, String email, String accountName) {
        SelenideElement contactsTableRow = contactsTableRows.find(Condition.text(name));
        contactsTableRow.shouldHave(Condition.text(email));
        contactsTableRow.shouldHave(Condition.text(accountName));
    }
}