package com.solvd.carina.demo.mobile.swaglabs.pages;

import com.solvd.carina.demo.mobile.swaglabs.common.SwagLabsBasePage;
import com.solvd.carina.demo.mobile.swaglabs.components.SwagLabsLoginForm;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SwagLabsLoginPage extends SwagLabsBasePage {

    @FindBy(xpath = "//body/div[1]")
    public ExtendedWebElement titleText;

    public SwagLabsLoginPage(WebDriver driver) {
        super(driver);
    }

    public boolean isTitlePresent () {
        return titleText.isVisible(2);
    }

    @Override
    public SwagLabsLoginForm getLoginForm() {
        return super.getLoginForm();
    }
}
