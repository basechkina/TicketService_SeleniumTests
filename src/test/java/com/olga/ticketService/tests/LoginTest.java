package com.olga.ticketService.tests;

import com.olga.ticketService.model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @BeforeMethod
    public void ensurePrecondition() {
        if (app.getSessionHelper().isLogoutButtonPresent()) {
            app.getSessionHelper().logoutButton();
        }
    }

    @Test
    public void testLogIn() throws InterruptedException {

        app.getSessionHelper().loginButton();
        app.getSessionHelper().fillLogInForm(new User()
                .withUserName("olgatester22@gmail.com")
                .withPassword("gmail12358"));
        app.getSessionHelper().confirmLogin();

        Assert.assertTrue(
                app.getSessionHelper().isLogoutButtonPresent());
    }

}
