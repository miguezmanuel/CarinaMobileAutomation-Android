package com.solvd.carina.demo.mobile.swaglabs.common.components;

import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public abstract class LoginFormComponentBase extends AbstractUIObject {

    public LoginFormComponentBase(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public abstract void typeUsername ();

    public abstract void typePassword ();

    public abstract void clickLoginButton ();
}
