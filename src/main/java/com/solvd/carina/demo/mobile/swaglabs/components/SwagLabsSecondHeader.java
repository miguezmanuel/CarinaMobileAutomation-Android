package com.solvd.carina.demo.mobile.swaglabs.components;

import com.solvd.carina.demo.mobile.swaglabs.common.FilterType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SwagLabsSecondHeader extends AbstractUIObject {

    @FindBy(xpath = "//span[@class='title']")
    private ExtendedWebElement productsTitleText;
    @FindBy(xpath = "//*[@class='product_sort_container']")
    private ExtendedWebElement filterButton;
    @FindBy(xpath = "//option[@value='az']")
    private ExtendedWebElement nameAtoZ;
    @FindBy(xpath = "//option[@value='za']")
    private ExtendedWebElement nameZtoA;
    @FindBy(xpath = "//option[@value='lohi']")
    private ExtendedWebElement priceLowToHigh;
    @FindBy(xpath = "//option[@value='hilo']")
    private ExtendedWebElement priceHighToLow;

    public SwagLabsSecondHeader(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public boolean isProductTitleTextPresent () {
        return isProductTitleTextPresent();
    }

    public String productsTitleText () {
        return productsTitleText.getText();
    }

    public void clickFilterButton () {
        filterButton.click();
    }

    public void selectFilterOption (FilterType filterType) {
        filterButton.click();

        switch (filterType) {
            case PRICE_LOW_TO_HIGH:
                priceLowToHigh.click();
                break;
            case PRICE_HIGH_TO_LOW:
                priceHighToLow.click();
                break;
            case NAME_A_TO_Z:
                nameAtoZ.click();
                break;
            case NAME_Z_TO_A:
                nameZtoA.click();
                break;

            default: throw new RuntimeException("filter type does not exist");
        }
    }

}
