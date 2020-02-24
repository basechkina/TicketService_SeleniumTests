package com.olga.ticketService.model;

public class User {
    private String userName;
    private String userSurname;
    private String email;
    private String password;
    private String phoneNumber;

    public User withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public User withUserSurname(String userSurname) {
        this.userSurname = userSurname;
        return this;
    }

    public User withEmail(String email) {
        this.email = email;
        return this;
    }

    public User withPassword(String password) {
        this.password = password;
        return this;
    }

    public User withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


}
