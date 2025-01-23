package com.solvd.carina.demo.mobile.swaglabs.components;

import com.solvd.carina.demo.mobile.swaglabs.pages.SwagLabsItemPage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SwagLabsInventoryContainer extends AbstractUIObject {

    Logger logger = (Logger) LogManager.getLogger(SwagLabsInventoryContainer.class);

    @FindBy(xpath = "//div[@class='inventory_item_name '][text()='%s']")
    private ExtendedWebElement itemTitle;
    @FindBy(xpath = "//div[@class='inventory_item_price'][text()='%s']")
    private ExtendedWebElement itemPrice;
    @FindBy(xpath = "//div[text()='%s']/following::div[@class='inventory_item_desc'][1]")
    private ExtendedWebElement itemDescription;
    @FindBy(xpath = "//img[@alt='%s']")
    private ExtendedWebElement itemImage;
    @FindBy(xpath = "//div[text()='Sauce Labs Backpack']/ancestor::div[@class='inventory_item']//button[text()='Add to cart']")
    private ExtendedWebElement addToCartButton;
    @FindBy(xpath = "//div[text()='Sauce Labs Backpack']/ancestor::div[@class='inventory_item']//button[text()='Remove']")
    private ExtendedWebElement removeItemButton;
    @FindBy(xpath = "//div[@class='inventory_item_name ']")
    private List<ExtendedWebElement> itemsTitleList;
    @FindBy(xpath = "//div[@class='inventory_item_price']")
    private List<ExtendedWebElement> itemsPriceList;

    public SwagLabsInventoryContainer(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public List<String> getItemsTitleList () {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < itemsTitleList.size(); i++) {
            list.add(itemsTitleList.get(i).getText());
        }

        logger.log(Level.INFO, list);
        return list;
    }

    public List<Double> getItemsPriceList () {
        List<Double> list = new ArrayList<>();

        for (int i = 0; i < itemsPriceList.size(); i++) {
            String priceWithDolar = itemsPriceList.get(i).getText();
            String priceWithoutDolar = priceWithDolar.replaceAll("[^\\d.]", "");
            double price = Double.parseDouble(priceWithoutDolar);
            list.add(price);
        }

        logger.info(list);
        return list;
    }

    public void clickAddToCartButton (String elementName) {
        addToCartButton.format(elementName).click();
    }

    public void clickRemoveButton (String elementName) {
        removeItemButton.format(elementName).click();
    }

    public SwagLabsItemPage clickItemTitle (String elementName) {
        itemTitle.format(elementName).click();
        return new SwagLabsItemPage(getDriver());
    }

    public String getItemTitle (String elementName) {
        return itemTitle.format(elementName).getText();
    }

    public String getItemPrice (String elementPrice) {
        return "$" + itemPrice.format(elementPrice).getText();
    }

    public String getDescription (String elementName) {
        return itemDescription.format(elementName).getText();
    }

    public String getImageUrl (String elementName) {
        return itemImage.format(elementName).getAttribute("src");
    }




}
