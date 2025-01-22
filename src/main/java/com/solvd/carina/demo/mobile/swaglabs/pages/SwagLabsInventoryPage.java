package com.solvd.carina.demo.mobile.swaglabs.pages;

import com.solvd.carina.demo.mobile.swaglabs.common.SwagLabsBasePage;
import com.solvd.carina.demo.mobile.swaglabs.components.*;
import org.openqa.selenium.WebDriver;

public class SwagLabsInventoryPage extends SwagLabsBasePage {
    public SwagLabsInventoryPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public SwagLabsLoginForm getLoginForm() {
        return super.getLoginForm();
    }

    @Override
    public SwagLabsHeader getHeader() {
        return super.getHeader();
    }

    @Override
    public SwagLabsSecondHeader getSecondHeader() {
        return super.getSecondHeader();
    }

    @Override
    public SwagLabsSideMenu getSideMenu() {
        return super.getSideMenu();
    }

    @Override
    public SwagLabsInventoryContainer getInventoryContainer() {
        return super.getInventoryContainer();
    }

    @Override
    public SwagLabsFooter getFooter() {
        return super.getFooter();
    }
}
