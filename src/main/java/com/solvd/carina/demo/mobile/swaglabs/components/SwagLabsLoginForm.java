package com.solvd.carina.demo.mobile.swaglabs.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SwagLabsLoginForm extends AbstractUIObject {

    @FindBy(xpath = "//input[@name='user-name']")
    private ExtendedWebElement usernameInputField;
    @FindBy(xpath = "//input[@name='password']")
    private ExtendedWebElement passwordInputField;
    @FindBy(xpath = "//h3[@data-test='error']")
    private ExtendedWebElement errorLoginMessage;
    @FindBy(xpath = "//input[@id='login-button']")
    private ExtendedWebElement loginButton;

    public SwagLabsLoginForm(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public boolean isErrorPresent () {
        return errorLoginMessage.isPresent();
    }

    public String errorMessageText() {
        return errorLoginMessage.getText();
    }

    public void typeUsernameInputField (String username) {
        usernameInputField.type(username);
    }

    public void typePasswordInputField (String password) {
        passwordInputField.type(password);
    }

    public boolean isLoginButtonClickable () {
        return loginButton.isClickable();
    }

    public void clickLoginButton () {
        loginButton.click();
    }

    public void login () {
        usernameInputField.type("standard_user");
        passwordInputField.type("secret_sauce");
        loginButton.click();
    }

}
