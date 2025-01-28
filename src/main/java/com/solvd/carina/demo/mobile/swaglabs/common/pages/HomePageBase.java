package com.solvd.carina.demo.mobile.swaglabs.common.pages;

import com.solvd.carina.demo.mobile.swaglabs.common.components.HeaderMenuComponentBase;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class HomePageBase extends AbstractPage {

    protected HomePageBase(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
    }

    public abstract boolean isCartButtonPresent();

    public abstract HeaderMenuComponentBase getHeaderMenuComponent();


}
