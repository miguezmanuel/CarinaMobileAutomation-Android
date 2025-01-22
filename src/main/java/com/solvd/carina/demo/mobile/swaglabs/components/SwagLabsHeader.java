package com.solvd.carina.demo.mobile.swaglabs.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SwagLabsHeader extends AbstractUIObject {

    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
    private ExtendedWebElement sideMenuButton;
    @FindBy(xpath = "//div[@class='app_logo']")
    private ExtendedWebElement title;
    @FindBy(xpath = "//div[@id='shopping_cart_container']")
    private ExtendedWebElement cartButton;

    public SwagLabsHeader(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void clickSideMenuButton () {
        sideMenuButton.click();
    }

    public void clickCartButton () {
        cartButton.click();
    }

    public boolean isCartButtonClickable () {
        return cartButton.isClickable();
    }

    public boolean isTitlePresent () {
        return title.isPresent();
    }

}
