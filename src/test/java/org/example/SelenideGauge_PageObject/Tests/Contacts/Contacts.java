package org.example.SelenideGauge_PageObject.Tests.Contacts;

import com.thoughtworks.gauge.Step;
import org.example.SelenideGauge_PageObject.Pages.ContactsPage;
import org.example.SelenideGauge_PageObject.Pages.MainPage;

public class Contacts {
    MainPage main = new MainPage();
    ContactsPage contacts = new ContactsPage();

    @Step("User Navigates To Contacts")
    public void navigateToContacts() {
        main.navigateToContacts();
    }

    @Step("User Searches All Contacts")
    public void searchAllContacts() {
        contacts.searchContacts("All Contacts");
    }

    @Step("User Verifies Contact with name <name>, email <email> and Account name <accountName>")
    public void verifyContact(String name, String email, String accountName) {
        contacts.verifyContact(name, email, accountName);
    }
}
