package com.solvd.carina.demo.mobile.swaglabs.components;

import com.solvd.carina.demo.mobile.swaglabs.pages.SwagLabsHomePage;
import com.solvd.carina.demo.mobile.swaglabs.pages.SwagLabsInventoryPage;
import com.solvd.carina.demo.mobile.swaglabs.pages.SwagLabsLoginPage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SwagLabsSideMenu extends AbstractUIObject {

    @FindBy(xpath = "//a[@id='inventory_sidebar_link']")
    private ExtendedWebElement allItemsButton;
    @FindBy(xpath = "//a[@id='about_sidebar_link']")
    private ExtendedWebElement aboutButton;
    @FindBy(xpath = "//a[@id='logout_sidebar_link']")
    private ExtendedWebElement logoutButton;
    @FindBy(xpath = "//a[@id='reset_sidebar_link']")
    private ExtendedWebElement resetAppStateButton;
    @FindBy(xpath = "//button[@id='react-burger-cross-btn']")
    private ExtendedWebElement closeButton;

    public SwagLabsSideMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public SwagLabsInventoryPage clickAllItemsButton () {
        allItemsButton.click();
        return new SwagLabsInventoryPage(getDriver());
    }

    public SwagLabsHomePage clickAboutButton () {
        aboutButton.click();
        return new SwagLabsHomePage(getDriver());
    }

    public SwagLabsLoginPage clickLogoutButton () {
        logoutButton.click();
        return new SwagLabsLoginPage(getDriver());
    }

    public void clickResetAppStateButton () {
        resetAppStateButton.click();
    }

    public void clickCloseButton () {
        closeButton.click();
    }

    public boolean isCloseButtonClickable () {
        return closeButton.isClickable();
    }

}
