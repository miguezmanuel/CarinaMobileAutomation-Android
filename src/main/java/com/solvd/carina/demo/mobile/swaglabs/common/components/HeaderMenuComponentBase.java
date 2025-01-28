package com.solvd.carina.demo.mobile.swaglabs.common.components;

import com.solvd.carina.demo.mobile.swaglabs.common.pages.LoginPageBase;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public abstract class HeaderMenuComponentBase extends AbstractUIObject {

    public HeaderMenuComponentBase(WebDriver driver) {
        super(driver);
    }

    public HeaderMenuComponentBase(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public abstract LoginPageBase clickOnCartButton();
}
