package com.solvd.carina.demo.mobile.swaglabs.android.pages;


import com.solvd.carina.demo.mobile.swaglabs.common.pages.HomePageBase;
import com.solvd.carina.demo.mobile.swaglabs.common.pages.LoginPageBase;
import com.zebrunner.carina.utils.R;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase {

    private static final Log LOGGER = LogFactory.getLog(LoginPage.class);
    @FindBy(xpath= "//input[@name=\"user-name\"]")
    private ExtendedWebElement usernameField;

    @FindBy(xpath= "//input[@name=\"password\"]")
    private ExtendedWebElement passwordField;

    @FindBy(xpath =  "//input[@id=\"login-button\"]")
    private ExtendedWebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public HomePageBase login() {
        usernameField.type("standard_user");
        passwordField.type("secret_sauce");
        loginButton.click();
        return initPage(getDriver(), HomePageBase.class);
    }

    @Override
    public void typeUsername(String username) {
        usernameField.type(username);
    }

    @Override
    public void typePassword(String password) {
        passwordField.type(password);
    }

    @Override
    public HomePage clickLoginButton() {
        loginButton.click();
        return new HomePage(getDriver());
    }
}
