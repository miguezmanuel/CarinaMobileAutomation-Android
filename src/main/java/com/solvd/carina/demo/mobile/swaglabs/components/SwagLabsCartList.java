package com.solvd.carina.demo.mobile.swaglabs.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SwagLabsCartList extends AbstractUIObject {

    @FindBy(xpath = "//div[@class='inventory_item_name'][text()='%s']/ancestor::div[1]//button")
    private ExtendedWebElement removeButton;
    @FindBy(xpath = "//div[@class='inventory_item_name'][text()='%s']")
    private ExtendedWebElement itemTitle;
    @FindBy(xpath = "//div[@class='inventory_item_name'][text()='%s']/ancestor::div[2]//div[@class='inventory_item_desc']")
    private ExtendedWebElement itemDescription;
    @FindBy(xpath = "//div[@class='inventory_item_name'][text()='%s']/ancestor::div[2]//div[@class='inventory_item_price']")
    private ExtendedWebElement itemPrice;
    @FindBy(xpath = "//div[@class='inventory_item_name']")
    private List<ExtendedWebElement> itemTitlesList;
    @FindBy(xpath = "//div[@class='inventory_item_price']")
    private List<ExtendedWebElement> itemPricesList;

    public SwagLabsCartList(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void clickRemoveButton (String elementName) {
        removeButton.format(elementName).click();
    }

    public String getItemTitle (String elementName) {
        return itemTitle.format(elementName).getText();
    }

    public String getItemDescription (String elementName) {
        return itemDescription.format(elementName).getText();
    }

    public String getItemPrice (String elementName) {
        return itemPrice.format(elementName).getText();
    }

    public List<String> getTitlesList () {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < itemTitlesList.size(); i++) {
            String element = itemTitlesList.get(i).getText();
            list.add(element);
        }

        return list;
    }
}
