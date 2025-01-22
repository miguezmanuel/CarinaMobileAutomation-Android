package com.solvd.carina.demo.mobile;


import com.solvd.carina.demo.mobile.AutomationExercise.components.AutomationExerciseHeader;
import com.solvd.carina.demo.mobile.AutomationExercise.components.AutomationExerciseLoginForm;
import com.solvd.carina.demo.mobile.AutomationExercise.components.AutomationExerciseSliderCarousel;
import com.solvd.carina.demo.mobile.AutomationExercise.pages.AutomationExerciseAuthPage;
import com.solvd.carina.demo.mobile.AutomationExercise.pages.AutomationExerciseHomePage;
import com.zebrunner.carina.core.IAbstractTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AutomationExerciseTest implements IAbstractTest {

    Logger logger = LogManager.getLogger();

    @Test(dataProvider = "loginData")
    public void test (String email, String password) {
        AutomationExerciseAuthPage authPage = new AutomationExerciseAuthPage(getDriver());
        AutomationExerciseHomePage homePage = new AutomationExerciseHomePage(getDriver());
        AutomationExerciseLoginForm loginForm = authPage.getLoginForm();
        AutomationExerciseSliderCarousel sliderCarousel = homePage.getSliderCarousel();
        AutomationExerciseHeader header = homePage.getHeader();

        getDriver().navigate().to("https://automationexercise.com/");
        logger.info("Checking if the homepage is visible successfully");
        Assert.assertTrue(sliderCarousel.isTestCasesButtonVisible());

        logger.info("navigating to auth section");
        header.clickAuthSectionButton();

        logger.info("verifying if title login is present");
        Assert.assertTrue(loginForm.loginToYourAccountTitleIsVisible());

        logger.info("typing credentials");
        loginForm.typeEmail(email);
        loginForm.typePassword(password);
        loginForm.clickLoginButton();

    }

    @DataProvider(name = "loginData")
    public Object[][] loginData () {
        return new Object[][] {
                {"qwerty7@gmail.com", "qwerty123"}
        };
    }

}
