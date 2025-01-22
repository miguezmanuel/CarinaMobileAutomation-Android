package com.solvd.carina.demo.mobile.swaglabs.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SwagLabsFooter extends AbstractUIObject {

    @FindBy(xpath = "//a[text()='Twitter']")
    private ExtendedWebElement twitterButton;
    @FindBy(xpath = "//a[text()='Facebook']")
    private ExtendedWebElement facebookButton;
    @FindBy(xpath = "//a[text()='LinkedIn']")
    private ExtendedWebElement linkedinButton;
    @FindBy(xpath = "//div[@class='footer_copy']")
    private ExtendedWebElement copyrightMessage;

    public SwagLabsFooter(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void clickTwitterButton () {
        twitterButton.click();
    }

    public void clickFacebookButton () {
        facebookButton.click();
    }

    public void clickLinkedinButton () {
        linkedinButton.click();
    }

    public String getCopyrightMessage () {
        return copyrightMessage.getText();
    }
}
