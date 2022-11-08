package org.example.Selenide_PageObject_Without_BDD.Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.github.javaparser.utils.Log;
import org.example.Selenide_PageObject_Without_BDD.Verifications.ContactsVerifications;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ContactsPage {
    public ContactsPage() {
    }

    private SelenideElement selectedListView = $("span.triggerLinkText.selectedListView");
    private SelenideElement allContactOption = $(byXpath("//*[@role='option']//span[text()='All Contacts']"));
    private SelenideElement myContactOption = $(byXpath("//*[@role='option']//span[text()='My Contacts']"));
    private SelenideElement recentlyViewedOption = $(byXpath("//*[@role='option']//span[text()='Recently Viewed']"));
    private SelenideElement recentlyViewedContactsOption = $(byXpath("//*[@role='option']//span[text()='Recently Viewed Contacts']"));
    private SelenideElement contactsTable = $(byXpath("//table[@data-aura-class='uiVirtualDataTable']//tbody"));
    public ElementsCollection contactsTableRows = $$(byXpath("//table[@data-aura-class='uiVirtualDataTable']//tbody//tr"));

    public ContactsVerifications searchContacts(String option) {
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

        return new ContactsVerifications();
    }
}