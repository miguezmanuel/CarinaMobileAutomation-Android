package com.solvd.carina.demo.mobile.AutomationExercise.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AutomationExerciseHeader extends AbstractUIObject {

    @FindBy(xpath = "//header//a[@href='/login']")
    private ExtendedWebElement authSectionButton;

    public AutomationExerciseHeader(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void clickAuthSectionButton () {
        authSectionButton.click();
    }
}
