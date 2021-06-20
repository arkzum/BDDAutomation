package com.Test.Arunkumar.PageActions;

import com.Test.Arunkumar.PageLocators.HomePageLocators;

public class HomePageActions extends HomePageLocators {

    public void navigateToLogin() {
        click(btnLogin);
    }

    public void enterUser(String value) {
        enterValue(txtUser, value);
    }

    public void enterPassword(String value) {
        enterValue(txtPassword, value);
    }

    public void clickSubmit() {
        click(btnSignin);
    }

    public void signOut() {
        click(btnSignOut);
    }

}
