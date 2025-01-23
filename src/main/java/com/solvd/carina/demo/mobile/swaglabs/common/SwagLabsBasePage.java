package com.solvd.carina.demo.mobile.swaglabs.common;

import com.solvd.carina.demo.mobile.swaglabs.components.*;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SwagLabsBasePage extends AbstractPage {

    @FindBy(xpath = "//div[@id='login_button_container']")
    private SwagLabsLoginForm LoginForm;
    @FindBy(xpath = "//div[@class='header_label']")
    private SwagLabsHeader Header;
    @FindBy(xpath = "//div[@class='header_secondary_container']")
    private SwagLabsSecondHeader SecondHeader;
    @FindBy(xpath = "//div[@class='bm-menu']")
    private SwagLabsSideMenu sideMenu;
    @FindBy(xpath = "//div[@class='bm-menu']")
    private SwagLabsInventoryContainer inventoryContainer;
    @FindBy(xpath = "//footer[@class='footer']")
    private SwagLabsFooter footer;
    @FindBy(xpath = "//div[@class='cart_list']")
    private SwagLabsCartList cartList;

    public SwagLabsBasePage(WebDriver driver) {
        super(driver);
    }

    public SwagLabsLoginForm getLoginForm() {
        return LoginForm;
    }

    public SwagLabsHeader getHeader() {
        return Header;
    }

    public SwagLabsSecondHeader getSecondHeader() {
        return SecondHeader;
    }

    public SwagLabsSideMenu getSideMenu() {
        return sideMenu;
    }

    public SwagLabsInventoryContainer getInventoryContainer() {
        return inventoryContainer;
    }

    public SwagLabsFooter getFooter() {
        return footer;
    }

    public SwagLabsCartList getCartList() {
        return cartList;
    }
}
