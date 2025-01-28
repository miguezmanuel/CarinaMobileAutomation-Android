package com.solvd.carina.demo.mobile.swaglabs.common.pages;

import com.solvd.carina.demo.mobile.swaglabs.android.pages.HomePage;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;


public abstract class LoginPageBase extends AbstractPage {

    protected LoginPageBase(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
    }

    public HomePageBase login() {
        typeUsername("standard_user");
        typePassword("secret_sauce");
        clickLoginButton();
        return initPage(getDriver(), HomePageBase.class);
    }

    public LoginPageBase failedLogin() {
        typeUsername("xxxx");
        typePassword("xxxx");
        clickLoginButton();
        return initPage(getDriver(), LoginPageBase.class);
    }

    public abstract void typeUsername(String username);

    public abstract void typePassword(String password);

    public abstract HomePage clickLoginButton();
}