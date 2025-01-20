package com.solvd.carina.demo.mobile.AutomationExercise.common;


import com.solvd.carina.demo.mobile.AutomationExercise.components.AutomationExerciseHeader;
import com.solvd.carina.demo.mobile.AutomationExercise.components.AutomationExerciseLoginForm;
import com.solvd.carina.demo.mobile.AutomationExercise.components.AutomationExerciseSliderCarousel;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AutomationExerciseBasePage extends AbstractPage {

    @FindBy(xpath = "//div[@id='slider-carousel']")
    private AutomationExerciseSliderCarousel sliderCarousel;
    @FindBy(xpath = "//div[@class='login-form']")
    private AutomationExerciseLoginForm loginForm;
    @FindBy(xpath = "//header")
    private AutomationExerciseHeader header;

    public AutomationExerciseBasePage(WebDriver driver) {
        super(driver);
    }

    public AutomationExerciseSliderCarousel getSliderCarousel() {
        return sliderCarousel;
    }

    public AutomationExerciseLoginForm getLoginForm() {
        return loginForm;
    }

    public AutomationExerciseHeader getHeader() {
        return header;
    }
}
