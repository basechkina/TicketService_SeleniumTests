package com.olga.ticketService.tests;

import com.olga.ticketService.model.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase {

    @BeforeMethod
    public void ensurePrecondition() {
        if (app.getSessionHelper().isLogoutButtonPresent()) {
            app.getSessionHelper().logoutButton();
        }
    }

    @Test(dataProvider = "requiredFieldsCSV", dataProviderClass = DataProviders.class)
    public void testRegistrationFormRequiredFieldsCSV(User userData) {

        app.getSessionHelper().loginButton();
        app.getSessionHelper().registerButton();
        app.getSessionHelper().fillRegistrationFormRequiredFields(userData);
        app.getSessionHelper().checkBox();
//        app.getSessionHelper().confirmRegistration();

    }
}
