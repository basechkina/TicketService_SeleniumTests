package com.olga.ticketService.manager;

import com.olga.ticketService.model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {

    public SessionHelper(WebDriver wd) {
        super(wd);
    }

    public void fillLogInForm(User user) {

        type(By.xpath("//*[@placeholder='Email']"), user.getUserName());
        type(By.xpath("//*[@placeholder='Password']"), user.getPassword());
    }

    public void confirmLogin() throws InterruptedException {
        click(By.xpath("//*[@type='submit']"));
        pause(5000);
    }

    public void loginButton() {
        click(By.xpath("//*[@class = 'link']"));
    }

    public void logoutButton() {
        click(By.xpath("//*[@class='form-btn mb-4 px-5']"));
    }

    public boolean isLogoutButtonPresent() {
        return isElementPresent
                (By.xpath("//*[@class='form-btn mb-4 px-5']"));
    }

    public void registerButton() {
        click(By.xpath("//*[@class='form-btn mb-4 w-100']"));
    }

    public void fillRegistrationFormRequiredFields(User userData) {
        type(By.xpath("//*[@placeholder='Name*']"), userData.getUserName());
        type(By.xpath("//*[@placeholder='Surname*']"), userData.getUserSurname());
        type(By.xpath("//*[@placeholder='Email*']"), userData.getEmail());
        type(By.xpath("//*[@placeholder='Password*']"), userData.getPassword());
        type(By.xpath("//*[@placeholder='Confirm password*']"), userData.getPassword());
        type(By.xpath("//*[@placeholder='Phone number*']"), userData.getPhoneNumber());

    }

    public void checkBox() {
        click(By.xpath("//*[@class='red-text']"));
    }

    public void confirmRegistration() {
        click(By.xpath("//*[@class='form-btn form-btn-short mt-5']"));
    }
}
