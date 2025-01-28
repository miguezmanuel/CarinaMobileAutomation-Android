package com.solvd.carina.demo.mobile;

import com.solvd.carina.demo.mobile.swaglabs.common.pages.HomePageBase;
import com.solvd.carina.demo.mobile.swaglabs.common.pages.LoginPageBase;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest implements IAbstractTest, IMobileUtils {

    @Test
    public void testLogin() {
        LoginPageBase loginPageBase = initPage(getDriver(), LoginPageBase.class);
        HomePageBase homePage = loginPageBase.login();
        Assert.assertTrue(homePage.isPageOpened(), "The Home Page was not open");
    }

}
