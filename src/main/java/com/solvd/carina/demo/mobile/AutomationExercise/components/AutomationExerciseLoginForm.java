package com.solvd.carina.demo.mobile.AutomationExercise.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AutomationExerciseLoginForm extends AbstractUIObject {

    @FindBy(xpath = "//form[@action='/login']/input[@type='email']")
    private ExtendedWebElement emailInput;
    @FindBy(xpath = "//form[@action='/login']/input[@type='password']")
    private ExtendedWebElement passwordInput;
    @FindBy(xpath = "//form[@action='/login']/button")
    private ExtendedWebElement loginButton;
    @FindBy(xpath = "//div[@class='login-form']/h2")
    private ExtendedWebElement loginToYourAccountTitle;

    public AutomationExerciseLoginForm(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void typeEmail (String email) {
        emailInput.type(email);
    }

    public void typePassword (String password) {
        passwordInput.type(password);
    }

    public void clickLoginButton () {
        loginButton.click();
    }

    public boolean loginToYourAccountTitleIsVisible () {
        return loginToYourAccountTitle.isVisible();
    }
}
