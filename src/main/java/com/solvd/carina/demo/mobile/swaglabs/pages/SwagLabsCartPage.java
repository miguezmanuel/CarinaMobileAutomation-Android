package com.solvd.carina.demo.mobile.swaglabs.pages;

import com.solvd.carina.demo.mobile.swaglabs.common.SwagLabsBasePage;
import com.solvd.carina.demo.mobile.swaglabs.components.SwagLabsCartList;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SwagLabsCartPage extends SwagLabsBasePage {

    @FindBy(xpath = "//button[@id='continue-shopping']")
    private ExtendedWebElement continueShoppingButton;
    @FindBy(xpath = "//button[@id='checkout']")
    private ExtendedWebElement checkoutButton;

    public SwagLabsCartPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public SwagLabsCartList getCartList() {
        return super.getCartList();
    }

    public SwagLabsInventoryPage clickContinueShoppingButton () {
        continueShoppingButton.click();
        return new SwagLabsInventoryPage(getDriver());
    }

    public SwagLabsCheckoutPage clickCheckoutButton () {
        checkoutButton.click();
        return new SwagLabsCheckoutPage(getDriver());
    }
}
