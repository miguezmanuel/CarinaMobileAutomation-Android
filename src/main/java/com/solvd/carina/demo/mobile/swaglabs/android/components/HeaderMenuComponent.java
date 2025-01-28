package com.solvd.carina.demo.mobile.swaglabs.android.components;

import com.solvd.carina.demo.mobile.swaglabs.common.components.HeaderMenuComponentBase;
import com.solvd.carina.demo.mobile.swaglabs.common.pages.LoginPageBase;
import com.zebrunner.carina.utils.factory.ICustomTypePageFactory;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HeaderMenuComponent extends HeaderMenuComponentBase implements ICustomTypePageFactory {

    @FindBy(xpath = "//*[@content-desc='test-Menu']/..")
    private ExtendedWebElement header;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Cart']")
    private ExtendedWebElement cartButton;

    public HeaderMenuComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @Override
    public LoginPageBase clickOnCartButton() {
        return initPage(getDriver(), LoginPageBase.class);
    }
}
