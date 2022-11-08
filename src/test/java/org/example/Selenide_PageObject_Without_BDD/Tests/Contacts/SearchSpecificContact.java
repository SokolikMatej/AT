package org.example.Selenide_PageObject_Without_BDD.Tests.Contacts;

import org.example.Selenide_PageObject_Without_BDD.Pages.LoginPage;
import org.junit.jupiter.api.Test;

public class SearchSpecificContact {
    LoginPage main = new LoginPage();

    @Test
    public void searchSpecificContact() {
        String name = "Carole White (Sample)";
        String email = "Global Media (Sample)";
        String accountName = "info@salesforce.com";

        main.loginToFreeTrial()
                .navigateToContacts()
                .searchContacts("All Contacts")
                .verifyContact(name, email, accountName);
    }
}
