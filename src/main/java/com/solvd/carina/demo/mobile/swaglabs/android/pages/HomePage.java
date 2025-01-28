package com.solvd.carina.demo.mobile.swaglabs.android.pages;

import com.solvd.carina.demo.mobile.swaglabs.android.components.HeaderMenuComponent;
import com.solvd.carina.demo.mobile.swaglabs.common.components.HeaderMenuComponentBase;
import com.solvd.carina.demo.mobile.swaglabs.common.pages.HomePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase implements IMobileUtils {
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Cart']")
    private ExtendedWebElement cartButton;
    @FindBy(xpath = "//*[@content-desc='test-Menu']/..")
    private HeaderMenuComponent headerMenuComponent;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isCartButtonPresent() {
        return cartButton.isElementPresent();
    }

    public HeaderMenuComponentBase getHeaderMenuComponent(){
        return headerMenuComponent;
    }
}
