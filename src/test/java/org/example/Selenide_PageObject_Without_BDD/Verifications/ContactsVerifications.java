package org.example.Selenide_PageObject_Without_BDD.Verifications;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.example.Selenide_PageObject_Without_BDD.Pages.ContactsPage;
import org.example.Selenide_PageObject_Without_BDD.Pages.MainPage;

public class ContactsVerifications {
    ContactsPage contacts = new ContactsPage();

    public MainPage verifyContact(String name, String email, String accountName) {
        SelenideElement contactsTableRow = contacts.contactsTableRows.find(Condition.text(name));
        contactsTableRow.shouldHave(Condition.text(email));
        contactsTableRow.shouldHave(Condition.text(accountName));

        return new MainPage();
    }
}
