package com.solvd.carina.demo.mobile.swaglabs.pages;

import com.solvd.carina.demo.mobile.swaglabs.common.SwagLabsBasePage;
import com.solvd.carina.demo.mobile.swaglabs.components.SwagLabsFooter;
import com.solvd.carina.demo.mobile.swaglabs.components.SwagLabsHeader;
import com.solvd.carina.demo.mobile.swaglabs.components.SwagLabsInventoryContainer;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SwagLabsItemPage extends SwagLabsBasePage {

    @FindBy(xpath = "//button[@data-test='back-to-products']")
    private ExtendedWebElement backToProductsButton;
    @FindBy(xpath = "//button[@data-test='add-to-cart-sauce-labs-backpack']")
    private ExtendedWebElement addToCartButton;
    @FindBy(xpath = "//button[@data-test='remove-sauce-labs-backpack']")
    private ExtendedWebElement removeButton;
    @FindBy(xpath = "//div[@class='inventory_details_name large_size']")
    private ExtendedWebElement itemTitle;
    @FindBy(xpath = "//div[@class='inventory_details_desc large_size']")
    private ExtendedWebElement itemDescription;
    @FindBy(xpath = "//div[@class='inventory_details_price']")
    private ExtendedWebElement itemPrice;

    public SwagLabsItemPage(WebDriver driver) {
        super(driver);
    }

    public boolean isBackToProductsButtonClickable () {
        return addToCartButton.isClickable();
    }

    public void clickAddToCartButton () {
        addToCartButton.click();
    }

    public void clickBackToProductsButton () {
        backToProductsButton.click();
    }

    public boolean isAddToCartButtonClickable () {
        return addToCartButton.isClickable();
    }

    public void clickRemoveButton () {
        removeButton.click();
    }

    public String getItemTitle () {
        return itemTitle.getText();
    }

    public String getItemDescription () {
        return itemDescription.getText();
    }

    public String getItemPrice () {
        return itemPrice.getText();
    }

    @Override
    public SwagLabsHeader getHeader() {
        return super.getHeader();
    }

    @Override
    public SwagLabsFooter getFooter() {
        return super.getFooter();
    }
}
